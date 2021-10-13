package ex12inheritance;
/*
 오버라이딩(Overriding)
    : 클래스가 상속관계에 있을때 하위클래스에서 상위클래스의
    멤버메서드와 완전히 동일한 모양으로 재정의 하는것을 말한다.
    오버로딩과 다른점은 매개변수의 갯수, 반환타입 등이 완전히
    똑같은 형태로 재정의 한다는 것이다.
    하위클래스에서 오버라이딩한 메서드는 상위클래스의 메서드를
    가리게되므로 항상 최하위 클래스에서 오버라이딩한 메서드가
    호출된다.
 */
//일반적인 스피커를 추상화
class Speaker {
	private int volumnRate;// 볼륨
	//외부에서 변수설정이 가능한 setter메서드
	public void setVolumn(int vol) {
		volumnRate = vol;
	}
	//상속관계에서 오버라이딩을 목적으로 정의한 메서드
	public void showState() {
		System.out.println("스피커의 볼륨크기:"+ volumnRate);
	}
}
//일반적인 스피커의 기능에 중저음이 보강된 스피커를 추상화
class BaseSpeaker extends Speaker {
	//베이스 기능을 확장
	private int baseRate;
	public void setBase(int bas) {
		baseRate = bas;
	}
	/*
	 @Override : '어노테이션'이라 부르고 오버라이딩된 메서드에
	 추가하여 컴파일러에게 알려주는 역할을 한다.
	 */
	@Override
	public void showState() {
		/*
		 super를 통해 부모클래스에 정의된 멤버메서드를 호출한다.
		 특히, 오버라이딩 된 메서드를 호출할때 super가 없으면
		 재귀호출이 되므로 반드시 기술해야 한다.
		 */
		super.showState();
		System.out.println("베이스의 볼륨크기:"+ baseRate);
	}
}
public class E06Overriding
{

	public static void main(String[] args)
	{
		//자식클래스의 객체 생성
      BaseSpeaker baseSpeaker = new BaseSpeaker() ;
      baseSpeaker.setVolumn(10);
      baseSpeaker.setBase(20);
      baseSpeaker.showState();/*
           자식 객체로 호출하였으므로 자식 클래스에서 오버라이딩한
           showState() 메서드가 호출된다. 부모쪽의 메서드는
           가려지게된다.
           */
      
      System.out.println();
      
      /*
       부모클래스의 참조변수로 자식클래스의 객체를 참조할 수 있다.
       상속관계가 있으므로 가능하다.
       
       부모타입으로 자식객체를 참조하면 접근범위가 부모객체까지로
       제한된다. 즉 setBase()는 자식쪽 멤버메서드 이므로 호출할 수 없다.
       */
      Speaker speaker = new BaseSpeaker();
      speaker.setVolumn(30);
     // speaker.setBase(40);
      speaker.showState();
	}

}

package ex11static;
/*
 싱글톤 디자인 패턴
    : 클래스를 설계하는 디자인패턴의 하나로써 하나의 인스턴스
    즉 하나의 메모리를 생성해 이를 공유해서 사용하고자 할때
    쓰는 패턴이다.
 작성방법
    1.생성자의 접근지정자를 private으로 정의한다.
    2.클래스 외부에서는 생성자를 통해 접근할 수 없으므로
        new를 통해 객체생성은 할수없다.
    3.클래스 내부에 정적메서드로 해당 클래스의 객체를
        반환하도록 정의한다. => getInstance()
    4.위 방법을 통해 객체를 생성하면 메모리에 딱 하나의
        객체만 만들어지게 된다.           
 */

//일반적인 클래스
class NoSingleTone {
	int instVar;
	public NoSingleTone() {
		
	}
}
//싱글톤 패턴이 적용된 클래스
class SingleTone{
	int shareVar;
	/*
	 JVM(자바가상머신)에 의해 프로그램이 시작될때 정적변수는 미리
	 메서드영역에 생성되어 사용할 준비를 마치게된다.
	 */
	private static SingleTone single = new SingleTone();
	/*
	 생성자를 private으로 선언하면 클래스 외부에서는 호출할 수
	 없으므로, new 키워드를 통해 객체를 생성할 수 없게된다.
	 */
	private SingleTone() {
		//기본생성자
	}
	/*
	 정적메서드로 선언된 getInstance() 메서드에서 해당 객체를
	 외부로 반환한다.
	 */
	public static SingleTone getInstance() {
		return single;
	}
	void print() {
		System.out.println(String.format("shareVar=%d", shareVar));
	}
}
public class E03SingleToneDesignPattern
{

	public static void main(String[] args)
	{
		/*
		 일반적인 방식의 객체생성이므로 객체를 생성할때마다 새로운
		 참조값(주소값)을 할당받는 인스턴스가 된다.
		 */
     NoSingleTone nst1 = new NoSingleTone();
     nst1.instVar =100;
     System.out.println("nst1="+ nst1);
     
     NoSingleTone nst2 = new NoSingleTone();
     nst2.instVar = 200;
     System.out.println("nst2=" + nst2);
     
     //SingleTone st1 =new SingleTone();
     
     SingleTone st2 = SingleTone.getInstance();
     st2.shareVar=100;
     st2.print();
     
     SingleTone st3 = SingleTone.getInstance();
     st3.shareVar = 200;
     st3.print();
     
     System.out.println(String.format("st2의 주소:%s", st2));
     System.out.println(String.format("st3의 주소:%s", st3));
     
     System.out.println(String.format("st2의 shareVar:%d", st2.shareVar));
     System.out.println(String.format("st3의 shareVar:%d", st3.shareVar));
     
     
	}

}

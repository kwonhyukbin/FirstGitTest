package ex13interface;


abstract class AbsClass {
	public static final int MAX_INT = Integer.MAX_VALUE;
	
	int instanceVar;
	static int staticVar;
	
	void instanceMethod() {}
	static void staticMethod() {}
}
class AbsClassChild extends AbsClass {
	int newVar;
	void newMethod() {
		
	}
	@Override
	void instanceMethod()
	{
		System.out.println("필요없다면 오버라이딩 하지않아도 상관없다.");
	}
}
abstract class AbsClass3 {
	abstract void absMethod(int number);
}
class AbsClassChild4 extends AbsClass3 {

	@Override
	void absMethod(int number)
	{
		System.out.println("부모클래스에서 오버라이디한 메소드로 없을땐"
				+ "에러발생함.");
	}
	void newMethod() {
		System.out.println("자식클래스에서 새롭게 확장한 메소드");
	}
}
public class E01AbstractBasicpp
{

	public static void main(String[] args)
	{
		//추상클래스는 객체를 생성할 수 없다.
     //AbsClass1 absClass1 = new AbsClass1();
     //AbsClassChild1 absClassChild1 = new AbsClassChild1();
	}
       //추상클래스로 인스턴스 생성은 할수없지만, 참조변수로
	   //사용하는것은 가능하다.
	
	/*
	 추상클래스내에 선언된 정적멤버메서드느 오버라이딩 대상이
	 아니므로 static의 기본규칙을 따른다. 즉 클래스명으로 접근가능
	 */
}

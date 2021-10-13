package ex08class;

/*
 해당 예제에서는 Human클래스를 외부파일로 선언하였다.
 동일한 패키지에 정의된다면 컴파일러는 해당 클래스를 찾아
 즉시 객체(인스턴스)화 할수있다.
 만약 다른 패키지에 선언된 클래스라면 반드시 import선언을
 해야한다.
 */

public class E02HumanMain
{

	public static void main(String[] args)
	{
        //1. 객체생성
		 Human human = new Human();
		//2. 객체초기화 
		 human.name = "마이클";
		 human.age = 28;
		 human.energy =4;
		 
		 //3.멤버메소드를 통해 걷다 등의 행동을 구현하다.
		 human.showState();
		 human.eating();
		 human.walk();
		 human.thinking();
		 human.showState();
		 
		 //4.반복문을 통해 에너지를 고갈시켜본다. walk()20번 호출
		 for(int i=1;i<=20;i++)	{
			 human.walk();
		 }
		 human.showState();
		 
		 //5.에너지가 최대치를 넘는지 확인해본다.
		 for(int i=1;i<20;i++) {
			 human.eating();
		 }
		 human.showState();
	}

}

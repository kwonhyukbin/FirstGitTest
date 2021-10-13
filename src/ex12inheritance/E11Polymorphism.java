package ex12inheritance;

/*
 다형성(polymorphism)
 : 같은 타입의 참조변수를 통해 다양한 객체를 이용할 수 있는
  특성을 말한다. 단, 객체간에는 상속관계가 있어야 한다.
  
  - 부모의 참조변수로 자식객체를 참조
  1. 이경우 부모타입의 참조변수는 부모로부터 상속받은 멤버까지만
      접근할 수 있다.
  2.자식에서 오버라이딩한 메서드가 우선 호출된다.
  3.자식에서 새롭게 정의한 멤버는 접근할 수 없다.
  4.이런경우를 이질화(Heterogeneous:헤테로지니어스)라고 한다.
  
      -같은 타입의 참조변수로 객체 참조
      1.객체 전체를 접근할 수 있다.즉 클래스의 일반적인 규칙이 적용된다.
      2.이 경우를 동질화(Homogeneous:호모지니어스)라고 한다.
 */
class Parent {
	int parentMember;
	
	void parentMethod() {
		System.out.println("부모의 메소드:parentMethod()");
	}
}
class Child extends Parent {
	//확장한 멤버변수
	int childMember;
	//확장한 멤버메서드
	void childMethod() {
		System.out.println("자식의 메소드: childMethod");
	}
	//부모에서 정의한 메서드를 오버라이딩 하여 재정의한 메서드
	@Override
	void parentMethod()
	{
		System.out.println("자식에서 Overriding한 메소드"+"parentMethod()");
	}
	//오버로딩된 메서드(확장한 메서드)
	void parentMethod(int childMember) {
		this.childMember =childMember;
		System.out.println("Overloading:자식에서 확장한 메소드"
				  + ":parentMethod(param1)");
	}
}
public class E11Polymorphism
{

	public static void main(String[] args)
	{
		
		//동질화 : 자신의 참조변수로 자신의 객체를 참조
         Child homeChild = new Child() ;
         
         homeChild.childMember =10;//자식 멤버변수
         homeChild.parentMember =100;//부모 멤버변수
         homeChild.childMethod();
         homeChild.parentMethod(1000);//오버로딩 한 메서드
         homeChild.parentMethod();//오버라이딩 한 메서드
         //동질화의 경우 객체 전체를 접근할 수 있다.
         
         /*
          이질화: 부모타입의 변수로 자식 객체를 참조하는것.
              이경우 자식에서 새롭게 정의한 멤버에는 접근할 수 없다.
              만약 접근해야 한다면 자식타입으로 강제형변환(다운캐스팅)
              해야한다.
          */
         System.out.println("[부모타입에 자식타입의"+"메모리 주소 복사");
         Parent parent1 = homeChild;
         parent1.parentMember =1;
         //parent1.childMember =1;//접근불가-> 부모타입으로 자식멤버에 접근X
         parent1.parentMethod();//오버라이딩 한 메서드이므로 자식쪽이 호출된다.
         
         Parent parent2 = new Child();
         parent2.parentMember=1;
         parent2.parentMethod();
         
         //자식쪽 멤버에 접근하는 방법1 : 다운캐스팅 후 접근한다.
         ((Child)parent2).childMember=1;
         ((Child)parent2).childMethod();
         ((Child)parent2).parentMethod();
         
         //방법2 : 자식타입의 참조변수에 할당한 후 접근한다.
         Child child2 = (Child)parent2;
         child2.childMember =1;
         child2.childMethod();
         child2.parentMethod(1);
         
         /*
          Java에서 생성한 모든 클래스는 직/간접적으로 Object클래스를
          상속한다. 따라서 모든 객체는 Object의 참조변수로 참조 가능하다.
          또한 Object클래스에 정의된 모든 메서드를 별도의 선언없이
          사용할 수 있다.
          */
      
         Object object = new Child();
         ((Parent)object).parentMethod();
         
         
	}

}

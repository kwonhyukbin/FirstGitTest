package ex12inheritance;

class Parent1 {
	int parentMember;
	
	void parentMethod() {
		System.out.println("부모의메소드:parentMethod()");
	}
}
class Child1 extends Parent {
	int childMember;
	
	void childMethod() {
		System.out.println("자식의메소드:childMethod()");
	}
	
	@Override
	void parentMethod()
	{
		System.out.println("자식에서 Overriding한 메소드"+"parentMethod()");
	}
	
	void parentMethod(int childMember) {
		this.childMember = childMember;
		System.out.println("Overloading:자식에서 확장한 메소드"+
		               "parentMethod(param1)");
	}
}

public class E11Polymorphismpp
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
        
        System.out.println("[부모타입에 자식타입의"+"메모리 주소 복사]");
        
        Parent parent1 = homeChild;
        parent1.parentMember =1;
        parent1.parentMethod();
        
        //
        Parent parent2 = new Child();
        parent2.parentMember =1;
        parent2.parentMethod();
        
        ((Child)parent2).childMember=1; //형변환 다운캐스팅
        ((Child)parent2).childMethod();
        ((Child)parent2).parentMethod();
        
        
        Child child2 = (Child)parent2;//자식타입의 참조변수에 할당한 후 접근
        child2.childMember =1;
        child2.childMethod();
        child2.parentMethod(1);
        
        Object object = new Child();
        ((Parent)object).parentMethod();
        
	}

}

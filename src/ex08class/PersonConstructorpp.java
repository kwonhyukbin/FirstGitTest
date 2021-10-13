package ex08class;

public class PersonConstructorpp
{
    
	String name;
	int age ; 
	String addr ;
	
	
	public PersonConstructorpp() {
		name = "이름없음";
		age = 0;
		addr = "주소미상";
		System.out.println("나는 기본생성자 입니다.");
	}
	public PersonConstructorpp(String name) {
		this.name = name;
		age = 1;
		addr = "출처불명";
	}
	public PersonConstructorpp(String name , int age) {
		this(name,age,"미상");
		System.out.println("나는 인자생성자[2]입니다");
	}
	public PersonConstructorpp(String _name ,int age , String addr) {
		name = _name;
		this.age =age;
		this.addr = addr;
		System.out.println("나는 인자생성자[3]입니다.");
	}
	
	
	public static void main(String[] args)
	{

	}

}

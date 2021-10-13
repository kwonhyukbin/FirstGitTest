package ex12inheritance;
//친구의 정보를 저장할 클래스
class MyFriendInfo {
	private String name;
	int age;
	
	public MyFriendInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
public void showMyFriendinfo() {
	System.out.println("이름:"+ name);
	System.out.println("나이:"+ age);
}
}

class MyFriendDetailInfo extends MyFriendInfo {
	private String addr;
	private String phone;
	
	public MyFriendDetailInfo(String name, int age, String addr, String phone) {
		super(name,age);
	this.addr = addr;
	this.phone = phone;
	}
	public void showMyFriendDetailInfo() {
		showMyFriendinfo();
		System.out.println("주소:"+addr);
		System.out.println("전화:"+phone);
	}
}

class QuMyFriendDetailInfo
{

	public static void main(String[] args)
	{
		MyFriendDetailInfo  info = new MyFriendDetailInfo("이순신",100,"성균관",
    		   "010-1000-8888");
       info.showMyFriendDetailInfo();
    		   
	}

}

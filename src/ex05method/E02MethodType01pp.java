package ex05method;

public class E02MethodType01pp {
	
	static void noParamNoReturn() {
		System.out.println("==메뉴를 선택하세요==");
		System.out.println("1.열기 , 2.계속하기,3.종료");
		System.out.println("=====================");
	}
	static void noParamNoReturn2() {
		
	}
	static void noParamNoReturn2(int a) {
		
	}
	static void noParamNoReturn3() {
		int returnValue = 89;
		System.out.println("[Retrun문 이전]");
		
		//return;
		
		if(returnValue%2==0) {
			System.out.println(returnValue +"는 짝수");
			return;
		}
		
		System.out.println(returnValue +"는 홀수");
		System.out.println("[return문 이후]");
	}
	public static void main(String[]args) {
		noParamNoReturn();
		noParamNoReturn2();
		noParamNoReturn3();
	}
}


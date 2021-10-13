package ex05method;

import java.util.Scanner;

public class E01MethodBasicpp {
 
	public static int simpleFunc(int a, int b) {
		int sum =a+b;
		return sum;
	}



	public static void  menuPrint() {
		System.out.println("당신의 이름은 무엇인가요?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		namePrint(name);
	}
	public static void namePrint(String n) {
		System.out.println("제이름은"+ n +"입니다.");
	}
	public static void main(String[]args) {
		int result = simpleFunc(1,2);
		System.out.println("1과2를 전달한 결과"+ result);
		System.out.println("10과20을 전달한 결과:"+ simpleFunc(10,20));
		
		menuPrint();
	}
	{
		

	}

}

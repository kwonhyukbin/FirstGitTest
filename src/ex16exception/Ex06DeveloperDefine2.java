package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;


class AgeErrorException2 extends Exception {
	public AgeErrorException2() {
		super("나이 입력이 잘못 되었어요");
	}
}

public class Ex06DeveloperDefine2
{

	public static void main(String[] args)
	{
     System.out.print("나이를 입력하세요 : ");
     
    	 int age = readAge();
    	 System.out.println("당신의 나이는"+age +"입니다.");
     }
     
	
     public static int readAge() {  
    	 Scanner sc = new Scanner(System.in);
    	 int inputAge =0;
    	 try {
    		 //만약 문자를 입력했다면 이 부분에서 예외처리한다.
    		 inputAge = sc.nextInt();
    	 }
    	 catch(InputMismatchException e) {
    		 e.printStackTrace();
    		 System.exit(0);
    	 }
    	 try {
    	     if(inputAge<0) {
    		     AgeErrorException2 ex = new AgeErrorException2();
    		     throw ex;
    	 }
    	 }
    	 catch (AgeErrorException2 e) {
    		 /*
    		  나이는 음수가 없으므로 예외가 발생된 경우에는 0으로
    		  강제 초기화 한다.
    		  */
    		 inputAge = 0;
    		 System.out.println(e.getMessage());
    	 }
    	 
    	 return inputAge;
     }
}

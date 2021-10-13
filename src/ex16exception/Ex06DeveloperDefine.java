package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 사용자정의 예외클래스
 1.Exception 클래스를 상속한다.
 2.생성자에서 예외발생시 출력할 메시지를 super()를 통해 입력한다.
 3.예외 발생 지점에서 if문으로 감싼후 예외객체를 생성하고 throw한다.
 4.catch문에서 예외객체를 받아 처리한다.
 */
class AgeErrorException extends Exception {
	public AgeErrorException() {
		super("나이 입력이 잘못 되었어요");
	}
}

public class Ex06DeveloperDefine
{

	public static void main(String[] args)
	{
     System.out.print("나이를 입력하세요 : ");
     
     try {
    	 /*
    	  readAge()메서드에서 예외가 발생하여 예외객체가 throw되면
    	  이 분에서 예외처리한다...
    	  */
    	 int age = readAge();
    	 System.out.println("당신의 나이는"+age +"입니다.");
     }
     catch(AgeErrorException e) {
    	 System.out.println("[예외발생]"+e.getMessage());
     }
	}
     public static int readAge() throws AgeErrorException {  
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
    	 //나이가 음수값으로 입력되면 개발자정의 예외객체를 생성한후 throw한다.
    	 if(inputAge<0) {
    		 AgeErrorException ex = new AgeErrorException();
    		 throw ex;
    		 //throw하면 반드시 catch해야 한다. 그렇지 않으면 프로그램이 종료된다.
    	 }
    	 return inputAge;
     }
}

package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 finally절
  : 예외발생과 상관없이 try문에 진입했을때 반드시 실행해야
  할 코드가 있는경우 기술하는 블럭이다.
  즉 try문으로 진입하지 않는다면 finally절은 실행되지 않는다.
 */
public class Ex05Finally
{
	/*
	 런타임 예외가 발생되는 메소드. 예외발생시 무시하기 위해
	 throws하고있다. 하지만 이와같은 예외는 어디서든 반드시
	 예외처리해야한다.
	 */
    static void runtime() throws NumberFormatException{
    	Integer.parseInt("백");
    }
    
    static void tryCatchFinally() {
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.print("나이를 입력하세요:");
    	int age = Integer.MAX_VALUE;
    	try {
    		age = scan.nextInt();//30살과 같이 입력하면 예외발생
    		System.out.println("당신은 5년후"+ (age+5)+"살 입니다.");
    		return;
    	}
    	catch(InputMismatchException e) {
    		System.out.println("나이는 숫자만 쓰세요.");
    	}
    	finally {
    		/*
    		 try문 진입후 예외발생 여부에 상관없이 해당 구문은 실행된다.
    		 또한 try문에서 return을 만나도 해당 구문은 실행된다.
    		 */
    		System.out.println("항상 실행되는 finally절 입니다.");
    		//프로그램 자체를 종료할때 사용
    		//System.exit(0);
    	}
    }
	
	public static void main(String[] args)
	{   
		/*
		 만약 이 지점에서도 예외던지를 하면 프로그램은 즉시 중지된다.
		 즉 반드시 처리해야할 예외가 존재한다.
		 */
        try {
        	runtime();
        }
        catch(NumberFormatException e) {
        	e.printStackTrace();
        }
		tryCatchFinally();
		
		System.out.println("메인메소드 끝");
	}

}

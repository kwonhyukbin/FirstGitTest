package ex05method;

import java.util.Scanner;

public class QuCircleCalculatortt 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.print("반지름을 입력하세요:");
		double rad = scanner.nextDouble();
		circleArea(rad);
	    //반환값이 있는 메서드문으로 print문 안에서 호출한다.
        System.out.println("원의둘레는:"+circleRound( rad) );
		
	}
	//반환값이 없으므로 매개변수를 받은후 결과를 즉시 출력한다.
    static void circleArea(double radian ) {
    	double result = 3.14 * radian * radian;
    	System.out.println("원의넓이는:"+result);
    }
    static double circleRound(double radian ) {
    	return(2 * 3.14* radian);
    }
}

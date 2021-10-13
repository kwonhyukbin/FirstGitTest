package ex04controlstatement;

import java.io.IOException ;
;

/*
 하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
(System.in.read()를 사용하세요)
 */
public class Qu_04_01 
{



	public static void main(String[] args) throws IOException
	{
	    
	   System.out.println("하나의 문자를 입력하세요.");
	   int result = System.in.read();
	   
	   
	   
	   String numberResult = (result>='0' && result <='9') ? "숫자입니다":"숫자가 아닙니다.";
	   System.out.println(numberResult);
	   }
		
	}



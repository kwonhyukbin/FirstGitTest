package ex04controlstatement;

import java.io.IOException;

public class Qu_04_01tt 
{

	public static void main(String[] args) throws IOException
	{
		System.out.print("하나의 문자를 입력하세요:");
		int ascii = System.in.read();
		
		/*
		 삼항연산자의 형식
		    변수= (조건식) ? "참일때":"거짓일때" ;
		 */
		//아스키 코드를 알고 있을때(47~58사이)
		String result=(ascii>=47 && ascii<=58) ? "숫자입니다":"숫자가 아닙니다.";
		System.out.println((char)ascii+"는 "+result);
		//아스키 코드를 모를때
		result=(ascii>='0' && ascii<='9') ? "숫자입니다":"숫자가 아닙니다.";
		System.out.println((char)ascii+"는 "+result);
	}

}

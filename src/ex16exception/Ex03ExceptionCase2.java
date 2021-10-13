package ex16exception;

import java.io.IOException;

/*
 예외처리방법3
   : 예외가 발생한 위치에서는 처리하지 않고 호출한 지점으로
   예외객체를 던진다. 그리고 호출한 지점에서 예외를 처리한다.
 */
public class Ex03ExceptionCase2
{

	static void compileFunc() throws IOException
	{

		System.out.print("하나의 문자를 입력하세요:");
		int userChr = System.in.read();
		System.out.println("입력한 문자는 : " + (char) userChr);

	}

	public static void main(String[] args)
	{
		try
		{
			compileFunc();

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

package ex05method;

import java.util.Scanner;

public class QuSimpleOperation 
{

	public static void main(String[] args)
{
	Scanner scanner =new Scanner(System.in);
	 System.out.println("첫번째 정수를 입력하세요");
	 int i = scanner.nextInt();
	 System.out.println("두번째 정수를 입력하세요");
	 int j = scanner.nextInt();
	 arithmetic(i ,j) ;
		 
	 }
		static void arithmetic(int i,int j) {
			int a = i+j;
			System.out.println("덧셈결과->"+ a);
			int b = i-j;
			System.out.println("뺄셈결과->"+b);
			int c = i*j;
			System.out.println("곱셈결과->"+c);
			int d = i/j;
			System.out.println("나눗셈 몫->"+d);
			int e = i%j;
			System.out.println("나머지->"+e);
			
		}
	}



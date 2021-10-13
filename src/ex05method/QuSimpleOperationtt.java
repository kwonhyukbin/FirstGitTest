package ex05method;

import java.util.Scanner;

/*
 문제5-1) 파일명 : QuSimpleOperation.java (난이도:하)
두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
파라메타(인자)로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.

 */
public class QuSimpleOperationtt {

	//반환값은 없고,매개변수만 있는 메소드
     static void arithmetic(int n1,int n2) {
    	System.out.printf("덧셈:%d + %d =%d\n",n1,n2,(n1+n2));
    	System.out.printf("뺄셈:%d - %d =%d\n",n1,n2,(n1-n2));
    	System.out.printf("곱셈:%d * %d =%d\n",n1,n2,(n1*n2));
    	System.out.printf("나눗셉:%d / %d =%d\n",n1,n2,(n1/n2));
    	System.out.printf("나머지:%d %% %d =%d\n",n1,n2,(n1%n2));
     }
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner (System.in);
        System.out.print("정수 1을 입력:");
        int num1=scanner.nextInt();
        System.out.print("정수 2을 입력:");
        int num2=scanner.nextInt();
        arithmetic(num1,num2);
	}

}

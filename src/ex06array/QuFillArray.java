package ex06array;

import java.util.Scanner;

/*
 
 길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받아 순서대로 저장한다.
(첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 
채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)

 */

public class QuFillArray
{

	public static void main(String[] args)
	{
		int arr1[] = new int[10];// 배열할 정수 10개 선언
		int arr2[] = new int[10];// 홀짝 걸러낼 정수 선언
		Scanner scanner = new Scanner(System.in);

		int indexStart = 0;// arr2 배열의 시작인덱스와 마지막인덱스를 변수에 저장
		int indexEnd = arr2.length - 1;

		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println("정수를 입력하세요");
			int inputNum = scanner.nextInt();

			arr1[i] = inputNum;

			if (inputNum % 2 == 0)
			{

				arr2[indexEnd--] = inputNum;
			} else
			{
				arr2[indexStart++] = inputNum;
			}
			
			
		}
		for(int i =0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i = 0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}

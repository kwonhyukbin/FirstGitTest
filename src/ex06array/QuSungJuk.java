package ex06array;

import java.util.Scanner;

/*
 다음 조건에 맞는 프로그램을 작성하시오.
1] 학생수를 사용자로부터 입력받는다.
	-Scanner클래스 사용
2] 입력받은 학생수만큼 국영수 점수를 저장할 수 있는 int형 배열을 선언한다.
3] 다시 학생수만큼 각 학생의 국영수 점수를 입력받아 2]에서 생성한 배열에 저장한다.
	-Scanner클래스 사용
4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력하여라. 
5] 이 문제는 2차원 배열을 활용하는 문제이다.

 */
public class QuSungJuk
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생수 입력");
		int numberOfStudent = scanner.nextInt();

		int[][] jumsuArr = new int[numberOfStudent][5];

		for (int i = 0; i < numberOfStudent; i++)
		{

			System.out.print("국어점수 입력:");
			int kor = scanner.nextInt();
			System.out.print("영어점수 입력:");
			int eng = scanner.nextInt();
			System.out.print("수학점수 입력:");
			int math = scanner.nextInt();
			jumsuArr[i][0] = kor;
			jumsuArr[i][1] = eng;
			jumsuArr[i][2] = math;

		}

		for (int i = 0; i < numberOfStudent; i++)
		{
			int sum = 0;
			for (int j = 0; j < 3; j++)
			{
				sum += jumsuArr[i][j];
			}
			jumsuArr[i][3] = sum;
			jumsuArr[i][4] = sum / 3;
		}
		System.out.printf("No kor eng math Tot avg%n");
		for (int i = 0; i < numberOfStudent; i++)
		{
			System.out.printf(i + 1 + " ");

			for (int j = 0; j < 5; j++)
			{

				System.out.printf("%4d ", jumsuArr[i][j]);

				System.out.println();
			}
		}
	}
}
package ex02variable;

/*
 국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
 */
public class Qu_02_02 
{

	public static void main(String[] args) 
	{
		int kor = 99 , eng = 80, math = 96 ;
		double avg=(kor+eng+math) /3.0;
		int avg1 =(int) ((kor+eng+math) /3.0) ;
		System.out.printf("평균점수(실수형):%f%n",avg);
		System.out.printf("평균점수(정수형):%d",avg1);

	}

}

package ex02variable;

public class Qu_02_03tt 
{

	public static void main(String[] args) 
	{
		//원주율은 변하지 않는 값이므로 상수로 선언한다.
		final double  PI = 3.14;
		int radian=10; //반지름
		int area_int ; //정수형 넓이
		double area_double;//실수형 넓이
		
	    area_double = radian * radian * PI;
	    area_int=(int)(radian * radian * PI);//방법1
	    area_int=(int)area_double;//방법2
	    
	    System.out.println("int형:"+area_int);
	    System.out.println("double형:"+area_double);
		//System.out.println("double형:"+(radian * radian * PI));//계산과 출력을 한번에.

	}

}

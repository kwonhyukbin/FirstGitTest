package ex09package;

//둘레를 구하기 위한Circle 클래스 임포트
import ex09package.kosmo.perimeter.Circle;

public class CircleMain
{

	public static void main(String[] args)
	{
		//넓이를 구하기 위한 Circle클래스는 풀경로를 통해 객체생성
		ex09package.kosmo.area.Circle circle1=
				new ex09package.kosmo.area.Circle(6.5);
		System.out.println("반지름이 6.5인 원의넓이:"
				+ circle1.getArea());
		
		//둘레를 구하기 위한 객체생성
		Circle circle2 = new Circle(4.5);
		System.out.println("반지름이 4.5인 원의둘레:"
				+ circle2.getPerimeter());

	}

}

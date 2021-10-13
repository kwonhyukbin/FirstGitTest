package ex13interface.figure;

/*
 원은 반지름만 있으면 넓이를 구할수 있으므로 FigureData 클래스는
 상속하지 않는다.
 */
public class Circle implements IFigure,IDrawable 
	
 
{
	//반지름을 표현한 멤버변수
 int radius;
 public Circle(int radius) {
	 this.radius = radius;
 }
    /*
     인터페이스에 정의된 추상메서드를 필수로 오버라이딩 해야한다.
     */
	@Override
		public void draw(String figureName)
		{
             System.out.println(figureName+"을 그립니다");			
		}
	@Override
		public void area(String figureName)
		{
              System.out.println(figureName+"의 면적(r*r*PI):"+radius*radius*Math.PI);			 
              //Math클래스의 상수 PI를 통해 원주율을 사용할 수 있다.
		}

}

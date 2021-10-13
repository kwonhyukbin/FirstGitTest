package ex13interface.figure;
/*
 삼각형을 표현한 클래스로
    상속과 구현은 사각형과 동일하다.
 */
public class Triangle extends FigureData implements IFigure, IDrawable 
{
   public Triangle(int width,int height) {
	   super(width,height);
   }
   
   @Override
	public void draw(String figureName)
	{
		System.out.println(figureName+"을 그려봅니다");
	}
	@Override
		public void area(String figureName)
		{
        System.out.println(figureName+"의 면적은(가로*세로*0.5):"+(width*height*0.5));			
		}

}

package ex12inheritance;

class Rectangle {
	
	int wid;
	int leg;
	
	public Rectangle(int wid, int leg) {
		this.wid= wid;
		this.leg= leg;
	}
	void ShowAreainfo( ) {
		if(this.wid == this.leg) {
			System.out.println("정사각형입니다");
		}
		else {
			System.out.println("직사각형입니다.");
		}
		System.out.println("면적="+(wid*leg));
	}
}
class Square extends Rectangle {
	public Square(int square) {
		super(square,square);
	}
}
public class QuRectangleMain
{

	public static void main(String[] args)
	{
     Rectangle rec = new Rectangle(4,3);
     rec.ShowAreainfo();
     
     Square sqr = new Square(7);
     sqr.ShowAreainfo();
	}

}

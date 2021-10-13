package ex04controlstatement;

public class Qu_04_06 
{

	public static void main(String[] args) 
	{
		int a=0;
		while (a<5) {
			int b =0;
			while(b<=a) {
				System.out.print("*");
				b++;
			}
			System.out.println();
			a++;
		}
	}
}

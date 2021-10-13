package ex06array;

public class E01OneDimArray01pp
{

	public static void main(String[] args)
	{
		int[] numArr = new int[3];
		numArr[0] =10;	
		numArr[1] =20;	
		numArr[2] =30;
		
		System.out.println("배열명(numArr)="+ numArr);
		System.out.println("numArr 2번방의 값:"+ numArr[2]);
		System.out.println("===============================");
		
		int[] arrNumber = new int [40];
		for(int i=0; i<arrNumber.length; i++) {
			arrNumber[i] = i +10;
		}
		for(int i=0; i<4;i++) {
			System.out.println(i+"번방의값="+ arrNumber[i]);
		}
		System.out.println("===================================");
		
		String[] strArr = new String[3];
		strArr[0]="java";
		strArr[1]="jsp";
		strArr[2]="spring";
		for(int j=0 ; j<strArr.length;j++) {
			System.out.println(strArr[j]);
		}
		System.out.println("===================================");
		}

}

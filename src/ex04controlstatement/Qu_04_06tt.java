package ex04controlstatement;

import ex01start.E02SystemOutPrintln;

/*
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class Qu_04_06tt 
{

	public static void main(String[] args) 
	{
		int i =1;
		while (i<=10) {
			int j=1;
			while (j<=i) {
				
				System.out.print("* ") ;
				j++;
			}
			System.out.println(" ");
			i++;
		}

	}

}

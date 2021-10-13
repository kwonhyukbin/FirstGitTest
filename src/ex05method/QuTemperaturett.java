package ex05method;

import java.util.Scanner;

public class QuTemperaturett {

	//섭씨 -> 화씨.
	static double celsiusToFahrenheit(double cel) {
		double fah = 1.8 * cel +32;
		return fah;
	}
	
	
	
	//화씨 -> 섭씨
	static double fahrenheitToCelsius(double fah) {
		
		return (fah -32) / 1.8;
	}
	public static void main(String[] args) 
	{
     Scanner scanner = new Scanner(System.in);
     System.out.println("섭씨 23도=>화씨="+celsiusToFahrenheit(23));
     System.out.println("화씨 98도=>섭씨="+fahrenheitToCelsius(98.3));
	}

}

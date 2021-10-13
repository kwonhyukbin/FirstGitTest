package ex05method;

import java.util.Scanner;

public class QuTemperature
{
static double celsiusToFahrenheit(double cel) {
	   double fah = 1.8 * cel + 32;
	   return fah;
}
static double 	fahrenheitToCelsius(double fah) {
	   return (fah-32)/1.8;
}
public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
System.out.println("섭씨23->화씨"+celsiusToFahrenheit(23));
System.out.println("화씨98->섭씨"+fahrenheitToCelsius(98));
	}
}


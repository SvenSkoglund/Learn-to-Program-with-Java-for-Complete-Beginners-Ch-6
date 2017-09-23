/*Write a program that accepts a Fahrenheit 
temperature as input and converts it into a 
Celsius temperature, which it prints out.*/

package Labs;

public class FahrToCel
{
	public static void main ( String [] Args)
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		float fahr = 0f;
		float cel = 0f;
		
		System.out.println();
		System.out.print("Please enter the temperature in fahrenheit: ");
		fahr = scanner.nextFloat();
		scanner.close();
		
		
		cel = (fahr-32f)*(5f/9f);
		System.out.println();
		System.out.println("The temperature in celcius is : " + cel);

	}
}
		
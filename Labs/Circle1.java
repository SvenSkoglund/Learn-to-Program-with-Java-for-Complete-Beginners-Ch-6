/* Write a program that prompts the user to enter the radius of a circle, 
and reads the user's input into a floating-point variable. 
Have the program calculate the circumference of the circle, 
and print out both the radius and the circumference. */

package Labs;

public class Circle1
{
	public static void main ( String [] Args)
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		float rad = 0f;
		float circ = 0f;
		
		System.out.println();
		System.out.print("Please enter the radius of the circle: ");
		rad = scanner.nextFloat();
		scanner.close();
		
		
		circ = (2f * 3.14159265F) * rad;
		System.out.println();
		System.out.print("The radius of the circle is : " + rad);
		
		System.out.println();
		System.out.print("The circumference of the circle is : " + circ);
		
	}
}
		
/*Modify your solution to Circle1.java 
so that it also prints out the circle's area*/

package Labs;

public class Circle2
{
	public static void main ( String [] Args)
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		float rad = 0f;
		float circ = 0f;
		float area = 0f;
		
		System.out.println();
		System.out.print("Please enter the radius of the circle: ");
		rad = scanner.nextFloat();
		scanner.close();
		
		
		circ = (2f * 3.14159265F) * rad;
		area = rad * rad * 3.14159265F;
		System.out.println();
		System.out.println("The radius of the circle is : " + rad);
		
		System.out.println();
		System.out.println("The circumference of the circle is : " + circ);
		
		System.out.println();
		System.out.println("The area of the circle is : " + area);

	}
}
		
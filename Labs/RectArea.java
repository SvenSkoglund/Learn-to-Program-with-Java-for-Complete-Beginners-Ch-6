/* Write a program that prompts for x and y 
coordinates for the upper left and lower right 
corners of a rectangle, and calculates and 
prints the rectangle's area */

package Labs;

public class RectArea {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        float xUL = 0.0F, yUL = 0.0F, xLR = 0.0F, yLR = 0.0F;
		float area = 0.0F;
		
		
		System.out.println();
		System.out.println("***********************************");
        System.out.println("This program calculates the area of");
        System.out.println(" a square given coordinate of the");
        System.out.println("upper left and lower right corners");
		System.out.println("***********************************");
		System.out.println();

		
		System.out.print("Enter the x coordinate of the upper left corner: ");
        xUL = scanner.nextFloat();
        System.out.print("Enter the y coordinate of the upper left corner: ");
        yUL = scanner.nextFloat();
        System.out.print("Enter the x coordinate of the lower right corner: ");
        xLR = scanner.nextFloat();
        System.out.print("Enter the y coordinate of the lower right corner: ");
        yLR = scanner.nextFloat();
		System.out.println();
		
        // Calculate the result and store it in the variable average:
        area = ((xLR - xUL)*(yUL-yLR));

        System.out.print("The area of the square is ");
        System.out.println(area);

        scanner.close();
    }
}

/*Write a program that reads two integers 
(a dividend and a divisor) from the user into variables and
divides the first integer by the second (with a statement 
to print the result). Test the program several times with 
different values. What happens when the first number isn't
evenly divisible by the second? What happens when you 
enter zero for the second number? */


package Labs;

public class divide {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int a = 0;
		int b = 0; 


        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
		System.out.print("Enter the second number: ");
        b = scanner.nextInt();

		scanner.close();
		System.out.println();
        System.out.println( a + " divided by " + b + " equals " + (a%b));
   }
}

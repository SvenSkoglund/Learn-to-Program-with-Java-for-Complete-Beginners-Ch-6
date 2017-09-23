/*Write a program that accepts the amount of a 
restaurant check and calculates the tip amount 
for a 10%, 15%, and 20% tip. */


package Labs;

public class tipcalc {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        float bill = 0.0F;


        System.out.print("Enter the total amout of the bill: $");
        bill = scanner.nextFloat();

		scanner.close();
		System.out.println();
        System.out.println("10% Tip: " + (bill * .1f));
        System.out.println("15% Tip: " + (bill * .15f));        
        System.out.println("20% Tip: " + (bill * .2f));   
   }
}

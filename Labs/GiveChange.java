/*Write a program that accepts the amount of a 
restaurant check and calculates the tip amount 
for a 10%, 15%, and 20% tip. */


package Labs;

public class GiveChange {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        float bill = 0.0F;
		float given = 0f;


        System.out.print("Enter the total amout of the bill: $");
        bill = scanner.nextFloat();        
		System.out.print("Enter the total amout given: $");
        given = scanner.nextFloat();

		float change =  bill - given;
		
		scanner.close();
		System.out.println();
        System.out.println("Change equals $" + change);
   }
}

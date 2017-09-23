/*Write a program that accepts the amount of a 
restaurant check and calculates the tip amount 
for a 10%, 15%, and 20% tip. */


package Labs;

public class GiveChange2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        float bill = 0.0F;
		float given = 0f;


        System.out.print("Enter the total amout of the bill: $");
        bill = scanner.nextFloat();        
		System.out.print("Enter the total amout given: $");
        given = scanner.nextFloat();

		float change =  given - bill;
		
		scanner.close();
		System.out.println();
        System.out.println("Change equals $" + change);
		
		
		
		/*(Optional) For Double Extra Bonus Credit, 
		have your program calculate the number of each type 
		of coin necessary to make the change*/
		
		int ichange = (int) (change * 100f);
		
		int twenty = ichange / 2000;
		int tr = ichange % 2000;
		int ten = tr / 1000;
		int tr2 = tr % 1000;
		int five = tr2 / 500;
		int fr = tr2 % 500;
		int one = fr / 100;
		int oner = fr % 100;
		
		
		
		int quarters = oner / 25;
		int r1 = oner % 25;
		int dimes = r1 / 10;
		int r2 = r1 % 10;
		int nickels = r2 / 5;
		int pennies = r2 % 5;
		
		
		System.out.println("Number of $20: " + twenty);
		
		System.out.println("Number of $10: " + ten);
		
		System.out.println("Number of $5: " + five);
		
		System.out.println("Number of $1: " + one);
		
		System.out.println("Number of Quarters: " + quarters);
		
		System.out.println("Number of Dimes: " + dimes);
		
		System.out.println("Number of Nickels: " + nickels);
		
		System.out.println("Number of Pennies: " + pennies);
   }
}

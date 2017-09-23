/* Write a program that accepts numeric values for the total daily rainfall for a week. Print the daily
rainfall and calculate and print the total rainfall for the week, as well as the average rainfall for the
week */

package Labs;

public class DailyRainfall {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        float mon = 0.0F, tue = 0.0F, wed = 0.0F, thu = 0.0F, fri = 0.0F, sat = 0.0F, sun = 0.0F;
        float average = 0.0F;

        System.out.println("Enter the rainfaill in inches for: ");
        System.out.print("       Mon: ");
        mon = scanner.nextFloat();
        System.out.print("       Tue: ");
        tue = scanner.nextFloat();
        System.out.print("       Wed: ");
        wed = scanner.nextFloat();
        System.out.print("       Thu: ");
        thu = scanner.nextFloat();
        System.out.print("       Fri: ");
        fri = scanner.nextFloat();
        System.out.print("       Sat: ");
        sat = scanner.nextFloat();		
        System.out.print("       Sun: ");
        sun = scanner.nextFloat();		
		
		
		
        // Calculate the result and store it in the variable average:
        average = (mon + tue + wed + thu + fri + sat + sun) / 7;

        System.out.print("The weekly average is ");
        System.out.println(average + " inches");

        scanner.close();
    }
}

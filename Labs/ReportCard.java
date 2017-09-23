/* Write a program that accepts five numeric grades 
for classes that a student has taken. Print a report
card and calculate a grade point average */

package Labs;

public class ReportCard {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        float math = 0.0F, sci = 0.0F, art = 0.0F, hist = 0.0F, eng = 0.0f ;
		float average = 0.0F;

        System.out.println("Enter the grade earned in: ");
        System.out.print("       Math: %");
        math = scanner.nextFloat();
        System.out.print("       Science: %");
        sci = scanner.nextFloat();
        System.out.print("       Art: %");
        art = scanner.nextFloat();
        System.out.print("       History: %");
        hist = scanner.nextFloat();
        System.out.print("       English: %");
        eng = scanner.nextFloat();
		
		
		
		
        // Calculate the result and store it in the variable average:
        average = (math + sci + art + hist + eng)/5;

        System.out.print("Average GPA is %");
        System.out.println(average);

        scanner.close();
    }
}

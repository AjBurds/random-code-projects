import java.util.Scanner;

public class grades {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        double[] grades = new double [10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter grade #" + (i+1) + ": ");
            while (!input.hasNextDouble()) {
                System.out.println("Error invalid input. Please enter a number.");
                input.next();
            }
            grades[i] = input.nextDouble();
        }

        double sum = 0;
        double max = grades[0];
        double min = grades[0];
        for (double grade : grades) {
            sum += grade;
            if (grade > max) {
                max = grade;
            }
            if (grade < min) {
                min = grade;
            }
        }
        double average = sum / grades.length;

        System.out.printf("Average grade: %.2f\n", average);
        System.out.printf("Minimum grade: %.2f\n", min);
        System.out.printf("Maximum grade: %.2f\n", max);
    }
}
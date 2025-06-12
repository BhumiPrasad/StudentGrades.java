import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        int choice;

        System.out.println("=== Student Grades Program ===");

        // Input loop
        do {
            System.out.print("Enter student grade (0-100): ");
            int grade = scanner.nextInt();

            // Check for valid grade
            if (grade >= 0 && grade <= 100) {
                grades.add(grade);
            } else {
                System.out.println("Invalid grade. Please enter a number between 0 and 100.");
            }

            System.out.print("Do you want to add another grade? (1 for Yes / 0 for No): ");
            choice = scanner.nextInt();
        } while (choice == 1);

        // Check if any grades were entered
        if (grades.size() == 0) {
            System.out.println("No grades entered.");
        } else {
            // Calculate average, highest, and lowest
            int sum = 0;
            int highest = grades.get(0);
            int lowest = grades.get(0);

            for (int grade : grades) {
                sum += grade;
                if (grade > highest) highest = grade;
                if (grade < lowest) lowest = grade;
            }

            double average = (double) sum / grades.size();

            // Output results
            System.out.println("\n--- Results ---");
            System.out.println("Number of students: " + grades.size());
            System.out.println("Average score: " + average);
            System.out.println("Highest score: " + highest);
            System.out.println("Lowest score: " + lowest);
        }

        scanner.close();
    }
}
package activity1;

import java.util.Scanner;



public class Activity1 {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Class Name: activity1");
        System.out.println("------------------------");

        System.out.print("Enter student name: ");
        String studentName = input.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = input.nextInt();

        int[] grades = new int[numSubjects];
        int sum = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter grade for sub" + (i + 1) + ": ");
            grades[i] = input.nextInt();
            sum += grades[i];
        }

        double average = (double) sum / numSubjects;

        System.out.printf("\nAverage: %.2f\n", average);

        if (average >= 75) {
            System.out.println("Remarks: PASSED");
        } else {
            System.out.println("Remarks: FAILED");
        }

        input.close();
    }
}



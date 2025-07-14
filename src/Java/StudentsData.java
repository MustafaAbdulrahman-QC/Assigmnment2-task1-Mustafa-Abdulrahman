package Java;

import java.util.Scanner;

public class StudentsData {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student number: ");
        int studentsNum = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= studentsNum; i++) {
            System.out.println("\nStudent number" + i);

            System.out.print("Enter your student name: ");
            String name = input.nextLine();

            System.out.print("Enter score 1: ");
            double score1 = input.nextDouble();

            System.out.print("Enter score 2: ");
            double score2 = input.nextDouble();

            System.out.print("Enter score 3: ");
            double score3 = input.nextDouble();
            input.nextLine();

            double average = calculateAverage(score1, score2, score3);
            String grade = determineGrade(average);

            System.out.println("Name: " + name);
            System.out.printf("Average: %.2f\n", average);
            System.out.println("Grade: " + grade);
        }

        input.close();
    }


    public static double calculateAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }


    public static String determineGrade(double avg) {
        if (avg >= 85) {
            return "A";
        } else if (avg >= 70) {
            return "B";
        } else if (avg >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}


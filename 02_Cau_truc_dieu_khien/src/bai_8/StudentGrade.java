package bai_8;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the test score: ");
        double testScore = scanner.nextDouble();

        System.out.println("Enter the midterm exam score: ");
        double midtermScore = scanner.nextDouble();

        System.out.println("Enter the final exam score: ");
        double finalScore = scanner.nextDouble();

        double averageScore = (testScore + midtermScore + finalScore) / 3.0;
        String grade;

        if (averageScore >= 9.0) {
            grade = "A";
        } else if (averageScore >= 7.0) {
            grade = "B";
        } else if (averageScore >= 5.0) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
    }
}


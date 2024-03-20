import javax.swing.*;
import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Student name");
        String name = scanner.nextLine();

        System.out.println("Enter student roll number ");
        int rollnum = scanner.nextInt();

        System.out.println(" Total mark of 3 Subject ");
        int science = scanner.nextInt();
        int History = scanner.nextInt();
        int Biology = scanner.nextInt();

        System.out.println(" marks in Science " + science);
        System.out.println(" marks in History " + History);
        System.out.println(" marks in Biology " + Biology);

        int totalMarks = science + History + Biology;
        System.out.println(" Total marks " + totalMarks);
        float percentage = (float) ((totalMarks / (300.0)) * 100);
        System.out.println(" percentage: " + percentage + "  ");

        String result; // result of student pass or failed
        if (percentage >= 35) {
            result = " pass ";
        } else {
            result = " failed ";
        }
        System.out.println(" Result " + result);

        String grade;
        if (percentage >= 90) {
            grade = " A+ ";
            System.out.println("Grade : " + grade);
        } else if (percentage >= 60) {
            grade = " A ";
            System.out.println("Grade : " + grade);
        } else if (percentage >= 50) {
            grade = " B ";
            System.out.println("Grade : " + grade);

        } else if (percentage >= 35) {
            grade = " C ";
            System.out.println("Grade : " + grade);

        }
    }
}










import java.util.Scanner;

public class StudentPercentage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter Student name ");
        String name = scanner.nextLine();

        System.out.println(" Enter Student roll number");
        int rollnum = scanner.nextInt();

        System.out.println(" Total marks of 3 Subject  ");
        int Eng = scanner.nextInt();
        int Guj = scanner.nextInt();
        int Hindi = scanner.nextInt();

        System.out.println(" Marks in Eng " + Eng);
        System.out.println(" Marks in Guj " + Guj);
        System.out.println(" Marks in Hindi " + Hindi);

        int totalMarks = Eng + Guj + Hindi;
        System.out.println( " Total marks " + totalMarks); // total marks
        double percentage = (totalMarks / 3.0); //
        System.out.println( " percentage " + percentage + " % " ); // percentage

// if the student has pass or failed
        String result;
        if (percentage >= 35)
        {result = " Pass ";
        }else
        { result = " Fail";}
        System.out.println( " Result " + result); // find a Result

        // assign grade

        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else  if (percentage >=60) {
            grade = " A ";
        }else  if ( percentage >= 50){
            grade = " B ";
        } else if (percentage >= 35) {
            grade = " C ";
        }else
        {  grade = " D ";

        }
        System.out.println( " Grade " + grade);// find a grade

    }
}

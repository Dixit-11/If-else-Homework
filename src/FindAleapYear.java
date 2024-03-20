import java.util.Scanner;

public class FindAleapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" please enter year ");
        int year = scanner.nextInt();

        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " Is a leap year"  );
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println( year + "Is a leap year " );
        } else {
            System.out.println( year + " This is not a leap year " );

        }
    }
}
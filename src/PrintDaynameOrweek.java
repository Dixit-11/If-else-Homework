import java.util.Scanner;

public class PrintDaynameOrweek {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1 - 7) representing the day of the week:");

        int dayNumber = scanner.nextInt();

        String dayName = scanner.nextLine();

        if (dayNumber == 1){
            dayName = " Monday";
        }else if (dayNumber == 2) {
            dayName = " Tuesday ";
        } else if (dayNumber == 3) {
            dayName = " Wednesday ";
        } else if ( dayNumber == 4) {
            dayName = " Thursday";
        } else if ( dayNumber == 5) {
            dayName = " Friday ";
        } else if (dayNumber == 6) {
            dayName = " Saturday";
        }else if ( dayNumber == 7){
            dayName = " Sunday ";
        }
        System.out.println("Today is " + dayName );

    }
}

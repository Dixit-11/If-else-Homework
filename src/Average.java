import java.util.Scanner;

public class Average {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println( " Enter five Number ");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        System.out.println(" number1 " + number1 );
        System.out.println(" number2 " + number2);
        System.out.println(" number3 " + number3);
        System.out.println(" number4 " + number4);
        System.out.println(" number5 " + number5);

        int total = number1 + number2 + number3 + number4 + number5 ;
        System.out.println( " Total " + total);
        double average = (total / 5.0);
        System.out.println(" Average " + average);



    }


}

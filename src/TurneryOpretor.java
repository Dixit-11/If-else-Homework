import java.util.Scanner;


public class TurneryOpretor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a=  scanner.nextInt();
        System.out.println("Enter second number ");
        int b = scanner.nextInt();
                        // condition ?      (first action) :      (second action )
         String result = (a % 2 == 0) ? " The number is even ": " The number is odd ";
         System.out.println("First number : "  +result );

        String result2 = (b % 2 == 0) ? " The number is even ": " The number is odd ";
        System.out.println("Second number : "  +result2 );


    }
}



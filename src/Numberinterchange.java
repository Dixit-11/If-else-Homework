import java.nio.file.FileVisitOption;
import java.util.Scanner;

public class Numberinterchange {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter First Number ");
        double Firstnumber = scanner.nextDouble();

        System.out.println("Enter second Number");
        double Secondnumber = scanner.nextDouble();

        double temp;

        // interchange the values if the first number is greater than the second number
        if (Firstnumber > Secondnumber){
            temp = Firstnumber;
            Firstnumber = Secondnumber;
            Secondnumber = temp;
        }
        System.out.println("First Number" + Firstnumber);
        System.out.println("Second Number" +Secondnumber);



    }
}

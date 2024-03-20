import java.util.Scanner;

public class AtoFcityname  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet from 'a' to 'f': ");
        char alphabet = scanner.next().charAt(0);

        String cityName;
        //updating city name
        // Check the input alphabet and print the corresponding city name
        if (alphabet == 'a' || alphabet == 'A') {
            cityName = "Ahmedabad";
        } else if (alphabet == 'b' || alphabet == 'B') {
            cityName = "Brazil";
        } else if (alphabet == 'c' || alphabet == 'C') {
            cityName = "Canada";
        } else if (alphabet == 'd' || alphabet == 'D') {
            cityName = "Denmark";
        } else if (alphabet == 'e' || alphabet == 'E') {
            cityName = "Egypt";
        } else if (alphabet == 'f' || alphabet == 'F') {
            cityName = "France";
        } else {
            cityName = "Invalid entry";
        }

        System.out.println("City name: " + cityName);

        scanner.close();
    }
}

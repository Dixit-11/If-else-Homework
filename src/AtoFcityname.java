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
            cityName = "Ibiza";
        } else if (alphabet == 'c' || alphabet == 'C') {
            cityName = "Toronto";
        } else if (alphabet == 'd' || alphabet == 'D') {
            cityName = "New York";
        } else if (alphabet == 'e' || alphabet == 'E') {
            cityName = "Rome";
        } else if (alphabet == 'f' || alphabet == 'F') {
            cityName = "Northampton";
        } else {
            cityName = "Invalid entry";
        }

        System.out.println("City name: " + cityName);

        scanner.close();
    }
}

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a temperature in Fahrenheit.");
        double Fahren = in.nextDouble();
        System.out.println("Enter a wind speed.");
        double Windspeed = in.nextDouble();

        double WindChill = (35.74 + 0.6215 * (Fahren)) + (0.4275 * (Fahren) - 35.75) * Math.pow(Windspeed, 0.16);

        System.out.println("Temperature: " + Fahren);
        System.out.println("Wind speed: " + Windspeed);
        System.out.print("Wind chill: ");
        System.out.printf("%,.2f", WindChill);
    }
}
 //Done
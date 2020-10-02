import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Centimeters: ");
        int centimeters = in.nextInt();
        int kilometer = (centimeters - centimeters % 100000) / 100000;
        centimeters %= 100000;
        int meters = (centimeters - centimeters % 100) / 100;
        centimeters %= 100;


        System.out.print("\nKilometers: ");
        System.out.printf("%,d", kilometer);
        System.out.print("\nMeters: ");
        System.out.printf("%,d", meters);
        System.out.print("\nCentimeters: ");
        System.out.printf("%,d", centimeters);
    }
}

//Done
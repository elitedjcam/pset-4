import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the diameter of a circle.");
        double diameter = in.nextDouble();

        double radius = diameter / 2;

        double area = Math.PI * Math.pow(radius, 2);
        double circum = 2 * Math.PI * radius;

        System.out.println("Diameter: " + diameter);
        System.out.print("\nArea: ");
        System.out.printf("%,.2f", area);
        System.out.print("\nCircumference: ");
        System.out.printf("%,.2f", circum);
    }
}

//Done
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Side length: ");
        double side = in.nextDouble();

        double area = ((3 * Math.pow(3, 0.5)) / 2) *  Math.pow(side, 2);
        double perimeter = side * 6;

        System.out.print("Side: ");
        System.out.printf("%,.2f", side);
        System.out.print("\n");
        System.out.print("\nArea: ");
        System.out.printf("%,.2f", area);
        System.out.print("\nPerimeter: ");
        System.out.printf("%,.2f", perimeter);
    }
}

//Done
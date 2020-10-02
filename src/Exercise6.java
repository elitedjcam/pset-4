import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of a rectangle.");
        double length = in.nextDouble();
        System.out.println("Enter the width of a rectangle.");
        double width = in.nextDouble();

        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        double diagonal = Math.pow(Math.pow(length, 2) + Math.pow(width, 2), 0.5);

        System.out.print("Length: ");
        System.out.printf("%,.2f", length);
        System.out.print("\nWidth: ");
        System.out.printf("%,.2f", width);
        System.out.print("\n");
        System.out.print("\nArea: ");
        System.out.printf("%,.2f", area);
        System.out.print("\nPerimeter: ");
        System.out.printf("%,.2f", perimeter);
        System.out.print("\nDiagonal: ");
        System.out.printf("%,.2f", diagonal);
    }
}

//Done
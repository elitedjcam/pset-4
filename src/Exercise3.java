import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.printf("%-13s: ", "Length");
        double length = s.nextDouble();
        System.out.printf("%-13s: ", "Width");
        double width = s.nextDouble();
        System.out.printf("%-13s: ", "Diameter");
        double diameter = s.nextDouble();

        double SurfArea = (length * width) - (0.5 * 0.5 * diameter * diameter * 3.1415);
        System.out.printf("%n%-13s: %,.2f", "Surface Area", SurfArea);

    }

}

//Done
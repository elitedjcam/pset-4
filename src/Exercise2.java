import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.printf("%-7s: ", "Inches");
        int Inches = s.nextInt();

        int miles = (Inches - Inches % (5280 * 12)) / (5280 * 12);
        Inches -= miles * (5280 * 12);
        int feet = (Inches - Inches%(12))/(12);
        Inches -= feet * (12);

        System.out.printf("%n%-7s: %,d", "Miles", miles);
        System.out.printf("%n%-7s: %,d", "Feet", feet);
        System.out.printf("%n%-7s: %,d", "Inches", Inches);

    }

}

//Done
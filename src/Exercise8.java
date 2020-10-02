import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Text: ");
        String text = in.next();
        int length = text.length();
        int half = length / 2;
        String output = (text.substring(half, length).concat(text.substring(0, half))).toUpperCase().concat(".");

        System.out.print(output);
    }
}

//Done
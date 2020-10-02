import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("First name");
        String fname = in.next();
        System.out.println("Middle name");
        String mname = in.next();
        System.out.println("Last name");
        String lname = in.next();

        String initials = (fname.substring(0,1) + mname.substring(0,1) + lname.substring(0,1)).toUpperCase();
        System.out.printf("%n" + initials + ".");
    }
}

//Done
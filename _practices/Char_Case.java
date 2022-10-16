import java.util.Scanner;

public class Char_Case {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char val = scn.next().charAt(0);
        if (Character.isUpperCase(val))
            System.out.println(1);
        else if (Character.isLowerCase(val))
            System.out.println(0);
        else
            System.out.println(-1);

    }
}

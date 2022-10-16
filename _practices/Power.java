import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        // this code will give you x^n(i.e n raise to the power of x)
        // input will be like: 3 4 = 81


        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int x = sn.nextInt();
        System.out.println((int) Math.pow(n, x));
    }
}


// Thanks for visit--
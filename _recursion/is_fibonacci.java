import java.util.*;

public class is_fibonacci {
    static boolean isPerfectSquare(int x){
        int s = (int) Math.sqrt(x);
        return s*s == x;
    }

    static boolean isFibo(int n){
        return isPerfectSquare((5*n*n)+4) || isPerfectSquare((5*n*n)-4);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (isFibo(n)==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

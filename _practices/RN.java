import java.util.*;
public class RN {

    public static int Reverse(int n){
        int re=0, rm=0;
        while (n!=0){
        if (n<10){
            rm = (n%10);
        }
        rm = n%10;
        n = n/10;
        re = (re*10)+rm;
        }
        return re;
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int i=1, n=s.nextInt();
        System.out.println(Reverse(n));

    }
}

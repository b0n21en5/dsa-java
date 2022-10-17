import java.util.*;
public class Sum_or_Product {

    // sum method
    public static int Sum(int n){
        int i=1, s = 0;
        for (;i<=n;i++){
            s+=i;
        }
        return s;
    }


    // product method
    public static int Product(int n){
        int p = 1, i=1;
        for (;i<=n;i++){
            p*=i;
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // n integer as input
        int n = s.nextInt();
//  c is choice,, 1 for sum, 2 for product
        int c = s.nextInt();
        if (c==1){
            System.out.println(Sum(n));
        }else if(c==2){
            System.out.println(Product(n));
        }else{
            System.out.println(-1);
        }
    }
}

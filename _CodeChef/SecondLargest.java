import java.util.Scanner;

public class SecondLargest {
    
    public static void main(String[] args) {

        // this program will print second largest element entered by the user
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        while(t>0){
            int a =sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a>=b && a>= c)
                System.out.println(Math.max(b, c));
            
            else if (b>=a && b>=c)
                System.out.println(Math.max(a,c));

            else
                System.out.println(Math.max(a, b));

            t--;
        }
    }
}

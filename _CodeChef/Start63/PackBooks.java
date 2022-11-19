package Start63;
import java.util.Scanner;

public class PackBooks {
    

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int t = sc.nextInt();

        while(t>0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            Double z = sc.nextDouble();

            System.out.println((int) Math.ceil(y/z) *x);

            t--;
        }
    }
}

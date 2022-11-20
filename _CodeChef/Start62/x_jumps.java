import java.util.Scanner;

public class x_jumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x%y==0)
                System.out.println(x/y);
            else
                System.out.println((x/y)+(x%y));
            t--;
        }
    }
}

import java.util.Scanner;

public class Test_Score {
    static Scanner s =new Scanner(System.in);

    public static void main(String[] args) {
        int t = s.nextInt();
        while(t>0){
            int n = s.nextInt();
            int x = s.nextInt();
            int y = s.nextInt();

            if (x*n>=y && y%x==0)
                System.out.println("Yes");
            else
                System.out.println("NO");

            t--;
        }
    }
}

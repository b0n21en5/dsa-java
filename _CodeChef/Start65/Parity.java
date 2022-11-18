import java.util.Scanner;

public class Parity {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            System.out.println(n%2==0?"YES":"NO");
        }
    }
}

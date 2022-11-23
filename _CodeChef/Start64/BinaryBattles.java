import java.util.Scanner;

public class BinaryBattles {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int time=0, i=0;

            for(;n>1;){
                n /= 2;
                i++;
                time += a;
            }

            time += b* (i-1);

            System.out.println(time);
        }
    }
}

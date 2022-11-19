package Start63;
import java.util.Scanner;

public class TastyDecisions {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t>0){

            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println((x*2)>(y*5)?"Chocolate":(x*2)<(y*5)?"Candy":"Either");
            t--;

        }

        sc.close();
    }
}

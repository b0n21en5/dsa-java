import java.util.Scanner;

public class broken_string {

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            String s = sc.next();


            System.out.println(s.substring(0, n/2).equals(s.substring(n/2,n)));
            
            

        }
    }
}

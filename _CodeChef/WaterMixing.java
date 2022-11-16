import java.util.Scanner;

public class WaterMixing {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws java.lang.Exception{

        int t = sc.nextInt();

        while(t>0){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (a==b)
                System.out.println("YES");
                
            else if (a>b){
                if (a-y<=b)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

            else{
                if (a+x>=b)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

            t--;
            
        }
    }
}

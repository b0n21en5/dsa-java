import java.util.Scanner;

public class Hackerman {

    static Scanner sc = new Scanner(System.in);
    
    public static void result(int c){

        boolean res = true;

        for (int i=2; i<c;i++){
            if (c%i==0)
                res = false;
        }

        if (res)
            System.out.println("Alice");
        else
            System.out.println("Bob");
    }


    public static void main(String[] args) {
        int t = sc.nextInt();
        
        while(t>0){
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            result(a+b);

            t--;
        }

    }
}

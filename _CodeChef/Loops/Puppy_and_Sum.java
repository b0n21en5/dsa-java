import java.util.Scanner;

public class Puppy_and_Sum {

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        int t = scan.nextInt();
        
        while(t-->0){

            int d = scan.nextInt();
            int n = scan.nextInt();
            int sum=0;

            for (int i=1; i<=d;i++){

                sum = (n*(n+1))/2;
                n = sum;
            }

            System.out.println(sum);
        }

        scan.close();
    }
}

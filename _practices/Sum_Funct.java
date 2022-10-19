import java.util.*;
public class Sum_Funct {
    public static int sum(int a, int b){

            System.out.print("Sum of 2 Int is: ");

            return a + b;
        }
        
    public static int sum(int a){
        a +=1;
        System.out.println("Sum of 1 Int is: ");
        return a;

        }    public static void main(String[] args) {

            // This program will give u sum of two integers
            // so the input must be two int but if 1 of them is 0
            // that case it'll increment 1st int by 1 & sum
            // will remain unaffected by 0

        Scanner s = new Scanner(System.in);
        int n=s.nextInt(), n1=s.nextInt();
        System.out.println(sum(n));
        System.out.println(sum(n,n1));


    }
}

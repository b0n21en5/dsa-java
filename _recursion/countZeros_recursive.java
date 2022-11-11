import java.util.Scanner;

public class countZeros_recursive {
    

    public static int countZeros(int n){

        if (n==0)
            return 1;  // n can be 0 at start or at end which is considered as base case

        else if (n<10)
            return 0; //n !=0 but less than 0 means n cant be zero, so returning 0

        else if (n%10==0)
            return 1 + countZeros(n/10); // if n modulous 10 is 0 , it will add 1 and call itself

        return countZeros(n/10); // function will recursively untill n becomes 0
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any digit integer to count 0 in it ");
        int num = sc.nextInt();

        System.out.println("num of zeros in the int is: " + countZeros(num));


        sc.close();

    }
}

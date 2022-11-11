import java.util.Scanner;

public class multiplyTwoIntegers {
    
    public static int multiplyTwoIntegers(int m, int n){

        
        // below if will ensure that 
        // n is the smaller num between
        // two integers m and n

        if (m<n){
            int tmp = m;
            m = n;
            n = tmp;
        }


        // if smaller integer is 0 then 
        // multiple value will be 0

        if (n==0){return 0;}

        int multi = 0;

        // passing two integer m, n and multi as parameters
        // to multiply funstion

        return multiply(m, n , multi);
    }



    public static int multiply(int m, int n, int multi){

        // this multiplication function will
        // multipoly teo integers with only 
        // use of addition and subtraction 
        // without multiplation



        // n will be added exactly m times

        multi += n;


        // n is added before calling recursion 
        // thats why recursion will be called for m>1


        if (m>1)
            return multiply(m-1, n, multi);
        


        // return multi as its holding the
        //  addition value of n for m times

        return multi;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two integers to multiply: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        // calling multiplyTwoIntegers functions
        System.out.println("Multiple value of two int is: " + multiplyTwoIntegers(m, n));



        // dont forget to close scanner object
        sc.close();
    }
}

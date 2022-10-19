import java.util.*;
class prime_or_Composite 
{

    public static boolean isPrime(int n){
        boolean res = true;
        for (int i=2;i<=n/2;i++){
            if (n%i!=0){
                res = false;
                return res;
            }
        }
        return res;
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        // Input will be a Integer Number
        // This program will tell u whether
        // the number u've given is prime or Composite
        try{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean s = isPrime(n);
        if (s){
            System.out.println("Prime Number");
        }else{System.out.println("Composite Number");}

        scn.close();
    }catch (Exception e){
        System.out.println("Invalid Input!");
    }
    }
    
}

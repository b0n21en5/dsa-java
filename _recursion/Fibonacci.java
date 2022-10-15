import java.util.*;

class fibonacci
{
    static int fib(int n)
    {
        if (n==1 || n==2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) 
    {
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        System.out.println(fib(n));
    }
}

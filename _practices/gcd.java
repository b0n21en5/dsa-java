import java.util.Scanner;
import java.lang.Exception;

class GCD 
{
    public static void main(String[] args) throws java.lang.Exception
    {
        int a,b,s,i,l;
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        b = scn.nextInt();
        s = Math.min(a,b);
        l = 1;
        for (i=2;i<=s;i++){
            if (a%i==0 && b%i==0){
                if (i>l){
                    l=i;
                }
            }
        }
        System.out.println(l);
    }
}
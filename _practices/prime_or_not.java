import java.util.*;
import java.lang.*;
class prime_or_not 
{
    public static void main(String[] args) throws java.lang.Exception
    {
        int d,n,s;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        s = 1;
        for (d=2;d<n;d++){
            if (d<n && n%d==0){
                s = 0;
            }
        }
        if (s==1){
            System.out.println("Prime Num");
        }else{System.out.println("Num is not Prime");}
    }
    
}

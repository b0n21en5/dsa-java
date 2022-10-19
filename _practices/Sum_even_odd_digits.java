import java.util.*;
public class Sum_even_odd_digits {
    public static void main(String[] args){
        // This program will take only 1 input
        // and will calculate & print the 
        // sum of even & odd digits of
        // the number as output value

        Scanner sn = new Scanner(System.in);
        int es=0, os=0, d,n = sn.nextInt();
        while (n>0){
            d = n%10;
            n = n/10;
            if (d%2==0){
                es = es + d;
            }else{
                os = os + d;
            }
        }
        System.out.println("Sum of Even digits is : "+es+" "+"& Odd digits is: "+os);
        
    }
}

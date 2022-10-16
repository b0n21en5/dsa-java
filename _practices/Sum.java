import java.util.*;
public class Sum {
    public static void main(String[] args){
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
        System.out.println(es+" "+os);
        
    }
}

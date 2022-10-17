import java.util.*;
public class Bin_Deci {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int i=0,d=0;
        String n=s.next();
        int l =  n.length();
        while (l>=1){
            l--;
            int intg = Integer.parseInt(n.substring(i, i+1));
            d+= (int) (Math.pow(2,l)*intg);
            i++;
        }
        System.out.println("Decimal num of "+n+" is "+d);
    }
}

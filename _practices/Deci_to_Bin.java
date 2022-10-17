import java.util.*;
public class Deci_to_Bin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i=0, n=s.nextInt();
        String r="";
        if (n==0){
            System.out.println(0);
        }else{
            while (n!=0){
                r += String.valueOf(n%2);
                n = n/2;
            }
            int l = r.length()-1;
            for (;l>=i;l--){
                System.out.print(r.charAt(l));
            }
        }
        
    }
}

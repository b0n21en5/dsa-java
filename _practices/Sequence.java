import java.util.*;
public class Sequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isInc = true;
        int lin = s.nextInt();
        int g=0,l=0,r=0, p = s.nextInt();
        for (int i=1;i<=lin-1;i++){
            int c=s.nextInt();
            if (c==p){
                System.out.println(false);
                return; 
            }else if(c<p){
                isInc = false;
                if (l==0){l++;r++;}
                if (g==1){
                    g++;
                    r++;
                }

            }else{isInc = true;
                if (g==0){g++;r++;}
                if (l==1){
                    l++;
                    r++;
                }
            }
            p = c;
        }
        if (r>=4){System.out.println(false);}
        else{System.out.println(true);}
    }
}

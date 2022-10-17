import java.util.*;
public class Primal_num {
    public static void main(String[] args) {
        int d,n,s,i;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        for (i=2;i<=n;i++){
            s = 1;
            for (d=2;d<i;d++){
                if (d<i && i%d==0){
                    s = 0;
                }
                }
                if (s==1){
                    System.out.println(i);
                }
        }
    }
}

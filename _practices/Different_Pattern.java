import java.util.*;
public class Different_Pattern {
    public static void main(String[] args) {
        // if iput is 5 then the pattern will be:
                                                //   1234554321
                                                //   1234**4321
                                                //   123****321
                                                //   12******21
                                                //   1********1
        
        Scanner sn = new Scanner(System.in);
        int   i=1, n = sn.nextInt(), t=n,u=n;
        sn.close();
        for (;i<=n;i++){
                int j = 1;
                for (;j<=t;j++){
                    System.out.print(j);
                    
                }
                for (int l=1;l<=i-1;l++){
                    System.out.print("*");
                }
                t-=1;
                int k = u, p=i;
                for (int l=1;l<=p-1;l++){
                    System.out.print("*");
                }
                for (;k>0;k--){
                    System.out.print(k);
                }
                
                u-=1;
                System.out.println();
        
            }
        
    }
    
}

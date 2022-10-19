import java.util.*;
public class Diamond_Star {
    public static void main(String[] args) {

        // This program will print Diamond_shaped star pattern
        // if input is 5 then pattern will be:
        //            *
        //           ***
        //          *****
        //           ***
        //            *


        

        Scanner s = new Scanner(System.in);
        int i=1, r, n1, n = s.nextInt();
        n1 = (n+1)/2;
        while (i<=n1){
                int sp = n1-i;
                int j =1;
                while (j<=sp){
                        System.out.print(" ");
                        j++;
                }
                int k=1,st = (2*i) - 1;
                while (k<=st){
                        System.out.print("*");
                        k++;
                }
                System.out.println();
                i++;
        }
        int n2 = ((n+1)/2)-1;
        r = n2;
        s.close();
        while (r>=1){
                int t=1,sp = n2-r+1;
                while (t<=sp){
                        System.out.print(" ");
                        t++;
                }
                int ki=1,star = (2*r) - 1;
                while (ki<=star){
                        System.out.print("*");
                        ki++;
                }
                
                System.out.println();
                
                r--;
        }
    }
    
}

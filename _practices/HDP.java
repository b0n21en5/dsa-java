import java.util.*;
public class HDP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i=1, n = s.nextInt();
        
        while (i<=n+1){
            int k = i;
            while (i>=1){
            System.out.print("*");
            k--;
            break;
            
            }
            
            int j =1;
            while (j<i){
                System.out.print(j);
                j++;
            }
        //     int a = k; 
            int num = k-1;
            while (num>0){
                System.out.print(num);
                num--;
            }
            while (i!=1){
                System.out.print("*");
                break;
            }
            System.out.println();
            i++;
        }
        int p = (n*2)+1;
        while (i<=p){
                while (i>=1){
                        System.out.print("*");
                        break;
                }
                int c=1,b=i;
                while (b<p){
                        System.out.print(c);
                        c++;
                        b++;
                }
                int num = c-2;
                while (num>0){
                        System.out.print(num);
                        num--;
                }
                while (i!=p){
                        System.out.print("*");
                        break;
                }
                System.out.println();
                i++;
        }
        if (n==0){
            System.out.println("*");
        }
    }
}

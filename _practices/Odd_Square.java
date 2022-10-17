import java.util.*;
public class Odd_Square {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int i=1, n = s.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        while (i<=n){
            int j=1;
            while (j<=n){
                int k=1, n1=n*2;
                while (k<=n1){
                    if (k%2!=0){
                        lst.add(k);
                        System.out.print(k);
                    }
                    k++;
                }
                System.out.println();
                ArrayList<Integer> cop = new ArrayList<>(lst);
                int t=1,n2=n-1;
                while (t<=n2){
                    int r=1, l =lst.size();
                    while (r<l){
                        
                        System.out.print(lst.get(r));
                        lst.set((r-1),lst.get(r));
                        r++;
                    }
                    
                    System.out.println(cop.get(0));
                    lst.set((l-1),cop.get(0));
                    cop.set(0,lst.get(0));
                    t++;
                }
                
                break;
            }
            break;
        }
    }
}

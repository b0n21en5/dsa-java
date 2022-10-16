import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int i=2, n = sn.nextInt();
        
        // factors will be count from 2 till n-1
        // i.e 1 and n both is excluding
        while (i<n){
            if (n%i==0){
                System.out.print(i+" ");
            }
            i++;
        }

    }
}

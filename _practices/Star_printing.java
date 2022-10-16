import java.util.Scanner;
public class Star_printing {
    public static void main(String[] args) {

        // This program will print star for n rows and n columns
        // i.e. 3== ***
                //  ***
                //  ***

                
        Scanner s = new Scanner(System.in);
        int i=1, n = s.nextInt();
        while (i<=n){
            int j =1;
            while (j<=n){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}

import java.util.Scanner;
public class Pattern {
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



        
        // If n is 3 This programe will print 111
                //                            222
                //                            333


        // Scanner s = new Scanner(System.in);
        // int i=1, n = s.nextInt();
        // while (i<=n){
        //     int j =1;
        //     while (j<=n){
        //         System.out.print(i);
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }


        // If n is 3 This programe will print 123
                //                            123
                //                            123


        // Scanner s = new Scanner(System.in);
        // int i=1, n = s.nextInt();
        // while (i<=n){
        //     int j =1;
        //     while (j<=n){
        //         System.out.print(j);
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }



        // If n is 3 This programe will print 321
                //                            321
                //                            321
        
        // Scanner s = new Scanner(System.in);
        // int i=1, n = s.nextInt();
        // while (i<=n){
        //     int j=n;
        //     while (j>0){
        //         System.out.print(j);
        //         j--;
        //     }
        //     System.out.println();
        //     i++;
        // }



        // If n is 3 This programe will print 333
                //                            333
                //                            333
        // Scanner s = new Scanner(System.in);
        // int i=1, n = s.nextInt();
        // while (i<=n){
        //     int j=n;
        //     while (j>0){
        //         System.out.print(j);
        //         j--;
        //     }
        //     System.out.println();
        //     i++;
        // }
            
        
    }
}

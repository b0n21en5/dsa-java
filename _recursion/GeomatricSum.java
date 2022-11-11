import java.util.Scanner;



public class GeomatricSum {


    public static double geoSum(int i, int k, double res){

        // this method will recursively increment Value of i
        // till i==k, when i & k becomes equal it will return 
        // res as double value


        if (i>k){return res;}



         // storing value to res variable after every iteration
         //  using geomatric sum method (1/2^i)

        res += 1/(Math.pow(2, i)); 

        return geoSum(i+1, k, res);




    }
    
    public static double findGeoSum(int k){


        // this method will call another method 
        // called geoSum by assigning
        //  two more params to that
        // and evntually geoSum method will 
        // return the required double value

        return geoSum(0, k, 0.0);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter number here");
        int k = sc.nextInt();

        System.out.println("Geomatric Sum of " + k + " is " + findGeoSum(k));
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class WA_TestCases {
    static Scanner scan = new Scanner(System.in);

    static int min_value(ArrayList<Integer> arr, int min){

        // this method will return minimum 
        // value from arraylist 

        for (int i=1;i<arr.size();i++)
            if (arr.get(i)<min) min = arr.get(i);

        return min;
    }



    public static void main(String[] args) {
    
        int t = scan.nextInt();

        while(t-->0){

            int n = scan.nextInt(); //no of test cases
            int[] s  = new int[n];


            //user input of all test case values
            for (int i=0;i<n;i++)
                s[i] = scan.nextInt();


            
        // string input of test cases i.e '0's / '1's
            String v = scan.next(); //'0' means wrong & '1' means correct test cases

            
            //creating an arraylist to store test case which is WA
            ArrayList<Integer> arr = new ArrayList<>(); 



            // checking which test case is wrong & storing accordingly
            for (int i=0;i<n;i++)
                if(v.charAt(i) == '0') arr.add(s[i]);



            // finding out & printing minimum value among
            // all wrong test cases using min_value method

            System.out.println(min_value(arr, arr.get(0)));
        }
    }
}

import java.util.Scanner;

class GoodPairs{

    static Scanner sc = new Scanner(System.in);


    public static void goodPair(){

        int t = sc.nextInt();

        while(t>0){

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n;i++){
                arr[i] = sc.nextInt();
            }

            int c=0;

            for (int i=0; i<n-1;i++){
                for (int j=i+1;j<n;j++){
                    if (arr[i]==arr[j])
                        c++;
                }
            }


            System.out.println(c);

            t--;
        }


    }


    public static void goodPair_Better(){
        
        // yet to implement
    }



    public static void main(String[] args) throws java.lang.Exception{

        // good pair method was implemented before main
        // in main we are just calling the method
        // & rest of the thing will handled by method itself


        //below method will work well but not efficient
        // n over all test cases crosses 10^9 [expected TLE]
        goodPair();



        //below efficient method will run smoothly
        // 
        goodPair_Better();
    }
}
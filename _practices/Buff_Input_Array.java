import java.io.*;

public class Buff_Input_Array {

    public static int[] increment(int[] n){
        n = new int[8];
        // System.out.println("increment "+n);
        for (int i=0;i<5;i++){
            n[i] = i+2;
        }
        System.out.println("increment "+n[3]);
        return n;
    }


    public static void printPairs(int[] arr){
        
        for (int i=0;i<arr.length;i++){
            int j=i+1;
            for (; j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            }
            
        }
    }

    

    public static void main(String[] args) throws Exception {


// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  [ object of buffered reader ]
// 
// StringTokenizer st = new StringTokenizer(br.readLine()); 
// 
// String str = input.readLine(br);   [ for String input ]
// 
// int t = Integer.parseInt(br.readLine().trim());   [ for integer input ]
// throws NumberFormatException, IOException
// 
// java.io.*; module is needed to run this program
// 


// 
// This program will take 5 nums as array input & returns the pairs of them
// 




        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] arr = new int[5];

        for (int i=0;i<arr.length;i++){
            int v = Integer.parseInt(br.readLine().trim());
            arr[i] = v;
        }


        System.out.println("Possible pairs of Array elements: ");
        printPairs(arr);
        // System.out.println("main "+arr);
        // // arr =increment(arr);

        
        // System.out.println("main "+arr[3]);
        // System.out.println("main "+arr);

        // printArray(arr);
        
    }
}






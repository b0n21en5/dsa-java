import java.util.Scanner;

public class Practice {

    public static int[] increment(int[] n){
        n = new int[8];
        // System.out.println("increment "+n);
        for (int i=0;i<5;i++){
            n[i] = i+2;
        }
        System.out.println("increment "+n[3]);
        return n;
    }


    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            int j=i+1;
            for (; j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            }
            
        }
    }

    

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,76,65};
        // System.out.println("main "+arr);
        // // arr =increment(arr);

        
        // System.out.println("main "+arr[3]);
        // System.out.println("main "+arr);

        printArray(arr);
        
    }
}




// BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
// StringTokenizer st = new StringTokenizer(br.readLine()); 
// int t = Integer.parseInt(br.readLine().trim());
// throws NumberFormatException, IOException

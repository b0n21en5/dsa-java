import java.util.Arrays;
import java.util.Scanner;

public class isSortedArray {
    
    public static boolean isSorted(int[] arr){

        if (arr.length == 1)
            return true;

        if (arr[0]>arr[1])
            return false;

        

        return isSorted(Arrays.copyOfRange(arr, 1, arr.length));

    }


    static Scanner s = new Scanner(System.in);

    public static int[] takeInput(){

        int sz = s.nextInt();

        int[] arr = new int[sz];

        for(int i=0; i<sz; i++){
            arr[i] = s.nextInt();
        }

        return arr;
    }


    public static void main(String[] args) {
        
        int[] arr = takeInput();

        System.out.println(isSorted(arr));

    }
}

import java.util.Scanner;
import java.util.Arrays;


public class lastIndex {

    public static int last_index(int[] arr, int x){

        int li = arr.length - 1;

        if (arr.length == 0)
            return -1;
        
        if(arr[li] == x) 
            return li;

        int res = last_index(Arrays.copyOfRange(arr,0,li), x);

        if (res==-1)
            return -1;

        else
            return res;
    }

    static Scanner s = new Scanner(System.in);


    public static int[] takeInput(){
        
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i=0; i < size; i++){
            arr[i] = s.nextInt();
        }

        return arr;

    }



    public static void main(String[] args) {
        
        int arr[] = takeInput();

        int x = s.nextInt();

        System.out.println(last_index(arr, x));
    }

    
}

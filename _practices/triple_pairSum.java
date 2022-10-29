import java.util.*;
public class triple_pairSum {
    
    public static int triple(int[] arr, int num){
        Arrays.sort(arr);
        int c=0, n = arr.length;
 
        for (int i = 0;
             i < n - 1; i++) {
            
            int l = i + 1;
            int r = n - 1;
            int x = num -arr[i];
            while (l < r) {
                if (arr[l] + arr[r] == x) {
                    c++;
                    r--;
                }
                else if (arr[l] + arr[r] < x)
                    {l++;
                    r = n-1;}
                else
                    r--;
            }
    }
    return c;
}


    public static int tripePair(int[] arr, int num){
        Arrays.sort(arr);
        int c=0;
		for (int i=0;i<arr.length-2;i++){
            int n = num - arr[i];
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[j]+arr[k]==n){
                    c++;
                	}
            	}
                
            }
        }
        System.gc();
        return c;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 2, 5, 4, 3, 2, 4, 10, 5, 9};

        int[] arr2 = {2, -5 ,8 ,-6 ,0, 5 ,10, 11, -3};

        int[] arr3 = {6, 1, 6, 5, 3, 2 };



        long str2 = System.nanoTime();
        System.out.println(triple(arr, 10));
        long end2 = System.nanoTime();
        System.out.println(end2-str2 + " ms");



        // System.out.println(triple(arr2, 10));
        // // System.out.println(tripePair(arr, 10));
        // System.out.println(tripletSum.tripletSumArray(arr2, 10));
    }
}

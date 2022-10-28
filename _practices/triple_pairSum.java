import java.util.Arrays;
public class triple_pairSum {
    
    public static int triple(int[] arr, int num){
        Arrays.sort(arr);
        int c=0, i=0, n = num - arr[0];
		for(int j=1;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                if(arr[j]+arr[k]==n){
                c++;
                }
            }
            
            if (j==arr.length-1 && i<arr.length-2){
                i++;
                n = num - arr[i];
                j = i;
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



        // System.out.println(triple(arr, 10));
        // System.out.println(tripePair(arr, 10));
        // System.out.println(tripletSum.tripletSumArray(arr3, 10));
    }
}

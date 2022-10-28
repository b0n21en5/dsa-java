import java.util.*;
import java.time.Duration;
public class tripletSum {


    public static int tripletSumArray(int[] arr, int num) {
		int c=0;
		for (int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==num){
                    c++;
                	}
            	}
                
            }
        }
        return c;
	}


    public static int second(int[] arr, int num) {
		int c=0, i=0, l=arr.length;
		for(int j=i+1;j<l;j++){
            for(int k=j+1;k<l;k++){
                if(arr[i]+arr[j]+arr[k]==num){
                c++;
                }
            }
            
            if (j==l-1 && i<l-2){
                i++;
                j = i;
            }
        }
        
        return c;
	}


    
    public static int tripletSum(int[] arr, int num) {
        Arrays.sort(arr);
		int c=0, j=1,k=2;
		
        for (int i=0;i<arr.length-2;){
            
            if (k<arr.length){
                if (arr[i] + arr[j] + arr[k] == num){c++;}
                k++;
                continue;
            }
            else if (j<arr.length-1){
                j++;
                k = j+1;
                continue;
            }

            i++;
            j = i+1;
            k = i+2;
        }

        return c;
	}


    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 2, 5, 4, 3, 2, 4, 10, 5, 9};

        int[] arr2 = {2, -5 ,8 ,-6 ,0, 5 ,10, 11, -3};

        int[] arr3 = {6, 1, 6, 5, 3, 2 };

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter sum whose pair sum u want to count in the array: ");
        // int sum = sc.nextInt();

        // long str1 = System.nanoTime();
        // System.out.println("Total num of triplet sum with 1st method is: " + tripletSumArray(arr3, 6));
        // long end1 = System.nanoTime();
        // System.out.println(end1-str1 + " ms");

        // long str3 = System.nanoTime();
        // System.out.println("2nd Method: "+second(arr3, 6));
        // long end3 = System.nanoTime();
        // System.out.println(end3-str3 + " ms");

        long str2 = System.nanoTime();
        System.out.println("Total num of triplet sum with 3rd method  is: " + tripletSum(arr, 10));
        long end2 = System.nanoTime();
        System.out.println(end2-str2 + " ms");


        

        // sc.close();
    }
}

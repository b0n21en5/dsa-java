import java.util.Scanner;
public class tripletSum {


    public static int tripletSumArray(int[] arr, int num) {
		int c=0;
		for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==num){
                    c++;
                	}
            	}
                
            }
        }
        return c;
	}


    
    public static int tripletSum(int[] arr, int num) {
		int c=0, i=0;
		for(int j=i+1;j<arr.length;){
            for(int k=j+1;k<arr.length;k++){
                if(arr[i]+arr[j]+arr[k]==num){
                c++;
                }
            }
            i++;
            j = i+1;
        }
        
        return c;
	}


    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 2, 5, 4, 3, 2, 4, 10, 5, 9};

        int[] arr2 = {2, -5 ,8 ,-6 ,0, 5 ,10, 11, -3};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sum whose pair sum u want to count in the array: ");
        int sum = sc.nextInt();

        System.out.println("Total num of triplet sum with 1st method is: " + tripletSumArray(arr2, sum));

        System.out.println("Total num of triplet sum with 2nd method  is: " + tripletSum(arr2, sum));


        sc.close();
    }
}

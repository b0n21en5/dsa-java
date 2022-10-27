import java.util.Scanner;

public class Pair_Sum_Array {
    

    public static int pairSum(int[] arr, int num) {
        int c=0;
		for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==num){
                    c++;
                }
            }
        }
        return c;
	}

    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 2, 5, 4, 3, 2, 4, 10, 5, 9};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sum whose pair sum u want to count in the array: ");
        int sum = sc.nextInt();

        System.out.println("Total num of pair sum in the array is: " + pairSum(arr, sum));


        sc.close();
    }
}

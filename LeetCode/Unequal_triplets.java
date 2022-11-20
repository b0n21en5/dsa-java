import java.util.Scanner;

public class Unequal_triplets {
    
    public static int unequalTriplets(int[] arr){

        int c=0;

        for(int i=0; i<arr.length-2; i++){

            for (int j=i+1; j<arr.length-1; j++){

                if (arr[i] != arr[j]){

                    for (int k=j+1; k<arr.length; k++){

                        if (arr[j] != arr[k] && arr[i] != arr[k])
                            c++;
                    }
                }
            }
        }


        return c;
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Number of Unique Triplets in the array is: " + unequalTriplets(arr));
    }
}

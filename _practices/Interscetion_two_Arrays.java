import java.io.*;
import java.util.Arrays;
public class Interscetion_two_Arrays {


//  intersection method will sort two arrays at first then see what is common in both,,
// input: 2  (no of test case)
//        6  (size of array1 in test case_1)
//        2 6 8 5 4 3  (array1)
//        4  (size of array2)
//        2 3 4 7  (array2)
//        2  (size of array1 in test case_2)
//        10 10  (array1)
//        1  (size of array2)
//        10  (array2)



    public static void intersections(int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int l1=arr1.length, l2=arr2.length;

    	for (int i=0;i<l1;i++){

            int j=0;
            for (;j<l2;j++){

                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " ");
                    
                    arr2[j] = 0;
                    break;
                }
            }
        }
    }


    


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input1 = takeInput();
            int[] input2 = takeInput();
            intersections(input1, input2);
            System.out.println();

            t -= 1;
        }
    }
}

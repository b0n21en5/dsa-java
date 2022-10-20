import java.util.*;
import java.io.*;
public class Unique_Num_array{  

    // i've wriiten the code till ####


    // this method [findUnique] will give u the value from an array
    // input will be: 1 (no of test case)
    //                1 (size of array)
    //                5 (values of array)

    //  not limited to any function,, one can modify according to need of the problem
    // 

    public static int findUnique(int[] arr){
		// Arrays.sort(arr);
        int l = arr.length, res=0;
        
        for (int i =0; i<l;i++){
            if (l==1){res=arr[0];break;}
            
            for (int j=0;j<l;j++){
                if (i!=j && arr[i]==arr[j]){
                    res=0;
                    break;
                }
                if (arr[i]!=arr[j] ){
                    res = arr[i]; 
                    // break;
                }
                
            }
            if (res!=0){break;}
            
        }
        return res;
    }




    // #############################################//#end of my code
    // ##############################################//
    // ################################################//


    // NOTE:: rest of the code was not implemented by me  !



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

            int[] input = takeInput();
            System.out.println(findUnique(input));
        
            t -= 1;
        }
    }
}

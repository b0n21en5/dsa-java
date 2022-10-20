import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Arrange_Nums_in_Array {
    public static void arrange(int[] arr, int n) {
    	int st=0,i=1,en=n-1;
        for (; i<=n;){
            if (i%2!=0){
                arr[st] = i;
                i++;
                st++;
            }
            if (i>n){break;}
            if (i%2==0){
                arr[en] = i;
                i++;
                en--;
            }
        }
        
    }


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            arrange(arr, n);
            printArray(arr);

            t -= 1;
        }
    }
    
}

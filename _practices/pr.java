import java.util.HashSet;
import java.util.Arrays;
import java.io.*;
public class pr {
    public static int findTriplets(int arr[], int num)
    {
        Arrays.sort(arr);
        int n = arr.length, c=0;

        for (int i = 0; i < n - 1; i++) {
            
            
            HashSet<Integer> s = new HashSet<>();
            int j = i + 1;
            for (; j < n; j++) {

                int x = num - (arr[i] + arr[j]);
                if (x<arr[0]){break;}
                if (s.contains(x))
                    c++;

                else
                    s.add(arr[j]);
            }
            if (s.size()==0){
                System.out.print("ans ");
                return c;}
            System.out.print(i+","+(j-1)+ " ,");
        }
        return 0;
        
    }



    public static int find(int arr[], int num)
    {
        Arrays.sort(arr);
        int n = arr.length, c=0,k=0;

        for (int i = 1; i < n; i++) {
            
            int x = num - (arr[k] + arr[i]);

            int j = i + 1;
            for (; j < n; j++) {
                if (x==arr[j]){
                    c++;
                }
            }
            

            if (j==n-1 && i==n-2 && k <n-2){
                k++;
                i = k;
            }

        }
        return c;
        
    }
 




    static int findTrip(int[] arr, int num)
    {
        Arrays.sort(arr);
        int n = arr.length, c=0;
        for (int i = 0;
             i < n - 1; i++) {
            
            int l = i + 1;
            int r = n - 1;
            int x = arr[i];
            while (l < r) {
                if (x + arr[l] + arr[r] == num) {
                    
                    c++;
                    r--;
                }
 
               
                else if (x + arr[l] + arr[r] < num)
                    {l++;
                    r = n-1;}
 
                else
                    r--;
            }
        }

        return c;
    }



   
    public static void main(String[] args)
    {

        int arr[] = { 6, 1, 6 ,5, 3, 2  };

        int[] arr2 = {6 ,1 ,6 ,5, 3, 2 ,5, 0, 5, 6 ,0 };

        int[] arr3 = {2, -5 ,8, -6, 0 ,5, 10, 11, -3};

        int[] arr4 = {6, 1, 6 ,5 ,3 ,2  }; 



        int sum = 10;
        
        // System.out.println(findTriplets(arr3, sum));
        // System.out.println(find(arr3, sum));
        
        // System.out.println(findTrip(arr2, sum));
        int a=10,b=20;
        int c=a&b;
        System.out.print(c);
        int d=a|b;
        System.out.print(d);
        int e=a^b;
        System.out.print(e);
        int f=c+d+e;
        System.out.print(~f);
    }
}

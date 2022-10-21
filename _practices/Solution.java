import java.util.*;

public class Solution {

public static void main(String[] args)
{
    int[] arr = new int[10];
    int l = arr.length;
    Scanner s= new Scanner(System.in);
    

    for (int i=0;i<l;i++){
        arr[i] = s.nextInt();
    }

    for (int i=0;i<l;i++){System.out.println(arr[i]);}


    int sum=0;
    for (int i=0;i<l;i++){sum += arr[i];}
    System.out.println("Sum of Array is: "+sum);


    
    

}
	

}


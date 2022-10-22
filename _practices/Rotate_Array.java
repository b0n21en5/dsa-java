import java.util.*;
public class Rotate_Array {
    
    public static void rotate(int[] arr, int d) {

        // 
        // rotatre method will going to rotate 
        // the given array till d-th index
        // from start to end
        // 

    	int[] tmp = new int[d];
        int i=0,k=0, l=arr.length;


    // 
    // below loop is using to make a copy of array
    // till the index how far we want to rotate the array
    // 

        for (;i<d;i++){
            tmp[i] = arr[i];
        }

    
    // 
    // next loop below will first copy the values from
    // array where it ends in last loop then it will
    // copy temporary array from 0-th index till
    // the length-1 index
    // 

        for (int j=0;j<l;j++){
            
            if (i==l){
                arr[j] = tmp[k];
                k++;
                continue;
            }
            
            arr[j] = arr[i];
            i++;
        }
    }



    public static void printArray(int[] arr){

        // 
        // printArray will print all the elements
        // from the given array
        // 

        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }


    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Input a integer how far u want to rotate: ");
        int n=s.nextInt();

        int[] arr = {3,6,8,7,1,2,9,4,8,7,5,};


        System.out.println("Before Rotate Array looks like: ");


        printArray(arr);



        // 
        // calling rotate method below to rotate the array
        // rotate method will take two arguments i.e. 
        // an array and a integer till the point 
        // how far u want to rotate
        // 
        rotate(arr, n);


        System.out.println("\n\nAfter Rotate Array looks like: ");


        printArray(arr);


    }
}

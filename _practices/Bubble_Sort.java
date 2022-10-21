public class Bubble_Sort {


    public static void bubbleSort(int[] arr){

        // Bubble Sorting method
        // 
        
        int l=arr.length, no=l-1 , mx=Integer.MIN_VALUE;
        
        for (int i=0;i<l;i++){
            
            int j=0, ind = no; 
            for (;j<ind;j++){
                
               
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
            	}
            }
        }
    }


    public static void main(String[] args) {

        // 
        // This program will sort the array 
        // using bubbleSort method
        // 
        // all u need to do is change
        // the array value in the code below
        // 
        

        int[] arr = {9, 6, 4, 0, 1, 3, 2};
        System.out.println("Before Sort Array is: ");
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        bubbleSort(arr);
        System.out.println("\n\nAfter Sort Array is:");
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}

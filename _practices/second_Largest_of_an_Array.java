public class second_Largest_of_an_Array {
    

    public static void selectionSort(int[] arr) {


        // This method will sort the array using slection sort method
        //
        //

    	int  l=arr.length ,  k =Integer.MIN_VALUE;

        
        for (int i=0;i<l;i++){
            int min=Integer.MAX_VALUE;
            for (int j=i;j<l;j++){
                if (arr[j]<min){
                    min = arr[j];
                    k = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;
        }
    }   



    public static int secondLargestElement(int[] arr) {
    	selectionSort(arr);
        
        int l=arr.length, res  = Integer.MIN_VALUE;
        
        if (l<=1){return res;}
        
        
        for (int i=l-1;i>0;i--){
            
            if (arr[i-1]<arr[i]){
                res = arr[i-1];
                break;
        	}
        }
        
        return res;
        
    }

    public static void printArr(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    

    public static void main(String[] args) {
        
        int[] arr = {2, 5, 7, 8, 9, 11, 13, 10};


        printArr(arr);
        int result = secondLargestElement(arr);
        System.out.println("\nSecond Largest element of the Array is: "+result);

    }
}

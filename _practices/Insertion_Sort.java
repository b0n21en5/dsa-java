public class Insertion_Sort {
    
    public static void insertionSort(int[] arr) {

        // 
        // insertion method sorts an array
        // by comparing and swapping
        // the (j)th and (j-1)th index
        // value, if it is less than 
        // its consecutive value
        // 


        int l=arr.length, i=0;

    	for (; i<l-1;i++){

            for (int j=i+1; j>0;j--){

                if (arr[j]<arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }


    public static void main(String[] args) {

        // 
        // This program will Sort an Array
        // using insertionSort method
        // put your array in below code
        // & u will get your sorted 
        // very efficiently
        // 


        int[] arr = {5, 8, 6, 9, 3, 0, 1, 2, 7, 11, 5};

        System.out.println("Array Before Sort: ");
        // 
        // printing the whole array before
        //  calling insertionSort method
        // 
        for (int ele: arr){
            System.out.print(ele+" ");
        }

        // Calling the insertingSort method
        insertionSort(arr);

        
        System.out.println("\n\nArray After Sort: ");
        // 
        // printing the whole array after
        // calling insertionSort method
        // 
        for (int ele: arr){
            System.out.print(ele+" ");
        }
    }
}

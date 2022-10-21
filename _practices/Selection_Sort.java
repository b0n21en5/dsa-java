public class Selection_Sort {
    public static void selectionSort(int[] arr) {


        // This methodwill sort the array using slection sort method
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


    public static void printArrayValue(int[] arr){

        // This method print the whole array once its called
        // 
        // 

        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }



    public static void main(String[] args) {

        
// Main program will sort the array and print
// using slectionSort method and printArrayValue method
// 
// all you need to do is put your array below  '
//                                             '
//                                             '
//                                             '
//                                           '''''
//                                             '
        int[] arr = {4,6,3,3,8,9,0,11,2};
        System.out.println("Before Sort Array is: ");
        printArrayValue(arr);
        System.out.println("\n\nAfter Sort Array is:" );
        selectionSort(arr);
        printArrayValue(arr);
        
    }
    
}

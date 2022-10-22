public class Merge_Two_sorted_Arrays {
    public static int[] merge(int arr1[], int arr2[]) {

        // 
        // This method will take two
        // sorted arrays as input and 
        // return the value of merged array
        // which is the merge of two sorted
        // arrays again in sorted manner
        // 
        
        int l=arr1.length, l2= arr2.length, j=0, ind=0, i=0;
        
        int[] arr = new int[l+l2];
        
        if (l == 0){return arr2;}
        else if (l2==0) {return arr1;}
        
        
        
        for (;i<l;){
            

        //if j reached the length of array2 then only 
        // this if statement below will copy rest of 
        // the array1 values to array3 blindly
        // 

            if (j==l2){
                arr[ind] = arr1[i];
                i++;
                ind++;
                continue;
            }
            
            for (;j<l2;){
                
                
                
                if (i<l && arr1[i]<arr2[j]){
                    arr[ind] = arr1[i];
                    i++;
                    ind++;
                    }

                else if ( i<l && arr1[i]>=arr2[j]){
                    arr[ind] = arr2[j];
                    j++;
                    ind++;
					}
                
                
            //if i reached the length of array1 only then 
            // this else statement will copy rest of 
            // the array2 values to array3 blindly
            // 

                else{
                    arr[ind] = arr2[j];
                    j++;
                    ind++;
                    }
                
                
            }
            
        }
        return arr;
    }



    public static void main(String[] args) {


        // 
        // here in main method first we are
        // creating two arrays namely arr1 & arr2
        // then calling merge method by passing
        // arr1 & arr2 as argument to it
        // 


        int[] arr1  = {3, 5, 7, 20, 21, 22, 22, 23, 26, 27, 29, 31}; 
        int[] arr2 = {1 ,2, 4, 6 ,8, 9, 12, 13 ,16 ,19, 28};

        int[] arr = merge(arr1, arr2);

        System.out.println("Value after Merging two Sorted Arrays: ");
        for (int r:arr){
            System.out.print(r+" ");
        }
    }
}

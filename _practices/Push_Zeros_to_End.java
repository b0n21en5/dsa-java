public class Push_Zeros_to_End {
    
    public static void pushZerosAtEnd(int[] arr) {
        
        // 
        // This method will push all zeros to end
        // by maintaining the relative order of 
        // the non-zero elements of an array
        // 

    	int l=arr.length, i=0, k=0;


        // 1st for loop will put every non-zero
        // elements consecutively from 0th index
        // 

        for (;i<l;i++){
            if (arr[i]!=0){
                arr[k] = arr[i];
                k++;
            }
            
        }

        // 
        // this for below will replace the non-zero value
        // with zeros till the (length -1) of the array
        // by the way it will push the zeros to end
        // 
        
        for (;k<l;k++){
            arr[k] = 0;
        }
        
    }


    public static void main(String[] args) {
        
        // 
        // main method will make an array first 
        // then if we meed to call the method
        // pushZeroAtEnd to push all zeros to End
        // 


        // 
        // if u want to push zeros to u'r
        // own array, all u need to do is 
        // just replace the array below with
        // u'r array
        // 

        int[] arr = {2, 1, 0, 0, 1, 3, 0, 0};

        System.out.println("Before Pushing zeros Array is: ");


        // printing the array before applying 
        // pushZerosAtEnd method

        for (int ele : arr){
            System.out.print(ele+" ");
        }


     // 
    //    Calling pushZerosAtEnd to make 
    // the function working is *Essential
    // 
        pushZerosAtEnd(arr);


        System.out.println("After Pushing zeros to End Array is: ");

        // printing the array after applying 
        // pushZerosAtEnd method

        for (int ele : arr){
            System.out.print(ele+" ");
        }



    }
}

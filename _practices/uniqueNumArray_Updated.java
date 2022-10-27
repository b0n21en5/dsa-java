public class uniqueNumArray_Updated{
    

    public static int findUnique(int[] arr) {
        
        if (arr.length==1){return arr[0];}
        
        int j=0;
        for (int i =j+1; i<arr.length;i++){
            
            if (arr[j]>-1 && arr[j]==arr[i]){
                arr[i] = -5;
                j++;
                i=j;
                }
            else if (arr[j]<0){
                j++;
                i=j;
            }

            else if (i==arr.length-1 && arr[j]!=arr[i]){
                return arr[j]; 
                }
            
            
            }
        return arr[arr.length-1];
	}



    public static void main(String[] args) {

        int[] arr = {1 ,7 ,1, 3, 7 };
        int[] arr2 = {6, 3, 7, 5 ,1 ,3, 5, 1 ,7,6 , 9 };
        int[] arr3 = {2, 3 ,1 ,6 ,3 ,6 ,2};

        System.out.println(findUnique(arr2));
    }
}

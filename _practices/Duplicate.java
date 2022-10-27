public class Duplicate {
    

    public static int findDuplicate(int[] arr) {
		int i=0, j=0;
        for (;j<arr.length;j++){
            if (i==arr[j]){
                arr[j] = Integer.MIN_VALUE;
                i++;
            }
        }
        
        for (int e:arr){
            if (e>-1){return e;}
        }
        
        return 0;
	}


    public static void main(String[] args) {
        int [] arr={0,1,2,6,3,4,5,6};

        System.out.println(findDuplicate(arr));
    }
}

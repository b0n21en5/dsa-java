public class binarySearch {


    public static int binSrc(int[] arr,int si,int ei,int  x){

        if (si>ei){return -1;}

        int mi = (si+ei)/2;

        if (arr[mi] == x){return mi;}
        else if(arr[mi]<x){return binSrc(arr, mi+1, ei, x);}
        else{return binSrc(arr, si, mi-1, x);}
    }



    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 5, 65, 77, 80};

        System.out.println(binSrc(arr, 0, arr.length-1, 7));
    }
}

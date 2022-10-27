public class Optimal_Intersection {
    

    public static void main(String[] args) {
        int[] arr1 = {1,6,9,8};
        int[] arr2 = {3,2,1,8};
        int  l=arr1.length, l2=arr2.length;

        // if (arr1.length<arr2.length){l = arr1.length;}
        // else{l=arr2.length;}

        for (int i=0;i<l;){

            for (int j=0;j<l2;){
                if (i==l){break;}
                if (arr1[i]>arr2[j]){
                    i++;
                }
                else if (arr1[i]<arr2[j]){
                    j++;
                }
                else {
                    System.out.print(arr1[i] + " ");
                    i++;
                    j++;
                }
            }
        }
    }
}

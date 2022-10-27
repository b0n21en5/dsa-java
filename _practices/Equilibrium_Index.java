


public class Equilibrium_Index {
public static int euilibriumIndex(int[] arr){
    int rightSum = 0;
        int j = arr.length-1;
            for (;j>0;j--){
                rightSum += arr[j];
            }

        int leftSum= 0, equi = 0;
        while (equi<arr.length-1){
            
            if (leftSum == rightSum){return equi;}
            
            leftSum += arr[equi];
            rightSum -= arr[equi+1];

            
            equi++;

        }

        return -1;

}


public static void main(String[] args) {
    
    
    int[] arr = {2, 3, 10, -10, 4, 2, 9};

    System.out.println("Equilibrium Index of the Array is:" + euilibriumIndex(arr));
}
}

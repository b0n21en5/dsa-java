import java.util.*;

public class RowWiseSum_2D_Array {

    public static void print2D(int[][] arr){
        int rows = arr.length, cols=arr[0].length;

        for (int i = 0; i <rows ; i++) { 

            for (int j = 0; j < cols; j++) { 
                System.out.print(arr[j][i] + " "); 
            } 
            System.out.println();
        } 
    }


    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter Number of columns: ");
        int col = sc.nextInt();
        int[][] arr = new int [rows][col]; 

        for (int i=0; i<col;i++){
            for (int j=0;j<rows;j++){
                System.out.println("Enter value at "+j+"-column, "+i+"-row");
                arr[j][i] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
        
    }


    public static void rowWiseSum(int[][] mat) {
        
		int ro = mat.length, i =0;
        
        for (;i<ro;i++){
            
            int su=0, co = mat[0].length;
            if (co==0){break;}
            
            for (int j=0;j<co;j++){
                su += mat[i][j];
            }
            System.out.println("Sum of "+(i+1)+"-th Row is: "+su+" ");
        }
	}



    public static void main(String[] args) 
{ 
    

    int[][] arr = takeInput();
    System.out.println("\nArray u have Entered is: ");
    print2D(arr);
    rowWiseSum(arr);

}
    
}

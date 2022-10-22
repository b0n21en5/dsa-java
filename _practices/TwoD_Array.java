import java.util.Scanner;

public class TwoD_Array {
    
    public static void main(String[] args) 
{ 
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

    for (int i = 0; i <col ; i++) { 
        for (int j = 0; j < rows; j++) { 
            System.out.print(arr[j][i] + " "); 
        } 
        System.out.println();
    } 


    for (int i = 0; i < rows; i++) { 
        for (int j = 0; j < col; j++) { 
            System.out.print(arr[i][j] + " "); 
        } 
        System.out.println();
    } 

    
} 
}

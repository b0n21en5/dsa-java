public class Spine_Wave_Ordering_Matrix {
    

    public static void wavePrint(int mat[][]){
        int rows=mat.length,cols=0, i=0;
        
        if (rows!=0){ cols=mat[0].length;}
        
		for (;i<cols;){
            
            int v = rows*cols, j=0;
            // if (cols==0 || rows==0){break;}
            
            for (;j<rows;j++){
                System.out.print(mat[j][i] + " ");
            }
            i++;
            
            
            if (i*j==v){break;}
            j--;
            
            
            for (;j>-1;j--){
                System.out.print(mat[j][i] + " ");
            }
            i++;
            
        }
	}



    public static void main(String[] args) {
        
        int[][] arr = {{6, 9, 8, 5}, {9, 2, 4, 1}, {8, 3, 9, 3}, {8, 7, 8, 6 }};

        int rows = arr.length, cols = arr[0].length;

        System.out.println("Spine Wave Ordering of "+rows+"x"+cols+" Matrix below: ");
        

        wavePrint(arr);
    }
}

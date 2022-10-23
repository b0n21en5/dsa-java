public class Total_Sum_Matrix {


    public static void totalSum(int[][] mat) {

		int rows=mat.length,diag=0; 

        for (int i=0;i<rows;i++){

            int cols=mat[0].length;

            if (rows==0 || cols==0){break;}
            
            for (int j=0;j<cols;j++){
                
                if (i==0 || i==rows-1){
                    diag += mat[i][j];
                }

                if(i!=0 && i!=rows-1 && (j==0 || j==cols-1)){
                    diag += mat[i][j];
                }
                
                if (i!=0 && i!=rows-1 && i==j){
                    diag+=mat[i][j];
                }
                
                if (i!=0 && i!=rows-1 && i+j==rows-1){
                    diag+=mat[i][j];
                    if (i==j){diag-=mat[i][j];}
                }
                
            }
        }
        System.out.println(diag);

	}
    


    public static void main(String[] args) {
        
        int[][] arr = {{6, 9, 8, 5}, {9, 2, 4, 1}, {8, 3, 9, 3}, {8, 7, 8, 6 }};

        totalSum(arr);
    }
}

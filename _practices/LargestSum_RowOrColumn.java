public class LargestSum_RowOrColumn {
    
    public static void findLargest(int mat[][]){
        
		int row_max=Integer.MIN_VALUE, col_max=Integer.MIN_VALUE, row_index=0,col_index=0, rows=mat.length;
        int res=row_max, ind=row_index;
        String ans="row ";
        for (int i = 0; i<rows;i++){
            
            int j=0, cols=mat[0].length, sum=0;
            if (cols==0){break;}
            for (;j<cols;j++){
                sum+=mat[i][j];
            }
            
            if (sum>row_max){
                row_max = sum;
                row_index = i;
            }
            
            for (int k=0;k<cols;k++){
                int csum=0;
                for (int s=0;s<rows;s++){
                    csum+=mat[s][k];
                }
                if (csum>col_max){
                    col_max=csum;
                    col_index =k;
                }
                
            if (row_max<col_max){
                res = col_max;
                ind = col_index;
                ans="column ";
            }else{
                res = row_max;
                ind = row_index;
                ans="row ";
            }
            }
        }
        
        System.out.println(ans+ind+" "+res);

	}


    public static void main(String[] args) {

        int[][] arr = {{6, 9, 8, 5}, {9, 2, 4, 1}, {8, 3, 9, 3}, {8, 7, 8, 6 }};

        findLargest(arr);
    }
}

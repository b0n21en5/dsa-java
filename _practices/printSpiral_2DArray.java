public class printSpiral_2DArray {

    public static void spiralPrint(int matrix[][]){
		int r=0,c=0,rows=matrix.length,cols=0,rl=1,cl=0,t=Integer.MIN_VALUE;

        if (rows!=0){
            cols=matrix[0].length;

            while (r<rows && c<cols){
                
                for (;c<cols-1;c++){
                    System.out.print(matrix[r][c]+" ");
                }
                
                
                int k=r;

                for (;r<rows-1;r++){
                    System.out.print(matrix[r][c]+" ");
                }
                
                if (k!=r){
                    t=c;
                    for (;c>cl;c--){
                        System.out.print(matrix[r][c]+" ");
                    }
                    cl++;
                }
                
                
                if (t!=c){
                    for(;r>rl;r--){
                        System.out.print(matrix[r][c]+" ");
                    }
                    rl++;
                }

                

                rows--;
                cols--;

            }
            System.out.print(matrix[r][c]+" ");
        }
	}

    

    public static void main(String[] args) {

        int[][] arr = {{1 ,2 ,3, 4 ,5} ,{6, 7 ,8 ,9 ,10 },{11 ,12 ,13, 14, 15 },{16, 17, 18, 19, 20 },{21, 22, 23 ,24 ,25 }};
        
        int[][] arr2 = {{1,2}, {3,4}};

        int[][] arr3 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};

        int[][] arr4 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

        int [][] arr5 = {};

        spiralPrint(arr3);

    
    }



}

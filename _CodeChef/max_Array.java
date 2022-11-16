import java.util.Scanner;

public class min_max_Array {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0){
		    
		    int n =sc.nextInt();
		    int[] arr = new int[n];
            int max = -55;
		    
		    for (int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
                if (arr[i]>max)
                    max = arr[i];
		    }
		    
		    
		    System.out.println(max);
		    
		    t--;
		}
    }
}

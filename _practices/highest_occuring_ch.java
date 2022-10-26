import java.util.*;

public class highest_occuring_ch {


	public static char highestOccuringChar(String str) {
		
        int[] arr = new int[128];
        
        for (int i=0;i<str.length();i++){
            arr[str.charAt(i)]++ ;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        for (int e=0;e<arr.length;e++){
            if (arr[e]==max){
                return (char) e;
            }
        }

        return ' ';
	}


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();

       System.out.println( highestOccuringChar(str));

        sc.close();
    }
}

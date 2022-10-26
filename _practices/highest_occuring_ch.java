import java.util.*;

public class highest_occuring_ch {
    

    public static int occu(String str, char ch){
        int c=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==ch){c++;}
        }
        return c;
    }

	public static char highestOccuringChar(String str) {
		
        int[] arr = new int[128];
        
        for (int i=0;i<str.length();i++){
            arr[str.charAt(i)] = occu(str, str.charAt(i)) ;
        }

        int ch=0;
        int mx=arr[0];
        for (int e=1;e<arr.length;e++){
            if (arr[e]>mx){
                mx = arr[e];
                ch = e;
            }
        }

        return (char) ch;
	}


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();

       System.out.println( highestOccuringChar(str));

        sc.close();
    }
}

import java.util.Scanner;

public class substrings {
    

    public static void printSubstrings(String str) {
		int l = str.length();
        for (int i=0;i<l;i++){
            for (int j=i;j<=l;j++){
                System.out.println();
                System.out.print(str.substring(i,j));
                
            }
        }
	}


    public static void substrings(String str){
        int l=str.length();
        for (int i=0;i<l;i++){
            for (int j=i+l-1;j<l-i;j++){
                System.out.println(str.substring(i, j));
            }
            
            
        }
    }



    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        String str =sn.next();

        // printSubstrings(str);
        substrings(str);

        sn.close();
    }
}

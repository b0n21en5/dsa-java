import java.util.Scanner;

public class Highest_Character_Occurance {
    

    public static int occu(String str, char ch){
        int c=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==ch){c++;}
        }
        return c;
    }

	public static char highestOccuringChar(String str) {
		char ch=0;
        int mx=Integer.MIN_VALUE;
        for (int i=0;i<str.length();i++){
            if (occu(str, str.charAt(i))>mx){
                ch = str.charAt(i);
                mx = occu(str, str.charAt(i));
            }
        }
        return ch;
	}


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String str1 = sn.next();

        System.out.println("Highest Occured Character is: "+highestOccuringChar(str1));
    }
}

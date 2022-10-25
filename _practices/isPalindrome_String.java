import java.util.*;

public class isPalindrome_String {
    

    public static boolean isPalindrome(String str){
        
        boolean res=true;
        int j=0;

        for (int i=str.length()-1;i>=0;i--){
            if (str.charAt(i)!=str.charAt(j)){
                res = false;
            }
            j++;
        }
        
        return res;
    }

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
        String str = sn.next();
        str = str.toLowerCase();
        System.out.println(isPalindrome(str));

        sn.close();
	}
}

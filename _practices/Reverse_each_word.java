import java.util.Scanner;

public class Reverse_each_word {
    

    public static String reverseEachWord(String str) {
		String res = new String();
        
        int i=0,st=0;
        
            
        for (;i<str.length();i++){
            
			String rev = "";
            
            if (str.charAt(i)==' '){
                int end = i;
                for (int j=st;j<end;j++){
                    rev = str.charAt(j) + rev;
                }
                res += rev +" ";
                st=i+1;
                
            }
        }
        
        
        int end = i;  
        String rev = "";
        for (int j=st;j<end;j++){
                    rev = str.charAt(j) + rev;
                }  
        res += rev;
        
        return res;
	}



    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String str1 = sn.nextLine();
        

        System.out.println(reverseEachWord(str1));

        sn.close();
    }

}
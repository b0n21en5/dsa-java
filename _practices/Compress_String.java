import java.util.Scanner;

public class Compress_String {
    

    public static String getCompressedString(String str) {
    	int c=1;
		String res = new String();
        
        res += str.charAt(0);
        char p = str.charAt(0);
        for (int i=1;i<str.length();i++){
            
            if (p==str.charAt(i)){
                c++;
                p = str.charAt(i);
            }
            else{
                if (c>1){
                    res += c;
                    c = 1;
                }
                p = str.charAt(i);
                res += str.charAt(i);
            }
        }
        if (c>1){
                    res += c;
                    c = 1;
                }
        return res;
	}


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String str1 = sn.nextLine();

        System.out.println(getCompressedString(str1));

        sn.close();
}
}
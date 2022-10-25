import java.util.Scanner;

public class isPermutated {



    public static boolean isPermutation(String str1, String str2) {
        boolean res=true;
        int l=str1.length(), l2=str2.length(), p=Integer.MIN_VALUE;
        char c='9';
        
        
        
        
		for (int i=0;i<l;i++){
            
            if (l!=l2 || str1.indexOf(str2.charAt(i))==-1 || str1.indexOf(str2.charAt(i))==p){
                res=false;
            }else{
                p = str1.indexOf(str2.charAt(i));
                c = str2.charAt(i);
            }
        }

        for (int i=0;i<l2;i++){
            
            if (l!=l2 || str2.indexOf(str1.charAt(i))==-1 || str1.indexOf(str2.charAt(i))==p){
                res=false;
            }else{
                p = str1.indexOf(str2.charAt(i));
            }
        }
        
        
        return res;
	}



    public static boolean isPermute2(String str1, String str2){
        boolean res=true;
        char[] str_1 = str1.toCharArray();
        char[] str_2 = str2.toCharArray();
        int v=1;

        for (int i=0;i<str_1.length;i++){
            for (int j=0;j<str_2.length;j++){
                if (str_1[i]==str_2[j]){
                    str_2[j] = 0;
                    v=1;
                    break;
                }
                else{v=0;}
            }
            if (v==0){return false;}
        }

        for (int e:str_2){if (e!=0){ res=false;}}
        return res;
    }


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String str1 = sn.next();
        String str2 = sn.next();

        System.out.println(isPermute2(str1, str2));

        // System.out.println(isPermutation(str1, str2));


        sn.close();
    }
}

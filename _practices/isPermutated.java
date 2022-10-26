import java.util.*;
// import com.google.common.primitives.Chars;

public class isPermutated {

    public static int occu(String str, char ch){
        int c=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==ch){c++;}
        }
        return c;
    }


    public static boolean isperm(String str1,String str2){
        if (str1.length()!=str2.length()){return false;}
        StringBuffer str1_ = new StringBuffer(str1);
        StringBuffer str2_ = new StringBuffer(str2);

        for (int i=0;i<str1_.length();i++){
            if (str1.indexOf(str2.charAt(i))==-1){return false;}
            else if (str2_.indexOf(Character.toString(str1_.charAt(i)))!=-1){
                str2_.delete(str2_.indexOf(Character.toString(str1_.charAt(i))), str2_.indexOf(Character.toString(str1_.charAt(i)))+1);

            }
            else{return false;}
        }
        return true;
    }



    public static boolean isPermutation(String str1, String str2) {

        if (str1.length() != str2.length()){return false;}
        
        char[] str_1 = str1.toCharArray();
        char[] str_2 = str2.toCharArray();
        Arrays.sort(str_1);
        Arrays.sort(str_2);
        int v=1;
        
        

        for (char ch:str_1){
            for (int j=0;j<str_2.length;j++){
                if (ch==str_2[j]){
                    str_2[j] = 0;
                    v=1;
                    break;
                }
                v=0;
            }
            if (v==0){return false;}
        }

        
        return true;
	}



    // public static boolean isPermutation4(String str1, String str2) {

    //     if (str1.length() != str2.length()){return false;}
        
    //     char[] str_1 = str1.toCharArray();
    //     char[] str_2 = str2.toCharArray();
    //     Arrays.sort(str_1);
    //     Arrays.sort(str_2);
    //     // int v=1;
        
        

    //     for (char ch:str_1){
    //         if (Chars.contains(str_2,ch)){

    //         }
    //     }

        
    //     return true;
	// }



    public static void isPermute2(String str1, String str2){
        // if (str1.length()!=str2.length()){return false;}
        // boolean res=true;
        char[] str_1 = str1.toCharArray();
        char[] str_2 = str2.toCharArray();
        Arrays.sort(str_1);
        Arrays.sort(str_2);

        for (char e:str_1){
            System.out.print(e+" ,");
        }
        System.out.println();
        
        for (char e:str_2){
            System.out.print(e+" ,");
        }

        for (int i=0;i<str_1.length;i++){
    //         
            if (str_1[i]!=str_2[i]){System.out.println(false);}
//                 return false;
//             
            //    }
    //         return true;
        }

    //     for (int e:str_2){if (e!=0){ res=false;}}
    //     return res;
    }


    public static boolean perm(String str1, String str2){
        int[] arr = new int[128];
        for (int i=0;i<str1.length();i++){
            
            
            arr[str1.charAt(i)] += occu(str1, str1.charAt(i));
        }

        for (int i=0;i<str2.length();i++){
            
            
            arr[str2.charAt(i)] -= occu(str2, str2.charAt(i));
        }

        for (int e:arr){
            if (e!=0){return false;}
        }
        return true;
        
    }


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String str1 = sn.next();
        String str2 = sn.next();

        // System.out.println(isPermute2(str1, str2));
        // isPermute2(str1, str2);

        // System.out.println(isperm(str1, str2));

        System.out.println(porm(str1, str2));

        // System.out.println(isPermutation(str1, str2));


        sn.close();
    }


    public static boolean porm(String str1, String str2){
        
        if (str1.length()!=str2.length()){return false;}
        
        
        
        
        
		for (int i=0;i<str1.length();i++){
            
            if ( str1.indexOf(str2.charAt(i))==-1){
                return false;
            }
        }
        
        
        for (int i=0;i<str2.length();i++){
            
            if (str2.indexOf(str1.charAt(i))==-1){
                return false;
            }
        }

        StringBuffer str1_ = new StringBuffer(str1);
        StringBuffer str2_ = new StringBuffer(str2);

        for (int i=0;i<str1_.length();i++){
            if (str2_.indexOf(Character.toString(str1_.charAt(i)))!=-1){
                str2_.delete(str2_.indexOf(Character.toString(str1_.charAt(i))), str2_.indexOf(Character.toString(str1_.charAt(i)))+1);

            }
            else{return false;}
        }

        
        
        return true;
    }
}

import java.util.*;
// import com.google.common.primitives.Chars;

public class isPermutated {

    public static boolean isPermutation(String str1, String str2){

        if (str1.length() != str2.length()){return false;}

        int[] arr = new int[128];

        for (int i=0; i<str1.length();i++){
            arr[str1.charAt(i)]++;
        }

        for (int i=0;i<str2.length();i++){
            arr[str2.charAt(i)]--;
        }

        for (int e:arr){
            if (e!=0){
                return false;
            }
        }
        return true;
    }


    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String str1 = sn.next();
        String str2 = sn.next();


        System.out.println(isPermutation(str1, str2));


        sn.close();
    }


    
}

import java.util.Scanner;

class isPalindrome{

    public static boolean pali(String str, int j, int i, boolean res){

        if (j<0 && i>str.length()-1){return res;}
        if (str.charAt(i)!=str.charAt(j)){
            res = false;
            return res;
        }

        pali(str, j-1, i+1, res);

        return res;
    }
    

    public static boolean isPali(String input){
        boolean res = true;
        res = pali(input, input.length()-1, 0, res);

        return res;
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(isPali(str));
    }
}
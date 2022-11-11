import java.util.Scanner;

class isPalindrome{

    public static boolean pali(String str, int j, int i){

        if (i==j)
            return true;

        if (str.charAt(i)!=str.charAt(j))
            return false;

        if (i<j+1)
            return pali(str, j-1, i+1);

        return true;
    }
    

    public static boolean isPali(String input){
        int n = input.length();

        if (n==0)
            return true;

        return  pali(input, n-1, 0);
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        System.out.println(isPali(str));

        s.close();
    }
}
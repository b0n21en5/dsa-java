import java.util.Scanner;

public class Palindrome {


    public static boolean isPalindrome(int num){

        int y = num;

        if (num<0) return false;

        int rev = 0;

        while (num>0){
            rev =  (rev*10) + (num%10)  ;

            num /= 10;
        }

        return rev==y?true:false;
    }


    public static void main(String[] args) {

         Scanner sn = new Scanner(System.in);

         int x = sn.nextInt();

         System.out.println(isPalindrome(x));


         sn.close();
    }
}

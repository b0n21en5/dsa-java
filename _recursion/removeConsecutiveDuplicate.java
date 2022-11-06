import java.util.Scanner;

public class removeConsecutiveDuplicate {
    public static String pi(String str){

        if (str.length()<=1){return str;}

        if (str.charAt(0) == str.charAt(1)){
            String small = str.charAt(0) + str.substring(2);
            return pi(small);
        }

        else{
            return str.charAt(0) + pi(str.substring(1));
        }
    }


    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        String str = s.nextLine();

        System.out.println(pi(str));
    }
}

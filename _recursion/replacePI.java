import java.util.Scanner;

public class replacePI {
    
    public static String pi(String str){

        if (str.length()<=1){return str;}

        if (str.charAt(0)=='p' && str.charAt(1)=='i'){
            return 3.14 + pi(str.substring(2));
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

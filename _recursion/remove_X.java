import java.util.Scanner;

public class remove_X {

    static String res = "";
    
    public static String removeX(String str, char chr){

        if (str.length()==0){return res;}

        if (str.charAt(0)!=chr){res += str.charAt(0);}

        return removeX(str.substring(1), chr);
    }



    static Scanner s= new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Type a word: ");
        String str = s.nextLine();

        System.out.println("Type a character to remove: ");
        char chr = s.nextLine().charAt(0);


        System.out.println("After remove word is: "+removeX(str, chr));

    }
}

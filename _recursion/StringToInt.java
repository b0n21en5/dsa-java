import java.util.Scanner;

public class StringToInt {


    static int x = 0;  // x variable will store the value of coverted string
    
    public static int StringToInt(String str){


        //this method will covert string into int
        // recursively,



        // base case: when length of the string
        //  will become 1 method will return 
        // x as int value of string

        if (str.length()==1){
            x = (x*10) + Integer.parseInt(str.substring(0, 1));
            return x;
        }


        //method will recursively call itself and add int
        //value of string to the decimal place to 
        // x variable at the same time length of
        // string will be sliced with substring

        else{
            x = (x*10) + Integer.parseInt(str.substring(0, 1));
            return StringToInt(str.substring(1));
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("only type string of int here: ");

        String str = sc.nextLine();

        System.out.println("int value of " + str + " is " + StringToInt(str));

        sc.close();
    }
}

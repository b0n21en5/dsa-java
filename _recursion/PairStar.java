//this java program will recursively  add "*" 
// between two consecutive same characters

import java.util.Scanner;

public class PairStar {
    
    static String res = "";

    public static void pairStar(String str, int i){

        //this method will add * between two 
        // consecutive characters after called

        res += str.charAt(i);


        // base case: when becomes the length of 
        // the string method will return itself

        if (i==str.length()-1)
            return;


        // below if statement will add * between two same char
        if (str.charAt(i) == str.charAt(i+1)){
            res += "*";
        }


        pairStar(str, i+1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        pairStar(str, 0);

        System.out.println("after calling pairStar method string is: " + res);
    }
}

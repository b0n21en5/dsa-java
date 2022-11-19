import java.util.Scanner;

public class RomanToInt {
    
    public static int value(char c){

        // this method will return corresponding int value of roman character
        // i=1; v=5; x=10; l=50; c=100; d=500; m=1000;

        switch (c){
            case 'i':return 1;

            case 'v': return 5;
            
            case 'x': return 10;

            case 'l': return 50;

            case 'c': return 100;

            case 'd': return 500;

            case 'm': return 1000;
        }

        return -1;
    }


    public static int romanToInt(String s){

        int res =0;

        for (int i=0; i<s.length();i++){

            int cr = value(s.charAt(i));

            if (i+1<s.length()){

                int right = value(s.charAt(i+1));


                //if current char value is less than right char value
                // then deduct it from result variable
                if (cr<right)
                    res -= cr;

                //if current char value is greater or equal to right
                // char value then add it to result variable
                else
                    res += cr;
            }

            
            else  //this will add the last char value regardless of comparing further
                res += cr;
        }


        return res;
    }


    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);  //initializing scanner object

        System.out.println("Type roman Number here: ");
        String roman = sn.nextLine();   //user input of roman number

        
        System.out.println("Corresponding Integer of '"+ roman + "' is: "+ romanToInt(roman.toLowerCase()));  //method call


    }
}

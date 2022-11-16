import java.util.Scanner;
public class equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x_count=0, o_count=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='x'){x_count ++;}
            else{o_count++;}
        }

        if (x_count==o_count){System.out.println("X and O are equal");}
        else{System.out.println("X & O are not equal");}
    }
}
import java.util.Scanner;

public class NegPos {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b = scn.nextInt();
        if (a*b<0){
            System.out.println("One is Positive & One is Negative");
        }else{
            System.out.println("Both Either Positive or Negative");
        }
    }
}

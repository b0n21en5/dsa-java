import java.util.Scanner;

public class Calculator_switch {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Num: ");
        int n1  = sc.nextInt();
        System.out.println("Enter 2nd Num: ");
        int n2 = sc.nextInt();
        System.out.println("Enter Choice: + - * / %");
        char c= sc.next().charAt(0);

        switch(c){
            case '+':
                System.out.println("Addition of " + n1+ " and " +n2 +" is = " + (n1+n2));
                break;
            case '-':
                System.out.println("Subtraction of " + n2 +" from "+n1 + " is = "+ (n1 - n2));
                break;
            case '*':
                System.out.println("Multiplication of " + +n1 +" with " + n2 + " is = " + (n1*n2));
                break;
            case '/':
                System.out.println("Division of "+ n1 + " by " + n2 + " is = " + (n1/n2));
                break;
            case '%':
                System.out.println(n1 + " Modulo "+ n2 + " is = " + (n1%n2));
                break;
            default:
                System.out.println("Invalid Choice..");
            }
    }
}

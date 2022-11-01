import java.util.Scanner;

public class Calculator_switch {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Num: ");
        int n1  = sc.nextInt();
        System.out.println("Enter 2nd Num: ");
        int n2 = sc.nextInt();
        System.out.println("Enter: + - * /");
        char c= sc.next().charAt(0);

        switch(c){
            case '+':System.out.println(n1+n2);
            break;
            case '-':System.out.println(n1-n2);
            break;
            case '*':System.out.println(n1*n2);
            break;
            case '/':System.out.println(n1/n2);
            }
    }
}

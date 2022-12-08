import java.util.Scanner;


//Encapsulation in java refers to integrating
//data(variables) and code(methods) into a single unit
// 
//in encapsulation data variables are hidden from other class's
//& can only be accessed by the methods in which thy are found

class bank{

    static Scanner sc = new Scanner(System.in);

    private int bal=5000; int pwd;



    public void check_balance(int pwd){
        
        if (pwd==12345678)
            System.out.println("You'r bank balance is: " + bal);

        else
            System.out.println("Invalid Credential!");
    }




    public void deposit(int pwd){

        if (pwd==12345678){
            System.out.println("How much money u want to deposit: ");
            int wtd = sc.nextInt();
            bal += wtd;
            System.out.println("Balance after deposit of "+ wtd + " is: " + bal);
        }

        else
            System.out.println("Invalid Credential!");
    }



    public void withdraw(int pwd){

        if (pwd==12345678){
            System.out.println("How much money u want to withdraw: ");
            int depo = sc.nextInt();
            bal -= depo;
            System.out.println("Balance after withdraw of " + depo+" is: " + bal);
        }

        else
            System.out.println("Invalid Credential!");

    }


}



class customer {
    
    static Scanner sc = new Scanner(System.in);

    public void customer() {
        bank cust = new bank();

        System.out.print("1.Check balance\n2.Withdraw\n3.Deposit\nEnter you'r choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter you'r current password: ");
        int pwd = sc.nextInt();


        switch(ch){
            case 1:cust.check_balance(pwd);
            break;

            case 2:cust.withdraw(pwd);
            break;

            case 3:cust.deposit(pwd);
            break;

            default:System.out.println("Invalid choice!");
        }
    }
}


public class encapsulation{
    public static void main(String[] args) {
        
        customer cust = new customer();

        cust.customer();
    }
}

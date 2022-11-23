import java.util.Scanner;


//multiple inheritance is the capability of creating
// a single class with multiple super classes


//unlike other popular OOPs languages java does
// not support multiple inheritance but we can achive
// it through interface because interface only provides
// abstract method which implementation provided by
// the sub classes


interface sum{
    static Scanner scn = new Scanner(System.in);

    void add();
}

interface subtracts{

    void sub();
}


interface multiply{

    void multi();
}


interface divide{

    void div();
}

interface remain{
    void rem();
}



public class multiple_inheritance implements sum, subtracts, multiply, divide, remain{

    int a, b;

    void input(){
        
        System.out.println("Enter two numbers: ");
        a = scn.nextInt();
        b = scn.nextInt();
    }

    public void add(){

        System.out.println("Addition of "+ a + " & " + b +" is " + (a+b));
    }


    public void sub(){
        System.out.println("Subtraction of "+ b + " from " + a +" is " + (a-b));
    }


    public void multi(){
        System.out.println("Multiplication of "+ a + " with " + b +" is " + (a*b));
    }


    public void div(){
        System.out.println("Division of "+ a + " by " + b +" is " + (a/b));
    }


    public void rem(){
        System.out.println("Remainder of "+ a+" % "+ b + " is " + (a%b));
    }


    public static void main(String[] args) {

        multiple_inheritance Calcu = new multiple_inheritance();

        System.out.println("Multiple Inheritance program:");

        Calcu.input();
        Calcu.add();
        Calcu.sub();
        Calcu.multi();
        Calcu.div();
        Calcu.rem();
    }


}

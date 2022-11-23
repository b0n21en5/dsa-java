import java.util.Scanner;

//multi-level inheritance is the involvement
// of atleast two or more than two class


//one class inherits the propierties of one parent class
//then newly created sub-class becomes the base-class for 
// another new class


public class MultilevelInheritance {
    
    public static void main(String[] args) {

        Calculator fst = new Calculator();

        fst.input();fst.add();fst.sub();fst.multi();fst.div();fst.rem();

    }

}

class addition{

    Scanner s = new Scanner(System.in);

    int a, b;

    void add(){
        System.out.println("Addition class: Addition of "+a + " & "+ b + " is "+(a+b));
    }
}


class Subtraction extends addition{

    

    void sub(){
        System.out.println("Subtraction class: Subtraction of "+b + " from "+ a + " is "+(a-b));
    }
}

class division extends Subtraction{

    void div(){
        System.out.println("Division class:  Division of "+a + " by "+ b + " is "+(a/b));
    }
}


class multiplication extends division{

    void multi(){
        System.out.println("Multiplication class: Multiplication of "+a + " with "+ b + " is "+(a*b));
    }
}


class remainder extends multiplication{

    void rem(){
        System.out.println("Remainder class: Remainder of "+a + " % "+ b + " is "+(a%b));
    }

}


class Calculator  extends remainder{

    void input(){

        System.out.println("This is Calculator\n" + "Enter two numbers: ");

        

        a = s.nextInt();
        b = s.nextInt();
    }
}

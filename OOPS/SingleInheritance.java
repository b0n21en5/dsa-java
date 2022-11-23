import java.util.Scanner;


//single inheritance is the simplest type of inheritance
//in this, a class inherits propierties from a single class



class SingleInheritance{

    public static void main(String[] args) {
        
        std_id pn = new std_id();


        pn.input();
        pn.disp();
    }

}


class students{
    static Scanner s = new Scanner(System.in);
    int roll, marks;
    String name;
    protected int id;

    void input(){

        System.out.println("What is you'r name? ");
        name = s.next();
        System.out.println("roll no: ");
        roll = s.nextInt();
        System.out.println("Enter marks: ");
        marks = s.nextInt();
        
    }
}


class std_id extends students{

    void disp(){
        System.out.println(marks + " marks obtained by "+name+ " & roll no is "+roll);
    }
}
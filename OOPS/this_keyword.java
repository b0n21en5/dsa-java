// this keyword is the reference variable of class


public class this_keyword {


    //calling parameterized constructor
    this_keyword(){
        this(200);
    }

    this_keyword(int x){
        System.out.println("Score is " + x);
    }





    //calling default constructor
    // this_keyword(){
    //     System.out.println("Hello Coder!");
    // }

    // this_keyword(int x){
    //     this();
    //     System.out.println(x);
    // }




    
    //refering current object
    // int rollno; String name; float fee;

    // this_keyword(int rollno, String name, float fee){

    //     // this.rollno = rollno;
    //     // this.name = name;
    //     // this.fee = fee; 
    // }



    // void display(){
    //     System.out.println(rollno+" "+name + " "+ fee);
    // }


    public static void main(String[] args) {

        // this_keyword ref = new this_keyword(01, "Anhkit", 4000f);
        // ref.display();


        this_keyword ref = new this_keyword();
    }

}

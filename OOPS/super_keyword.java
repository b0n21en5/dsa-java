class super_class {
    
    int x = 82; String str = "Shubankar";

    super_class(){
        System.out.println("Super class constructor");
    }

    void print(){
        System.out.println("Learn anywhere");
    }

}

class sub_class extends super_class{
    

    int x=89; String str= "Shubam";

    sub_class(){

        // super class constructor will run by default
        //but for parameterized constructor we must
        // call super constructor & pass the params
        
        System.out.println("Sub class constructor");
    }

    void show(){
        System.out.println("Marks obtained by "+str+" is: " + x);

        //super keyword is used to call variable from super class
        System.out.println("Marks obtained by "+super.str+" is: " + super.x); 
    }


    void print(){

        super.print();  //super will run print method from super class
        System.out.println("& Improve skills..");
    }
}


class super_keyword{

    public static void main(String[] args) {
        sub_class ref = new sub_class();

        ref.show();
        ref.print();
    }
}

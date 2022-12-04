public class instance_and_static {
    int b = 5;
    static int a=2;

    instance_and_static(){
        System.out.println("Inside default constructor..");
    }


    //instance block
    {

        // instance deals with object


        //object is must needed to access instance block

       //instance block calls before constructor
       //
        
        System.out.println("Inside instance block");


        //instance block can access both static 
        // and non-static variable

        System.out.println(a+" "+b);

    }


    
    static{

        // static deals with class


        //static block runs when program compiled
        // no need for object initiation
        // static runs even before instance block

        System.out.print("Inside static block ");



        // static block can only access static variable
        System.out.println(a);
    }


    public static void main(String[] args) {
        
        instance_and_static ref = new instance_and_static();
    }


}

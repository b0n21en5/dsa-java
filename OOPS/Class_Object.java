public class Class_Object {
    int age  = 25;
    int height = 164;
    int weight = 60;
    String color = "Brwon";

    void sleep(){
        System.out.println("Currently i m sleeping around 2 to 3 am mostly..");
    }

    void eating()
    {
        System.out.println("breakfast:10 - 12, lunch:2.30 - 3.30, dinner:8 - 9.30");
    }


    public static void main(String[] args) {

        Class_Object person = new Class_Object();
        // System.out.println("My current age is "+person.age);
        // System.out.println("My height is "+person.height+" cm");
        // System.out.println("My current weight is "+person.weight+" kg");
        // System.out.println(person.color);
        // person.sleep();
        // person.eating();


        constru prsn = new constru();  //default constructor
        // prsn.person();



        //parameterized constructor
        param_const ref = new param_const(95,"Gourmani");
        ref.print();


        //copy constructor
        copy_const ref2 = new copy_const();
        
        
    }
}



// Constructor
class constru{

    int a; String name;

    constru(){  //default constructor
        a = 25; name = "Bikash";
    }


    void person()
    {
        System.out.println("Age is "+ a+" name is " + name);
    }
}

class param_const{
    int x; String str;

    param_const(int a, String s){  //parameterized constructor
        str = s;
        x = a;

    }


    void print (){
        System.out.println("Marks obtained by "+str+" is: " + x);
    }
}



class copy_const{
    int a; String s;
 
    copy_const(){   //default constructor
        a = 90; 
        s = "Kayach";
        System.out.println("Marks obtained by "+  s+ " is: " +a);
    }

    copy_const(copy_const ref){  //copy_constructor
        ref.a = a;
        ref.s = s;
        System.out.println("Marks obtained by "+ s+" is: "+ a);
    }
}
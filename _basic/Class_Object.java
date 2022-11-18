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

        constru prsn = new constru();

        prsn.person();

        // System.out.println("My current age is "+person.age);
        // System.out.println("My height is "+person.height+" cm");
        // System.out.println("My current weight is "+person.weight+" kg");
        // System.out.println(person.color);
        // person.sleep();
        // person.eating();
    }
}



// Constructor
class constru{

    int a; String name;

    constru(){
        a = 25; name = "Bikash";
    }


    void person()
    {
        System.out.println("Age is "+ a+" name is " + name);
    }


    
}


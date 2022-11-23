// runtime polymorphism or dynamic method dispatch is a process
// to resolve a call to an overridden method at runtime



/*RunTime Polymorphism */


public class methodOverRiding {
    
    public static void main(String[] args) {
        
        shape shp = new square();
        shp.show(); // will call only overridden method


        shape sp = new round();
        // sp.show(); //will  call both parent & sub class method


        shape sp1 = new rectangle();
        // sp1.show();  // will call sub class method

    }
}


class shape{

    void show(){
        System.out.println("Unkown Shape");
    }
}

class rectangle extends shape{

    void show(){
        System.out.println("Rectangle Shape");
    }

}



//overridden method is runtime polymorphism
class square extends shape{

    @Override  // annotation ensures that the succeeding method must overridden
    void show(){
        System.out.println("Square Shape");
    }
}

class round extends shape{

    void show(){
        super.show();
        System.out.println("Round Shape");
    }
}

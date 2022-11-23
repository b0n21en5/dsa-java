

public class interface_class {
    public static void main(String[] args) {

        tvs cst = new tvs();
        cst.start();cst.stop();cst.speed();
        cst.color();


        honda hnd = new honda();
        hnd.start();hnd.stop();hnd.speed();hnd.color();
        
    }
}



//in class name instead abstract keyword interface used 
interface vehicle{

    String model = "TVS";  //public + static + final

    void start();  //public + abstract method without abstract key

    void stop(); //public + abstract method without abstract key


    // default method in interface introduced after jdk v-1.8
    default void speed(){
        System.out.println("TVS model speed is 100 KM/H");
    }


    //static methods also can be implemented
    static void wheel(){
        System.out.println("TVS bikes have 2 vehicle, lol!");
    }

    
}



//in interface instead of extends keyword implements  used
class tvs implements vehicle{

    @Override  // annotation
    public void start(){
        System.out.println("start(): insert key & press accelarator");
    }

    @Override
    public void stop(){
        System.out.println("stop(): exit key");
    }

    static void color(){
        System.out.println("TVS model color is Red");
    }
    
}



class honda implements vehicle{
    @Override
    public void start(){
        System.out.println("start(): insert key & press accelarator");
    }

    @Override
    public void stop(){
        System.out.println("stop(): Exit key");
    }

    void color(){
        System.out.println("Honda color is blue and red");
    }

    @Override
    public void speed(){
        System.out.println("Honda speed is 125 Km/H");
    }

}

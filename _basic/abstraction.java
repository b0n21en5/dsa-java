
//data abstraction is a process of hiding 
//some info and showing only essential info to user




public class abstraction {

    public static void main(String[] args) {

        rabbit rb = new rabbit();
        rb.eat();rb.sound();rb.legs();rb.height();rb.colour();



        dog dg = new dog();
        dg.eat();dg.sound();dg.legs();dg.height();



        cow cw = new cow();
        cw.eat();cw.sound();cw.legs();cw.height();

    }
    
}



//abstract class
abstract class animal{

    void legs(){
        System.out.println("have 4 legs");
    }

    abstract void sound();
    abstract void eat();
    abstract void height();
}

class rabbit extends animal{
    @Override
    void sound(){
        System.out.println("Rabbits does not make sound");
    }

    void eat(){
        System.out.println("Rabbits use to eat carrot");
    }

    void height(){
        System.out.println("Rabbits height are less than 2-feet");
    }

    void colour(){
        System.out.println("Rabbit can be white, black or mixed Color");
    }
}


class dog extends animal{

    @Override
    void sound(){
        System.out.println("Dog sounds like Bow Bow..");
    }

    void eat(){
        System.out.println("Dogs loves to meat");
    }

    void height(){
        System.out.println("Dogs are less than 3-feet height");;
    }

    

}


class cow extends animal{

    @Override
    void sound(){
        System.out.println("Cows sounds like Awwww Awwww..");
    }

    void eat(){
        System.out.println("Cows eats grass");
    }

    void height(){
        System.out.println("Cows are less than 4-feet height");
    }
}




public class private_constructor {
    int a; String str;


    private private_constructor(){  // private constructor cant accessed from other class
        a=78;
        str = "Dibakar";
        System.out.println("Marks obtained by "+str+" is: " + a);
    }


    public static void main(String[] args) {
         private_constructor pv = new private_constructor();
    }
}




// when multiple sub classes inherit methods & paropierties of one 
// parent class then it is called hierarchical inheritance


class hierarchical{

    public static void main(String[] args) {

        programmer p = new programmer();
        p.salary();

        java_developer  jd = new java_developer();
        jd.salary();

        system_designer sd = new system_designer();
        sd.salary();
        
    }
}



class employee{
    float salary = 40000;

    
}


class programmer extends employee{
    int bonus = 10000;

    void salary(){
        System.out.println("Programmer salary is "+(salary+bonus));
    }
}

class java_developer extends employee{
    int bonus = 12000;

    void salary(){
        System.out.println("Java-Developer salary is "+(salary+bonus));
    }
}


class system_designer extends employee{
    int bonus = 15000;

    void salary(){
        System.out.println("System designer salary is "+(salary+bonus));
    }
}
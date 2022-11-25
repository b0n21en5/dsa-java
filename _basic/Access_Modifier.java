


// access modifier in java specifies the accessibilty
//  or scope of a field, method, constructor or class



public class Access_Modifier {

    private void private_func(){
        System.out.println("private method only accessible within class");
    }


    void default_func(){
        System.out.println("default method can accessed outside class");
    }


    protected void protected_func(){
        System.out.println("except outside package, protected method can accessible anywhere");
    }


    public void public_func(){
        System.out.println("public method can accessible anywhere");
    }


    public static void main(String[] args) {

        Access_Modifier am = new Access_Modifier();

        am.private_func();
        am.default_func();
        am.protected_func();
        am.public_func();

    }


}

// String without new keyword called string
// literal and stored in string constant pool



// string with new keyword is actually a string object
// and directly stored in Heap memory


// both carries different reference's




public class string {
    
    public static void main(String[] args) {
        
        

        String str = "hello world";

        String str1 = "hello";

        // if (str == str1){
        //     System.out.println("equal");
        // }
        // else
        // System.out.println("not equal");



        // System.out.println(str);

        String str2 = new String(" hello world");

        // System.out.println(str2);

        // System.out.println(str.length());
        // System.out.println(str.charAt(4));

        // System.out.println(str.substring(0, 5));

        // System.out.println(str.indexOf("w"));


        String new_str = str.concat(str2);

        System.out.println(new_str);

        // if (str.equals(str2)){
        //     System.out.println("both are equal");
        // }
        // else
        // System.out.println("not equal");
    }
}

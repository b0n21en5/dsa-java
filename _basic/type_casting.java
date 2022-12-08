public class type_casting {
    
    public static void main(String[] args) {
        
        String str = "1213";   // numerical string


        int n = Integer.parseInt(str);   // String to integer

        String str2 = Integer.toString(n);  //Integer to String

        byte b = (byte) n;  // integer to byte

        short st = (short) n;  // int to char

        long lg = (long) b;  // byte to long

        System.out.println(str + 5);
        System.out.println(n + 5);

        System.out.println(str2+ " " + st + " " + lg + " " + b);
    }
}

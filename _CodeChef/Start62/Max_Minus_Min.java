import java.util.Scanner;

class Max_Minus_Min{
    static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {
        int t = s.nextInt();
        while (t>0){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            if (a>b && a>c)
                System.out.println(a-Math.min(b,c));

            else if (b>a && b>c)
                System.out.println(b-Math.min(a,c));

            else
                System.out.println(c-Math.min(a,b));
            t--;
        }
    }
}
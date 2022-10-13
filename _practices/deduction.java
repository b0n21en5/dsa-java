import java.util.Scanner;
import java.lang.Exception;

/* Name of the class has to be "Main" only if the class is public. */
class Deduction
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner inp = new Scanner(System.in);
		int T = inp.nextInt();
		for (int i=0;i<T;++i){
            System.out.println("$10 will deducted if u earn more than $1000: ");
		    int x = inp.nextInt();
		    if (x>1000){
		        System.out.println(x-10+" you got after deduct");
		    }else{
		        System.out.println(x+" you got after deduct");
		    }
		}
	}
}
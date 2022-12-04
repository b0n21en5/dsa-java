import java.io.IOException;
import java.util.Scanner;

public class Ternary_Operator {

    // ternary operator is alternate to 
    // if-else conditional statement
    // syntax of ternary is follows:
    // condition ? ifConditionTrue : ifConditionFalse;
    

    public static void main (String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while (t>0){
		    int x = sc.nextInt();

            //below line of code is ternary operator
		    String res = x >= 2000 ? "YES" : "NO"; //storing value to a variable condition wise

            //printing the result
		    System.out.println(res);
		    t--;
		}

		sc.close();
	}
}

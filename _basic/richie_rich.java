import java.util.Scanner;
import java.lang.Exception;

public class richie_rich {
    

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int x = sc.nextInt();
		    System.out.println((b-a)/x);
		    t--;
		}
	}


}

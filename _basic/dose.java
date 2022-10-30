
import java.util.Scanner;
import java.lang.Exception;



class dose
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t>0){
		    int d = sc.nextInt();
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    if (d<l){
		        System.out.println("Too Early");
		    }
		    else if(d>r){
		        System.out.println("Too Late");
		    }
		    else{System.out.println("Take second dose now");}
		    t--;
		}
	}
}
import java.util.Scanner;


class TimeComplexity{

    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t>0){

		    int x = sc.nextInt();
		    int y = sc.nextInt();


            //yes & no will print based on condition using ternary operator
		    System.out.println( x>y ? "YES" : "NO");  

            t--;
        
        

		}
	}
}
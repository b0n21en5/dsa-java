import java.util.Scanner;


class Hearable
{
	public static void main (String[] args)
	{
		Scanner inp = new Scanner(System.in);
		int T = inp.nextInt();
		int i = 0;
		while (i<T){
            System.out.println("Type frequency of your machine: ");
		    int x = inp.nextInt();
		    if (x>=67 && x<=45000){
		        System.out.println("YES its hearable..");
		    }else{
		        System.out.println("NO its not hearable!");
		    }
		    ++i;
		}
	}
}
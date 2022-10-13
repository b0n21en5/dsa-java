import java.util.Scanner;

class Run
{
	public static void main (String[] args)
	{
		Scanner inp = new Scanner(System.in);
		int T = inp.nextInt();
		for (int i=0;i<T;i++){
		    int arr[] = new int[2];
		    for (int j=0;j<2;j++){
		        arr[j] = inp.nextInt();
		    }
		    System.out.println((arr[0]-arr[1])+" runs needed to win!");
		}
	}
}

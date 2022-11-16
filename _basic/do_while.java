import java.util.Scanner;

class do_while{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number: ");

		int num = sc.nextInt();

		do{
			System.out.print(num + " ");
			++num;
		}
		while(num<10);{
			System.out.println("\n" + num + " Learn Coding");
		}
	}
}
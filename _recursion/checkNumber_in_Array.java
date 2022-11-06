import java.util.Scanner;
import java.util.Arrays;

public class checkNumber_in_Array {

    public static boolean checkNumber(int input[], int x) {

		if(input.length ==  0)
			return false;

		if(input[0]== x) 
			return true;

		return checkNumber(Arrays.copyOfRange(input, 1, input.length), x);
		
	}
    

    static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));
	}
}

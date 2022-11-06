import java.util.Arrays;
import java.util.Scanner;
public class sum_array {

    public static int sum(int input[]) {
		if (input.length==0){return 0;}

		return input[0] + sum(Arrays.copyOfRange(input, 1, input.length));
		
	}
    


    static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(sum(input));
	}
}

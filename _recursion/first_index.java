import java.util.Arrays;
import java.util.Scanner;

public class first_index {
    

    public static int firstIndex(int input[], int x) {
		
		if(input.length==0){return -1;}

		if(input[0] == x){return 0;}

		int res = firstIndex(Arrays.copyOfRange(input,1,input.length),x);

		if (res==-1)
			return -1;
		else
			return res + 1;
		
	}



    static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(firstIndex(input, x));
	}


}

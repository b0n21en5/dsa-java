import java.util.Scanner;

public class Reverse_Word_Wise {
    

    public static String reverseWordWise(String input) {
        int l=input.length();
		String[] arr = input.split(" ",l);
        String reverse="";
        for (int i=arr.length-1;i>=0;i--){
            reverse += arr[i]+" ";
        }
        
        
        return reverse;
        

	}


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String str = sn.nextLine();

        System.out.println(reverseWordWise(str));


        sn.close();
    }
}

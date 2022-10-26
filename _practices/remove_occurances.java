import java.util.Scanner;

public class remove_occurances {
    

    public static String removeAllOccurrencesOfChar(String str, char ch) {
		String v="";
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=ch){
                v+=str.charAt(i);
            }
        }
        return v;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(removeAllOccurrencesOfChar(str, 'c'));

        sc.close();
    }
}

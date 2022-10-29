public class minLength_word_string {
    
    public static String minLengthWord(String input){
		String[] arr = input.split(" ");
        String min ="bdfhvbgfjhvbfgjhvbdfjvhdfjkvfdkjvndf";
        for (int i=0;i<arr.length;i++){
            if (arr[i].length()<min.length()){
                min = arr[i];
            }
        }
        
        return min;
        
	}


    public static void main(String[] args) {

        String str = "we say namaste this is India";

        System.out.println(minLengthWord(str));
    }
}

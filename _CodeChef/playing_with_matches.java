import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class playing_with_matches {
    
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken());
        while (t-->0){
            String[] val = br.readLine().split(" ");
            int n = Integer.parseInt(val[0]) + Integer.parseInt(val[1]);

            /*first approach */
            int[] arr = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
            int sum=0;
            while(n>0){
                int rem = n%10;
                sum += arr[rem];
                n /= 10;
            }




            /*different approach */
            // String str = String.valueOf(n);
		    // int sum=0;
		    // for (int i=0;i<str.length();i++){
    		//     switch (str.charAt(i)){
    		//         case '0':sum+=6;break;
    		//         case '1':sum+=2;break;
    		//         case '2':sum+=5;break;
    		//         case '3':sum+=5;break;
    		//         case '4':sum+=4;break;
    		//         case '5':sum+=5;break;
    		//         case '6':sum+=6;break;
    		//         case '7':sum+=3;break;
    		//         case '8':sum+=7;break;
    		//         case '9':sum+=6;break;
		    //     } 
		    // }


            System.out.println(sum);
        }
    }
}

import java.io.*;
public class Counting_Pretty_Numbers {
    

    public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t>0){
		    int l = Integer.parseInt(br.readLine());
		    int r = Integer.parseInt(br.readLine()), count=0;
		    for (;l<=r;l++){
		        int rmd = l%10;
		        if (rmd==2 || rmd==3 || rmd==9){
		            count ++;
		        }
		    }
		    System.out.println(count);
		}
	}
}



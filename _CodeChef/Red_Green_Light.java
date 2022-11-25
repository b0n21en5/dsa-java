import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Red_Green_Light {
    
    public static void main(String[] args) throws java.lang.Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        while(t-->0){
            String[] str = br.readLine().split(" ");

            String[] i = br.readLine().split(" ");

            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);

            int c=0;
            for (int j=0;j<n;j++)
                if (Integer.parseInt(i[j])>k) c++;

            System.out.println(c);
        }
    }
}

import java.util.*;
public class total_salary {
    public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
        float hra,da,pf,all;
        int ts = sn.nextInt();
        String st = sn.next().toUpperCase();
        char g = st.charAt(0);
        hra = (ts * .2f);
        da =  (ts * .5f);
        pf =  (ts * .11f);
        if (g=='A'){
            all = 1700;
        }else if (g=='B'){
            all = 1500;
        }else{
            all = 1300;
        }
        System.out.println(Math.round(ts+hra+da+all-pf));

        sn.close();
        

	}
}

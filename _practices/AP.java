import java.util.*;
public class AP {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int i=1, n =s.nextInt();
        for (;i<=n;i++){
            int sr = (3*i)+2;
            if (sr%4!=0){
                System.out.print(sr+" ");
            }else{
                n+=1;
            }
        }
    }
}

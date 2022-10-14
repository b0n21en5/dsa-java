import java.util.*;
import java.lang.*;
import java.io.*;


class Is_greater
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int x,y;
		Scanner sv = new Scanner(System.in);
        System.out.println("Enter two space separated numbers: ");
		x = sv.nextInt();
	    y = sv.nextInt();
	    if (x<y){
	        System.out.println("2nd num is Greatest..");
	    }else if (x>y){
	        System.out.println("1st num is Greatest..");
	    }else{
            System.out.println("Equal Numbers..");
        }
		
	}
}

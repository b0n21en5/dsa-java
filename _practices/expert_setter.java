import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int T,x,y;
		Scanner scn = new Scanner(System.in);
		T = scn.nextInt();
		while (T-->0){
		    x = scn.nextInt();
		    y = scn.nextInt();
		    if (y>=(x*.5)){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}

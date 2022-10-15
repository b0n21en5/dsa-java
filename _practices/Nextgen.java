

import java.util.*;
import java.lang.*;
import java.io.*;



class Nextgen
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int T,a,b,x,y;
		Scanner scn = new Scanner(System.in);
		T = scn.nextInt();
		while (T-->0){
		    a = scn.nextInt();
		    b = scn.nextInt();
		    x = scn.nextInt();
		    y = scn.nextInt();
		    if ((x*y)>=(a*b)){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}




import java.util.*;
import java.lang.*;
import java.io.*;



class Paper_cut
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,k,n;
		Scanner scn = new Scanner(System.in);
		t = scn.nextInt();
		while (t-->0){
		    n = scn.nextInt();
		    k = scn.nextInt();
		    System.out.println((int) (Math.floor(n/k)*Math.floor(n/k)));
		}
	}
}


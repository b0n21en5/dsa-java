

import java.util.*;
import java.lang.*;
import java.io.*;



class Ranklist
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,x,res;
		Scanner scn = new Scanner(System.in);
		t = scn.nextInt();
		while (t-->0){
		    x = scn.nextInt();
		    res = (int) Math.ceil(x/25.0);
		    System.out.println(res);
		}
	}
}


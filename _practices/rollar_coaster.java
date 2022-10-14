

import java.util.*;
import java.lang.*;
import java.io.*;


class Roller_Coaster
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scn = new Scanner(System.in);
        System.out.println("If min. height limit meets then u r good to go.");
        System.out.println("put u'r height then min. height:");
		int T = scn.nextInt();
		while(T-->0){
		    int x = scn.nextInt();
		    int h = scn.nextInt();
		    if (x<h){
		        System.out.println("NO, u can't ride");
		    }else{
		        System.out.println("Happy ride");
		    }
		}
	}
}

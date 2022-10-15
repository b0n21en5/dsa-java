 

import java.util.*;
import java.lang.*;
import java.io.*;



class Speciality
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,x,y,z,mx;
		Scanner scn = new Scanner(System.in);
		t = scn.nextInt();
		while (t-->0){
		    x = scn.nextInt();
		    y = scn.nextInt();
		    z = scn.nextInt();
		    mx = Math.max(x,Math.max(y,z));
		    
		    if (mx==x){
		        System.out.println("Setter");
		    }else if (mx==y){
		        System.out.println("Tester");
		    }else{
		        System.out.println("Editorialist");
		    }
		}
	}
}




import java.util.Scanner;
import java.lang.Exception;


class Taller
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int j = 0;
		Scanner inp = new Scanner(System.in);
		int T = inp.nextInt();
		while (j<T){
		    int arr[] = new int[2];
		    for (int i=0;i<2;i++){
		        arr[i] = inp.nextInt();
		    }
		    if (arr[0]>arr[1]){
		        System.out.println("Alice is taller than Bob");
		    }else{
		        System.out.println("Bob is taller than Alice");
		    }
		    j++;
		    
		}
	}
}


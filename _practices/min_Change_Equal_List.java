

import java.util.*;
import java.lang.*;
import java.io.*;


class min_Change_Equal_List
{
    public static int cntOccur(int[] arr, int v,int l){
        int res = 0;
        for (int i=0;i<l;i++){
            if (arr[i]==v){
                res++;
            }
        }
        return res;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Number of Test Cases:");
		int t = sn.nextInt();
		while(t>0){
			System.out.println("Size of the Array: ");
		    int n = sn.nextInt();
		    int count=0,mxc=Integer.MIN_VALUE;
		    int[] arr=new int[n];
			System.out.println("Enter values of "+n+" size of Array: ");
		    for (int i=0;i<n;i++){
		        arr[i] = sn.nextInt();
		        
		    }
		    
		    
		    for(int i=0;i<n;i++){
		        if (cntOccur(arr,arr[i],n)>mxc){
		            mxc = arr[i];
		        }
		    }
		    for(int i=0;i<n;i++){
		        if (mxc!=arr[i]){
		            count++;
		        }
		    }
		    System.out.println("Minimum Changes needed to make the values of List Equal: "+count);
		    
		    
		    t--;
		}
	}
}

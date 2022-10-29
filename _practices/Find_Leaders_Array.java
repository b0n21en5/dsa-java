import java.util.*;
public class Find_Leaders_Array {
    
    public static void leaders(int[] input) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
        int l=input.length;
        for (int i=0; i<l-1;i++){
            int v=0;
            for (int j=i+1;j<l;j++){
                if (input[i]<input[j]){
                    v=1;
                    break;
                }
                
                
            }
            if (v==0){arr.add(input[i]);}
            if (i==l-2){arr.add(input[l-1]);}
            
        }
        Collections.sort(arr);
        for(int e:arr){
            System.out.print(e+" ");
        }
		
	}


    public static void main(String[] args) {
        int[] arr = {975,
            446, 107, 111, 209, 383, 431, 257, 313, 423, 498, 415 ,93 ,145, 457, 92, 171, 300, 248, 192, 6, 410 ,55, 356, 334 ,145, 307, 115 ,500 ,254, 118, 7 ,32 ,421, 292, 410 ,77 ,116 ,498 ,224 ,61, 239 ,394, 290, 189 ,228 ,322 ,475 ,497 ,164, 300 ,257, 338, 449, 296, 356, 195 ,163 ,234 ,496 ,289, 372, 408, 262, 366, 384, 314 ,225, 7 ,233 ,35 ,28 ,182 ,95 ,85 ,471, 62 ,240, 124, 363, 453, 223, 157 ,370 ,373, 88 ,206, 465 ,60, 69, 79 ,244 ,283 ,51 ,159, 375, 456, 395, 120 ,271 ,94, 151 ,235 ,229 ,159 ,214, 322, 267, 285, 40, 1, 203, 299 ,209 ,282 ,147 ,304 ,365 ,479, 62, 402, 379, 243, 323 ,421 ,484, 369, 358, 208 ,90} ;


        System.out.println("Leaders of the given Array are: ");

        leaders(arr);
    }
}

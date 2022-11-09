public class QuickSort {

    public static int partition(int[] a,int si, int ei){
        int c=0;
		for(int i=si+1;i<=ei;i++){
			if (a[si]>=a[i]){c++;}
			}

		int tmp = a[si + c];
		a[si + c] = a[si];
		a[si] = tmp;

		int j=si, k=ei;
		while (j<k){
			if (a[j]<a[c]){j++;}
            else if (a[k]>=a[c]){k--;}
            else{
                tmp = a[j];
				a[j] = a[k];
				a[k] = tmp;
				j++;
				k--;
                }

            }
        return si+c;
    }
    
    public static void quickSort(int[] a,int si, int ei){

		if (si>=ei){return;}
			
		int c = partition(a, si, ei);
		
        quickSort(a, si, c-1);
        quickSort(a, c+1, a.length-1);
	}

    public static void quickSort(int[] a){
        quickSort(a, 0, a.length-1);
    }



    public static void printArray(int[] a){
		for (int i:a){
			System.out.print(i+ " ");
		}
	}


    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 1, 4, 7, 9, 8};

        int[] arr2 = {3, 2, 5,6, 5, 6, 1, 4, 8, 3, 9 ,7};

        quickSort(arr2);

        printArray(arr2);
    }
}

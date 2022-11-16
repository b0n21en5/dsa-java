

class for_each{

	public static void main (String args[]){

		int[] arr = {1 , 5 , 8, 12, 6, 9, 20, 24};


		// for-each loop iterates through all elements
		// it's primarily used in iterating array/list
		// incrementation happens by itself in for_each

		for (int element : arr){
			System.out.print(element + " , ");
		}
	}
}
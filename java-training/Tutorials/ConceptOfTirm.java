public class ConceptOfTirm {

	public static void main(String[] args) {
		// creating a String object
		String str = new String(" 11 22 44 33 55 66 ");
		// remove space from first and end, and split by space
		String arr[] = str.trim().split(" ");
		// create an integer array 
		int arr2[] = new int[arr.length];
		
		// put it all numbers form String to  integer
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		// display all elements
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}

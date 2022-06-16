package BinarySearch;

public class Main {

	public static void main(String[] args) {
		int[] array;
		
		array = new int[50];
		
		for(int i = 0; i < 50; i++) {
			array[i] = i;
		}
		
		BinarySearch bs = new BinarySearch();
		
		bs.search(array, 12);
		bs.search(array, 200);
	}

}

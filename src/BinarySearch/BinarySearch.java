package BinarySearch;

public class BinarySearch 
{
	public void search(int[] array, int target) {
		
		// Lower Bound
		int low = 0;
		int high = array.length - 1;
		
		while(low < high) {
			
			int mid = low + (high - low) / 2;
			
			if(array[mid] < target) {
				low = mid + 1;
				System.out.println("Target " + target + " not found, setting low to " + low);
			} else if (array[mid] > target) {
				high = mid - 1;
				System.out.println("Target " + target + " not found, setting high to " + high);
			} else {
				System.out.println("Target " + target + " is at index " + mid);
				return;
			}
		}
		
		System.out.println("Target " + target + " is not found.");
	}
	
}

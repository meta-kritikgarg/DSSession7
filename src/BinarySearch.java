/**
 * 
 * @author Kritik Garg
 *
 */
public class BinarySearch {
	int NOT_FOUND = -1;
	int index = NOT_FOUND;

	/**
	 * Public method to search an element by binary search
	 * 
	 * @param array
	 *            int[] input array
	 * @param element
	 *            int element to find
	 * @return int index of element
	 */
	public int findElementByBinarySearch(int[] array, int element) {
		index = NOT_FOUND;
		binarySearch(array, 0, array.length - 1, element);
		return index;
	}

	/**
	 * Private method to search an element by binary search
	 * 
	 * @param array
	 *            int[] input array
	 * @param start
	 *            int start index of array
	 * @param end
	 *            int end index of array
	 * @param element
	 *            int element to find
	 * @return int index of element
	 */
	private void binarySearch(int[] array, int start, int end, int element) {
		int mid = (start + end) / 2;
		if (end < start) {
			return;
		}

		if (array[mid] == element) {
			index = mid;
		}

		if (array[mid] >= element) {
			binarySearch(array, start, mid - 1, element);
		} else {
			binarySearch(array, mid + 1, end, element);
		}
	}

}
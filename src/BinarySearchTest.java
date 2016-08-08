import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testFindElementByBinarySearch() {
		int[] inputArray = {1,1,2,3,4,5,5,5,5,6,7,8,9,11,13,14,16,16,16,17,32,43,54};
		BinarySearch binarySearch = new BinarySearch();
		assertEquals(5, binarySearch.findElementByBinarySearch(inputArray, 5));
		assertEquals(0, binarySearch.findElementByBinarySearch(inputArray, 1));
		
		assertEquals(-1, binarySearch.findElementByBinarySearch(inputArray, 12));
		
		assertEquals(16, binarySearch.findElementByBinarySearch(inputArray, 16));

	}

}

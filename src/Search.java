import java.util.Scanner;

public class Search {

	public static void main(String[] args) {

		Search search = new Search();
		BinarySearch binarySearch = new BinarySearch();
		int[] input2 = search.getIntArrayfromUser("Array for Binary search");
		int elementToFind2 = search.getIntfromUser(" Find ");
		int result2 = binarySearch.findElementByBinarySearch(input2,
				elementToFind2);
		if (result2 != binarySearch.NOT_FOUND) {
			System.out.println("Element found at " + result2);
		} else {
			System.out.println("Element Not found");
		}
		System.out.println("Process End.");
	}

	/**
	 * Method to read array data from standard input
	 * 
	 * @param arrayName
	 *            String Name of array for message
	 * @return int[] array of integer
	 */
	public int[] getIntArrayfromUser(String arrayName) {
		Scanner s = new Scanner(System.in);
		int number = 0;

		while (true) {
			try {
				System.out.println("Enter number of elements for " + arrayName);
				number = s.nextInt();
				if (number > 0) {
					break;
				} else {
					System.out.println("Try Again");
				}
			} catch (Exception e) {
				System.out.println("Invalid Input");
				s.next();
			}
		}

		int[] array = new int[number];
		System.out.println("Enter elements for " + arrayName);
		// For reading Array
		for (int i = 0; i < number; i++) {
			while (true) {
				try {
					array[i] = s.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("Invalid Input, Try again");
					s.next();
				}
			}
		}
		return array;
	}

	/**
	 * Method to read integer data from standard input
	 * 
	 * @param Name
	 *            of variable to print
	 * @return int value of integer
	 */
	public int getIntfromUser(String Name) {
		Scanner s = new Scanner(System.in);
		int number = 0;
		while (true) {
			try {
				System.out.println("Enter " + Name);
				number = s.nextInt();
				if (number > 0) {
					break;
				} else {
					System.out.println("Invalid, Try Again");
				}
			} catch (Exception e) {
				System.out.println("Invalid, Try again");
				s.next();
			}
		}
		return number;
	}

}

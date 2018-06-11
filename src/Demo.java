
import javax.swing.*;

public class Demo {

	private static int MAX_SIZE = 1000;

	// This sort method is used to sort the array ascendingly.
	private static void sort(long[] a) {
		System.out.println("Sorting " + a.length + " values, please wait...");

		int bottom = a.length - 2;

		boolean exchanged = true;

		while (exchanged) {
			exchanged = false;
			for (int i = 0; i <= bottom; i++) {
				if (a[i] > a[i + 1]) {
					long temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					exchanged = true;
				}
			}

			bottom--;
		}
	}

	// This is the main method

	public static void main(String[] args) {
		int arraySize = (int) (Math.random() * MAX_SIZE);

		long[] array1 = new long[arraySize];
		long[] array2 = new long[arraySize];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = (long) (Math.random() * MAX_SIZE / 4);
			array2[i] = array1[i];
		}

		sort(array2);

		// get the search key
		String keyS = JOptionPane.showInputDialog(null, "Value to find (0- " + MAX_SIZE / 4 + ") : ");
		long key = Long.parseLong(keyS);

		// start searching for values
		while (key > 0) {

			// search for key in array1
			int i = 0;
			while (i < array1.length && array1[i] != key)
				i++;
			if (i == array1.length)
				System.out.println(key + " NOT FOUND in array1. " + i + " comparisons made.");

			else
				System.out.println(key + " found in array1 at position " + i + " and " + i + " comparisons made");

			// search for key in array2 (which is sorted)
			i = 0;
			int low = 0;
			int high = array2.length - 1;
			int mid = (low + high) / 2;
			while (low <= high && array2[mid] != key) {
				i++;
				if (array2[mid] < key)
					low = mid + 1;
				else
					high = mid - 1;
				mid = (low + high) / 2;
			}

			if (low > high)
				System.out.println(key + " NOT FOUND in array2. " + i + " comparisons made.");

			else
				System.out.println(key + " found in array2 at position " + mid + ". " + i + " comparisons made. ");

			keyS = JOptionPane.showInputDialog(null, "Value to find (0- " + MAX_SIZE / 4 + ") : ");
			key = Long.parseLong(keyS);
			;

		}
		System.out.println("Done");
	}

}

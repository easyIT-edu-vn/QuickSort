package thuattoanquicksort;

public class ThuatToanQuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		int[] mArray = { 1, 11, 6, 8, 3, 4, 7, 9 };

		QuickSort(mArray, 0, 7);
		for (int k = 0; k < 8; k++) {
			System.out.println(mArray[k]);
		}

	}

	public static void QuickSort(int array[], int left, int right) {
		int i, j, midKey;
		midKey = array[(left + right) / 2];
		i = left;
		j = right;
		do {
			while (array[i] < midKey) {
				i++;
			}
			while (array[j] > midKey) {
				j--;
			}
			if (i <= j) {

				swap(array, i, j);
				i++;
				j--;

			}

		} while (i <= j);
		if (left <= j) {
			QuickSort(array, left, j);
		}
		if (i < right) {
			QuickSort(array, i, right);
		}
	}

	/**
	 * 
	 * @param a
	 *            first index
	 * @param b
	 *            second index
	 */
	public static void swap(int pArray[], int pFirstIndex, int pSecondIndex) {
		int temp = pArray[pFirstIndex];
		pArray[pFirstIndex] = pArray[pSecondIndex];
		pArray[pSecondIndex] = temp;
	}

}

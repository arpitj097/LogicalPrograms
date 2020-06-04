package ashok.it.array;

/*Write Java Program to find second Min and Second Max elements in given Array ?

Input: 1, 2, 5, 9, 6, 4, 7, 2
Output: Second Min-2  Second Max-7*/

public class SecondMaxMinElement {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 9, 6, 9, 7, 1 };

		getSecondMaxMin(arr, arr.length);

	}

	public static void getSecondMaxMin(int[] a, int length) {
		int temp;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		//To neglect duplicate in max element
		int maxIndex = 0;
		for (int i = 1; i < length; i++) {
			if (a[0] != a[i]) {
				maxIndex = i;
				break;
			}
		}

		//To neglect duplicate in min element
		int minIndex = 0;
		for (int i = length - 2; i >= 0; i--) {
			if (a[length - 1] != a[i]) {
				minIndex = i;
				break;
			}
		}

		System.out.println("Second Max: " + a[maxIndex]);
		System.out.println("Second Min: " + a[minIndex]);
	}
}

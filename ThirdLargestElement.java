package ashok.it.array;

/*Write a Java program to find third largest number in given Array ? (Done)

Input = { 6, 8, 1, 9, 2, 1, 10}
Output: Third largest element : 8

Int [] a = { 6, 8, 1, 9, 2, 1, 10, 12}
Output: Third largest element : 9

Int [] a = {6}
Output: Invalid Input, array size is less than 3*/

public class ThirdLargestElement {
	public static void main(String[] args) {
		int arr[] = { 9, 2, 12, 5, 4, 7, 3, 19, 5 };

		getThirdLargest(arr, arr.length);

	}

	public static void getThirdLargest(int[] a, int length) {
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

		// To neglect duplicate in max element
		int maxIndex = 0;
		for (int i = 2; i < length; i++) {
			if (a[0] != a[i]) {
				maxIndex = i;
				break;
			}
		}

		System.out.println("Third largest element : " + a[maxIndex]);
	}
}

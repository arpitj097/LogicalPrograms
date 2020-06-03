package ashok.it.array;

/*Write a java program to find maximum difference between two elements in given Array?
Input = { 2, 5, 1, 7, 3, 9, 5}
Output = 8  */

public class FindMaxDifference {
	public static void main(String[] args) {
		int arr[] = {  2, 5, 1, 7, 3, 9, 5 };

		maxDifference(arr);
	}

	public static void maxDifference(int[] arr) {
		int maxDiff = 0;
		int diff = 0;
		int n1 = 0;
		int n2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				diff = arr[i] - arr[j];
				if (diff < 0)
					diff = diff * (-1);

				if (diff > maxDiff) {
					maxDiff = diff;
					if (arr[i] > arr[j]) {
						n1 = arr[i];
						n2 = arr[j];
					} else {
						n1 = arr[j];
						n2 = arr[i];
					}
				}
			}
		}
		System.out.println("The maximum difference is between " + n1 + " and " + n2 + " and it is " + maxDiff);
	}
}

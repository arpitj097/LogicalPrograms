package ashok.it.array;

/*Write a Java Program to find Min and Max elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:   Min : 1  Max : 7*/

public class FindMinMaxElement {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 15, 20, 30, 70, 80, 120 };

		findMinMaxElement(arr);

	}

	public static void findMinMaxElement(int[] arr) {
		int min = arr[0];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j] && arr[i] > max) {
					max = arr[i];
				} else if (arr[i] < arr[j] && arr[i] < min)
					min = arr[i];
			}
		}
		System.out.println("Max: " + max + " Min: " + min);
	}
}

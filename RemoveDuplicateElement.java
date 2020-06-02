package ashok.it.array;

import java.util.Arrays;
import java.util.List;

/*Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:  1, 2, 5, 6, 7*/
public class RemoveDuplicateElement {
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 5, 5, 6, 6, 7, 2 };

		removeDuplicate(arr);

	}

	public static void removeDuplicate(Integer[] arr) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					for (int k = j; k < size - 1; k++) {
						arr[k] = arr[k + 1];
					}
					arr[size - 1] = null;
					size--;

				}
			}
		}

		List<Integer> list = Arrays.asList(arr);
		list.forEach(n -> System.out.print(n + " "));
	}
}

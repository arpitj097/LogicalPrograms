package ashok.it.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Input = {1, 6, 4, 3, 2, 2, 3, 8, 1};
Output : 24 
(Unique elements are: 1, 6, 4, 3, 2, 8)

Input= {1, 1, 3, 2, 2, 3};
Output : 6 
(Unique elements are: 1, 2, 3)*/

public class SumOfUniqueElement {
	public static void main(String[] args) {
		int[] arr = { 1, 6, 4, 3, 2, 2, 3, 8, 1};
		Arrays.sort(arr);
		sumUniqueElement(arr);
	}

	public static void sumUniqueElement(int[] arr) {

		int sum = 0;
		boolean flag = false;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
				}
			}
			if (!flag) {
				list.add(arr[i]);
				sum = sum + arr[i];
			}
		}
		System.out.println("Output: "+sum);
		System.out.print("(Unique elements are: ");
		list.forEach(n -> System.out.print(n + " "));
		System.out.print(")");
	}
}

package ashok.it.array;

import java.util.ArrayList;
import java.util.List;

/*Write a Java Program to find duplicate elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:  2, 5, 6*/

public class FindDuplicateInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 5, 6, 6, 7, 2};
		
		findDuplicate(arr).forEach(n -> System.out.print(n+" "));
		
	}

	public static List<Integer> findDuplicate(int[] arr) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
				}
			}
			if (flag) {
				list.add(arr[i]);
			}
		}
		return list;
	}
}

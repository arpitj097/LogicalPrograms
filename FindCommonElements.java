package ashok.it.array;

import java.util.ArrayList;
import java.util.List;

/*Write a Java Program to find common elements among below 3 Arrays?

Input: 

ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}

Output: 20, 80*/

public class FindCommonElements {
	public static void main(String[] args) {
		int arr1[] = { 1, 5, 10, 20, 40, 80 };
		int arr2[] = { 6, 7, 20, 80, 100 };
		int arr3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

		findCommonElement(arr1, arr2, arr3);
	}

	public static void findCommonElement(int arr1[], int arr2[], int arr3[]) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					for (int k = 0; k < arr3.length; k++) {
						if (arr1[i] == arr3[k])
							list.add(arr1[i]);
					}
				}
			}
		}
		list.forEach(n -> System.out.print(n + " "));
	}
}

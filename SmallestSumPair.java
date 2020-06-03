package ashok.it.array;

/*Write a Java Program to find smallest pair sum in given Array?

Input: arr[] = {1, 7, 2, 9, 6}
Output: 3
The pair (1, 2) will have the minimum sum pair i.e. 1 + 2 = 3
*/
public class SmallestSumPair {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 10, 20, 40, 80 };

		smallestPairSum(arr);
	}

	public static void smallestPairSum(int arr[]) {
		int sum = arr[0] + arr[1];
		int n1 = 0;
		int n2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					if ((arr[i] + arr[j]) <= sum) {
						n1 = arr[i];
						n2 = arr[j];
						sum = arr[i] + arr[j];
					}
				}
			}
		}
		System.out.println("The pair (" + n1 + "," + n2 + ") will have the minimum sum pair i.e. " + n1 + "+" + n2
				+ " = " + (n1 + n2));
	}
}

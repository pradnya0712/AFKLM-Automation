package BasicCodes;

import java.util.Scanner;

public class SearchElementUSingLinearSearch {
	public static void main(String[] args) {

		int[] arr = { 23, 2, 56, 45, 78, 90, 120 };
//		Arrays.sort(arr);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element that u want to search in array:");
		int search = sc.nextInt();

		// int search = 78;
		// int count = 0;
		Boolean flag = false;

		for (int i : arr) {

			if (i == search) {

				flag = true;
				// count++;
				break;
			}

		}
		
		if (flag) {
			System.out.println("Element found in array: " + search);
		} else {
			System.out.println("Element not found in array: " + search);
		}

	}

}

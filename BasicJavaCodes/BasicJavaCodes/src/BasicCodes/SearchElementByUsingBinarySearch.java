package BasicCodes;

import java.util.Arrays;

public class SearchElementByUsingBinarySearch {
	public static void main(String[] args) {
		int[] arr = { 23, 56, 43, 1, 89, 67, 100 };
		Arrays.sort(arr);
		// pre-requsities for binary search is array should be in sorted format.
		System.out.println("Sorted arrays is: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		int mid = arr.length / 2;
		System.out.println("Mid element at index: "+mid);
		int search = 89;
		boolean flag = false;
		// System.out.println(arr[3]);
		
		//----------------first approach----------------------//
		System.out.println("element found at index: " + Arrays.binarySearch(arr, 89));

		
		
		//--------------------Second approach-----------------------//
		if (search > arr[mid]) {
			for (int i = mid; i <= arr.length - 1; i++) {
				if (search == arr[i]) {
					System.out.println("Element found at right side of mid point at index: " + i);
					flag = true;
					break;
				}

			}
		}

		else if (search < arr[mid]) {
			for (int j = 0; j < mid; j++) {
				if (search == arr[j]) {
					System.out.println("element found at left side of mid point at index: " + j);
					flag = true;
					break;
				}

			}
		}

		else if (search == arr[mid]) {
			System.out.println("Element is similar to the mid element");
			flag = true;
		}

		if (flag == false) {
			System.out.println("Element not found");
		}

	}

}

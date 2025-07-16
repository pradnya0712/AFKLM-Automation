package BasicCodes;

import java.util.Arrays;
import java.util.Scanner;

public class removeElementFromArray {

	public static int[] removeElement(int[] Array, int element) {

		int[] newArray = new int[Array.length - 1];
		int index = 0;

		for (int i = 0; i < Array.length; i++) {
			try {

				if (Array[i] != element) {
					newArray[index] = Array[i];
					index++;
				}

			} catch (Exception e) {

				// System.out.println("Element not found");
			}

		}
		return newArray;

	}

	public static void main(String[] args) {
		int[] originalArray = { 12, 43, 78, 100, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elemt which you want to remove from the array.");
		int elementToRemove = sc.nextInt();
		// int elementToRemove=78;

		int isElementPresent = 0;

		for (int i = 0; i < originalArray.length; i++) {
			if (originalArray[i] == elementToRemove) {
				isElementPresent++;

			}

		}

		System.out.println(isElementPresent + "");

		if (isElementPresent == 0) {
			System.out.println("Element not found");
			System.out.println("Please try again");
		} else {
			int[] arrayAfterRemoveElement = removeElement(originalArray, elementToRemove);
			System.out.println("Array before removing element:" + Arrays.toString(originalArray));
			System.out.println("Array after removing element:" + Arrays.toString(arrayAfterRemoveElement));
		}
	}

}

package BasicCodes;

import java.util.ArrayList;

public class smallestAndBiggestNumberFromArray {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(2);
		li.add(-21);
		li.add(0);
		li.add(200);
		li.add(-2);
		System.out.println(li);

		// call minNumber()
		minNumber(li);
		maxNumber(li);

	}

	static void minNumber(ArrayList<Integer> al) {
		// int min=Integer.MIN_VALUE;
		int min = 0;
		for (int i : al) {

			if (i <= min) {
				min = i;

			} else {

			}

		}
		System.out.println("min number from list is: " + min);

	}

	static void maxNumber(ArrayList<Integer> al) {
		// int max=Integer.MAX_VALUE;
		int max = 0;
		for (int i : al) {
			if (i >= max) {
				max = i;
			}
		}
		System.out.println("Max number from list is : " + max);
	}

}

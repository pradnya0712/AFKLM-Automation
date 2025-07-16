package BasicCodes;

import java.util.Arrays;
import java.util.Scanner;

public class findingEven_OddNumbersFromArray {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		
		int[] a = { 1, 4, 2, 6, 8, 7, 13 };
		Arrays.sort(a);
		int even=0;
		int odd=0;
		int length = a.length - 1;

		for (int i = 0; i <= length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Even Number: " + a[i]);
				even++;
			} else {
				System.out.println("Odd Number:" + a[i]);
				odd++;
			}
		}
		System.out.println();
		System.out.println("THere are "+ even+" even elements in an array");
		System.out.println("THere are "+ odd+" odd elements in an array");


	}
}
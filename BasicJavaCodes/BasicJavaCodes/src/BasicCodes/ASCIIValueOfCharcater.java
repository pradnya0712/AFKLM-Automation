package BasicCodes;

import java.util.Scanner;

public class ASCIIValueOfCharcater {

	public static void main(String[] args) {

		// --------Steps----------------------//
		// 1). First input character from user
		// 2). Then typeCase it into int then u will get ASCII value of character

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char ch = sc.nextLine().charAt(0);// suppose user ne string pass kiya to first character ka acsii value lene ke
											// lia charAt use kiya he.
		int AsciiValue = (int) ch;
		System.out.println("ASCII value of " + ch + " is " + AsciiValue);

		System.out.println("Enter number");
		int n = sc.nextInt();

		char val = (char) n;
		System.out.println(val);

	}

}

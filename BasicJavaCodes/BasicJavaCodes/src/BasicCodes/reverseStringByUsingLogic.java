package BasicCodes;

import java.util.Scanner;

public class reverseStringByUsingLogic {
	public static void main(String[] args) {
//---------------------Method1--------------------------//
		String str = "This is an Java Program";
		String reverse = "";
		int len = str.length() - 1;
		System.out.println(reverse);
		for (int i = len; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		System.out.println("------String before Reversing------");
		System.out.println(str);
		System.out.println("------String after Reversing------");
		System.out.println(reverse);

//---------------------Method2--------------------------//
		String string = "Hello guyz";
		System.out.println("Before Reversing");
		System.out.println(string);
		char ch[] = string.toCharArray();
		System.out.println("After Reversing");
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);

		}
		System.out.println();
//---------------------Method3--------------------------//		
		String demo = "Good Morning";
		String[] s = demo.split(" ");
		for (int j = s.length - 1; j >= 0; j--) {
			System.out.print(s[j] + " ");
		}

		System.out.println();
//---------------------Method4--------------------------//
		String d = "Good Morning";
		String[] p = d.split("");
		for (int j = p.length - 1; j >= 0; j--) {
			System.out.print(p[j]);
		}
		
		System.out.println();

		// --------------Using Array----------------------//
		System.out.println("Enter  your String");
		Scanner sc = new Scanner(System.in);
		String newStr = sc.nextLine();
		String rev = "";

		char c[] = newStr.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			rev += newStr.charAt(i);

		}
		System.out.println(rev);

	}

}

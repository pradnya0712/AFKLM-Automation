package BasicCodes;

import java.util.Scanner;

public class checkOwels {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		checkCharcater();
//		System.out.println("Do u want to play check character game?y/n");
//		String res = sc.next();
//		while(true) {
//			
//			if (res.equalsIgnoreCase("y")) {
//				checkCharcater();
//				System.out.println("Do u want to play check character game?y/n");
//				res = sc.next();
//			} else {
//				System.out.println("Thank You!!!");
//				break;
//				
//			}
//		}
		checkOwel();
		

	}
	

	public static void checkCharcater() {
		System.out.println("Enter your character to check it is owel or consonant:");

		char c;
		c = sc.next().charAt(0);

		switch (c) {

		case 'a' | 'A':
			System.out.println("This is an Owel");
			break;

		case 'e' | 'E':
			System.out.println("This is an Owel");
			break;

		case 'i' | 'I':
			System.out.println("This is an Owel");
			break;

		case 'o' | 'O':
			System.out.println("This is an Owel");
			break;

		case 'u' | 'U':
			System.out.println("This is an Owel");
			break;

		default:
			System.out.println("This is an Consonant");

		}

	}
	
	
	
	public static void checkOwel() {
		
		System.out.println("Enter your character to check it is owel or consonant:");
		char ch=sc.next().charAt(0);
		
		boolean isVowel=false;
		switch(ch) {
		case 'a' | 'A':
		case 'e' | 'E':
		case 'i' | 'I':
		case 'o' | 'O':
		case 'u' | 'U':
			isVowel=true;
		
		
		}
		
		if(isVowel==true) {
			System.out.println(ch+" It is a vowel");
		}
		else {
			System.out.println(ch+" It is a consonant");
		}
		
	}

}

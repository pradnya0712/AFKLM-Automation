package BasicCodes;

import java.util.Scanner;

public class CountDigitsLettersSpacesFromString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		
		char[] ch=str.toCharArray();
		
		int digits=0;
		int letters=0;
		int spaces=0;
		int otherCharacters=0;
		
		
		for(Character c:ch) {
			if(Character.isDigit(c)) {
				digits++;
				
			}
			else if(Character.isLetter(c)) {
				letters++;
			}
			
			else if(Character.isSpace(c)) {
				spaces++;
			}
			else {
				otherCharacters++;
			}
		}
		
		System.out.println("Number of Digits are: "+digits);
		System.out.println("Number of Letters are: "+letters);
		System.out.println("Number of spaces are: "+spaces);
		System.out.println("Number of otherCharacters are: "+otherCharacters);
	}
}

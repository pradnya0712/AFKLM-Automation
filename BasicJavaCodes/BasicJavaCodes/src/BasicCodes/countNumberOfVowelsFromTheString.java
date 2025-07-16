package BasicCodes;

public class countNumberOfVowelsFromTheString {

	public static void main(String[] args) {
		
		String str="Pradnya Bhausaheb Gund";
		char[] strToNewCharArray=str.toCharArray();
		
		int countNumberOfVowels=0;
	
		for(char c: strToNewCharArray) {
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.print(c+" ");
				countNumberOfVowels++;
			
				
			}
		}
		System.out.println();
		System.out.println("There are "+countNumberOfVowels+ " numbers of vowels present in the string ");
		
		System.out.println();
		
		String str1="Pradnya Pratik Sadupatil ";
		char[] c=str1.toCharArray();
		int count=0;
		for(char ch:c) {
			if(ch!='a' && ch!='i' && ch!='o' && ch!='e' && ch!='u') {
				count++;
				System.out.print(ch+" ");
			}
		}
		System.out.println();
		System.out.println("There are "+count+" consonants present in the string including space");
	}
}

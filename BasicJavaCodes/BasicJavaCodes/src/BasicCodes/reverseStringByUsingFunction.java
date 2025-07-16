package BasicCodes;

public class reverseStringByUsingFunction {
	public static void main(String[] args) {
		
		String str="This is an Java Code";
		//here toCgarArray() function used to convert our string into array of  characters.
		char c[]=str.toCharArray();
		System.out.println(c);
		
		
		//here StringBuilder class provide us functionality to reverse the string but in String class we cant use reverse function .
		StringBuilder s=new StringBuilder(str);
		StringBuilder reverseString=s.reverse();
		System.out.println(reverseString);
		
		
		for(int i=0;i<=str.length()-1;i++) {
			System.out.print(c[i]);
		}
	}

}

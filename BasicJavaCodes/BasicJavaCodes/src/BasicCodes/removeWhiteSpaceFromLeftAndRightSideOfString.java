package BasicCodes;

public class removeWhiteSpaceFromLeftAndRightSideOfString {

	public static void main(String[] args) {
		//----------------remove space of starting and ending----------------//
		String str=" Hello, My name is Pradnya.   ";
		String newStr=str.trim();
		
		System.out.println("before removing space from left and right side");
		System.err.println(str);
		System.out.println("After removing space from left and right side");
		System.out.println(newStr);
		
		///------------------remove all space from the string--------------------//
		String s="    hello Pradnya, What are you doing ??    ";
		String newString=s.replaceAll("\\s", "");
		System.out.println(newString);
		
		
		//----------------remove all space from the string without using replaceALL() method---------------//
		
		String string=" Hello Team can i c all You ";
		char[] c=string.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<=c.length-1;i++) {
			if(c[i]!=' ' && c[i]!='\t') {
				sb.append(c[i]);
			}
		}
		System.out.println(sb);
	   	
	}
}

package BasicCodes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseString {
	public static void main(String[] args) {

	 StringBuffer str=new StringBuffer("Hi, My name is Pradnya");
		String data = "this is an Java Code";
		String[] arr = data.split(" ");

		 System.out.println(Arrays.toString(arr));
		String newArray = Arrays.toString(arr);
	System.out.println(newArray);

		String res = "";
		for (int i = newArray.length() - 2; i >= 1; i--) {

			res = newArray.toString();
			char s = res.charAt(i);

			System.out.print(s);

		}
//
//for(int i=c.length()-1;i>=0;i--) {
//	System.out.print( c.charAt(i));
//}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
			
		}
		

	
	String rev="";
	System.out.println("lenght of string: "+ data.length());
	for(int i=data.length()-1;i>=0;i--) {
     rev+=data.charAt(i);
		
	}
	System.out.println(rev);
	

		//System.out.println(str.reverse());
		System.out.println(str.replace(0, 4, "Hello,"));
	}

}

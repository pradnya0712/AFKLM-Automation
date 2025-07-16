package BasicCodes;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;



public class splitStringByManyWays {

	public static void main(String[] args) {

		// 1). By String spilt method
		// 2). By Tokenzier split method
		// 3). By Pattern class method
		// 4). By Utils class method

		String str = "091-7039155018";
		System.out.println("By string split method");
		String[] splitString = str.split("-");
		printString(splitString, "By String split method");
		
		System.out.println("By Pattern class");
		List<String> string2 = Pattern.compile("-").splitAsStream(str).collect(Collectors.toList());
		// System.out.println(string2);

		for (String s2 : string2) {
			System.out.println(s2);
		}

		System.out.println("By StringTokenzier class");
		StringTokenizer token = new StringTokenizer(str, "-");
		while (token.hasMoreTokens()) {
			String string3 = token.nextToken();
			System.out.println(string3);
		}

		System.out.println("By StringUtils class");
		String[] string4 = StringUtils.split(str, "-");
		printString(string4, "By StringUtils class");
		


	}

	public static void printString(String str[], String approch) {

		
		for (String s : str) {
			System.out.println(s);
		}
		
	}
}

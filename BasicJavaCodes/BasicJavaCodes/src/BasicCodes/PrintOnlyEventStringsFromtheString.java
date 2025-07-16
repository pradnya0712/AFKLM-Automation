package BasicCodes;

public class PrintOnlyEventStringsFromtheString {
	
	public static void main(String[] args) {
		
		String str="hi , Pradnyaa Bhausaheb Gund";
		
		String[] newStrTocharArray=str.split(" ");
		for(String s:newStrTocharArray) {
			if(s.length()%2==0) {
				System.out.println(s+" ==> Lenght of the string = "+s.length());
			}
		}
	}

}

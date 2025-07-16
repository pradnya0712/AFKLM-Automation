package BasicCodes;

public class ReverseStringUsingRecurssion {

	public static void main(String[] args) {
		String str="Pradnya";
		System.out.println(revStringUsingRecurssionI(str));
	}
	
	public static String revStringUsingRecurssionI(String str) {
		
		if(str==null | str.length()==1){
			return str;
		}
		return revStringUsingRecurssionI(str.substring(1))+str.charAt(0);
	}
}

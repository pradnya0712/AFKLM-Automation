package BasicCodes;

public class CompareTwoStringWithoutBuiltInMrthods {

	public static void main(String[] args) {
		String s1="Pradnya";
		String s2="Pratik";
		boolean issame=false;
		
		for(int i=0;i<s1.length()-1;i++) {
			
				if(s1.charAt(i)!=s2.charAt(i)) {
					issame=false;
					break;
				}
				
				issame=true;
				
			
		}
		System.out.println(issame);
	}
}

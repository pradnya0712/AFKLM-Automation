package BasicCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverseMultipleWordsFromStringUSingList {

	
	public static void main(String[] args) {
		String str="Pradnya  Yojana Bhausaheb Gund Kalpana Vivek";
		String[] strArray=str.split(" ");
		String revWord=" ";
		
		
		String[] revWordsList={"Pradnya","Kalpana","Yojana"};
		List<String> listArray= new ArrayList<String>(Arrays.asList(revWordsList));
		 System.out.println(listArray);
		
		for(int i=0;i<=strArray.length-1;i++) {
			revWord=strArray[i];
			
			if(listArray.contains(revWord)) {
				
				for(int j=revWord.length()-1;j>=0;j--) {
					System.out.print(revWord.charAt(j));
			}
				
			}
			
			else {
			
				System.out.print(revWord);
			
			}
			System.out.print(" ");
		}
		
	}
	

	}


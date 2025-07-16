package BasicCodes;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Interview {
	public static void main(String[] args) throws IOException {

		// String str="Pradnya712@ Bhaus#%& gund@%#%";

//		String newStr=str.replaceAll("[a-zA-Z0-9]", "");
//		System.out.println(newStr);
//		String withoutSplCha="";
//		int splChar=0;
//		
//		for(int i=0;i<str.length();i++) {
//			if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
//				System.out.print(str.charAt(i)+" ");
//				splChar++;
//			}
//			else {
//				
//				withoutSplCha+=str.charAt(i);
//			}
//		}
//		System.out.println();
//		System.out.println(splChar);
//		System.out.println(withoutSplCha+ " "+str.length()+" "+(29-8)+" "+withoutSplCha.length());

//		String a="ABCD";
//		String b="CDAB";
//	//	System.out.println((a+b).indexOf(b));
//		
//		if(a.length()==b.length() && ((a+b).indexOf(b)!=-1) ) {
//			System.out.println("Rotataion present");
//		}
//		else {
//			System.out.println("Rotation not present");
//		}

//		String[] s= {"java","c","python","groovy"};
		boolean status = false;
//		for(int i=0;i<s.length;i++) {
//			for(int j=i+1;j<s.length;j++) {
//				if(s[i]==s[j]) {
//					System.out.println("Duplicate element found at index "+i+" which is "+s[i]);
//					status=true;
//				}
//			}
//		}
//		
//		if(status==false) {
//		System.out.println("No duplicate element found in array");	
//		}
//	

//		String[] s={"java","c","python","groovy","groovy","java"};
//	HashSet<String> set=new HashSet<String>();
//		
//		for(String str:s) {
//			if(set.add(str)==false) {
//				System.out.println("Duplicate element found >> "+str);
//				status=true;
//			}
//			
//		}
//		
//		if(status==false) {
//			System.out.println("Duplicate element not found");
//		}
//		
//		
//		
//		System.out.println(set);

//		int[] arr= {1,3,6,9,34};
//		int find=34;
//		boolean found=false;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==find) {
//				System.out.println("Element found at index "+i);
//				found=true;
//			}
//			
//		}
//		
//		if(found==false) {
//			System.out.println("Element not present in the array");
//		}

//			try {
//				FileWriter fw = new FileWriter("D:\\BOT\\demo.txt");
//
//				BufferedWriter bw = new BufferedWriter(fw);
//				bw.write("Hello \n");
//				bw.write("Good Evening \n");
//				bw.write("Had your dinner \n");
//				bw.write("Nice to meet you \n");
//				System.out.println("File written successfully");
//				bw.close();
//				fw.close();
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

//		try {
//			FileReader fr=new FileReader("D:\\\\BOT\\\\demo.txt");
//			BufferedReader br=new BufferedReader(fr);
//			String str="";
//			while((str=br.readLine())!=null) {
//				System.out.println(str);
//			}
//			System.out.println("File read successfully");
//			br.close();
//			fr.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		String str = " Pradnya     Bhausaheb Gund";
//		String newStr = str.replaceAll("\\s+", "");
//		System.out.println(newStr);

//		String str="pradnya Bhausaheb Gund";
//		System.out.println(str.length());
//		char[] ch=str.toCharArray();
//		
//		HashMap<Character,Integer> map=new HashMap<>();
//		
//	for(char c:ch) {
//			
//			if(map.containsKey(c)) {
//				int count=map.get(c);
//				
//				map.put(c,count+1);
//			}
//			else {
//				map.put(c, 1);
//			}
//		}
//		System.out.println(map);

//		String str="Pradnyaa";
//		StringBuilder sb=new StringBuilder();
//		
//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			int id=str.indexOf(ch,i+1);
//			
//			if(id==-1) {
//				sb.append(ch);
//			}
//		}
//		System.out.println(sb);

//		String str = "PrPdnya";
//		char[] ch=str.toCharArray();
//		HashMap<Character, Integer> map = new HashMap<>();
//		
//	for(char c:ch){
//			
//			if(map.containsKey(c)) {
//				int count=map.get(c);
//				map.put(c, count+1);
//			}
//			else {
//				map.put(c,1);
//			}
//		}
//	System.out.println(map);
//	
//	for(Entry<Character,Integer> entry:map.entrySet()) {
//		
//		if(entry.getValue()==1) {
//			System.out.println(entry.getKey());
//			break;
//		}
//	}

//		for(int i=0;i<str.length();i++) {
//			boolean unique=true;
//			for(int j=0;j<str.length();j++) {
//				if(i!=j && str.charAt(i)==str.charAt(j)) {
//					unique=false;
//					
//				}
//			}
//			
//			if(unique) {
//				System.out.println(str.charAt(i));
//				break;
//			}
//		}

		String str = "PradPnyaa";
		char[] ch = str.toCharArray();
char replace='a';
		int count = 1;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == replace) {
				ch[i] = String.valueOf(count).charAt(0);
				count++;
			}
		}
		System.out.println(Arrays.toString(ch));
for(char c:ch) {
	System.out.print(c+" ");
}
}
}
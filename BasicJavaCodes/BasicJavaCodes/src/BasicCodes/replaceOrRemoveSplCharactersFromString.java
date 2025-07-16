package BasicCodes;

public class replaceOrRemoveSplCharactersFromString {
  public static void main(String[] args) {
	  
	  String str="Hello 12 EveryOne, How Are You!@@???";
	  String m=str.replaceAll("[a-zA-z]", "-");//replace a-zA-z charcaters means alphabets get replace by -
	  String s=str.replaceAll("[^a-zA-Z0-9]", " ");
	  String p=str.replaceAll("[^0-9]", " ");
	  String q=str.replaceAll("[^A-Z]", " ");
	  String t=str.replaceAll("[^\\s]", "h");//except space
	  //above [^a-zA-Z0-9] means except this remove or replace all characters from string
	  //note all  characters mentioned inside square bracket because we want to provide condition  in array.
	  System.out.println(m);
	  System.out.println(s);
	  System.out.println(p);
	  System.out.println(q);
	  System.out.println(t);
	  
	 
	  
	  
	 
}
}

package JavaTutorial;

public class ExampleOfDefaultConstructor {

	int i;
	String name;
	
	public static void main(String[] args) {
		
		
		ExampleOfDefaultConstructor obj=new ExampleOfDefaultConstructor();
		System.out.println("This is default constructor");
		System.out.println(obj.i);//here default constructor display the default value. for int it stores 0 value.
		System.out.println(obj.name);//here default constructor display the default value. for String it stores Null value.
	
	}
}

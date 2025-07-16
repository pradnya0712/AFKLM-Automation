package JavaTutorial;

public class ExampleOfParameterizedConstructor {
	
	String firstName;
	String lastName;
	int age;
	
	ExampleOfParameterizedConstructor(String firstname,String lastName,int age){
		this.firstName=firstname;
		this.lastName=lastName;
		this.age=age;
		
		System.out.println("First name is: "+firstName);
		System.out.println("Last name is: "+lastName);
		System.out.println("Age is: "+age);
	}

	public static void main(String[] args) {
		ExampleOfParameterizedConstructor obj=new ExampleOfParameterizedConstructor("Pratik","Sadupatil",22);	
	}
}

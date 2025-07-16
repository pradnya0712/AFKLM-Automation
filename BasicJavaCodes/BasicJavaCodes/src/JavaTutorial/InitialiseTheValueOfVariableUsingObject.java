package JavaTutorial;

public class InitialiseTheValueOfVariableUsingObject {
	
	String Name;
	int Age;
	
	public static void main(String[] args) {
		
		//creating the object of class to initialise the valus of the variable/field.
		InitialiseTheValueOfVariableUsingObject obj=new InitialiseTheValueOfVariableUsingObject();
		
		//Initialising the value of variable using object.
		obj.Name="Pratik Shamrao Sadupatil";
		obj.Age=21;
		
		//printing the value of the variable using object
		
		System.out.println("I am "+ obj.Name);
		System.out.println("I am "+ obj.Age+" years old");
	}

}

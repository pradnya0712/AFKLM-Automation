package JavaTutorial;

public class ExampleOfObjectMethodAndClass {

//Creation of method
	public void Walking() {
		System.out.println("I am Walking..");
	}
	
	//Creation of method
		public void Running() {
			System.out.println("I am Running..");
		}

//Without main method class can be compile but execution cannot be start.Because execution of program starts from the main method only.
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
// to execute the method defined in the class we must have to call them in the main method. for that we have to create the 
// object of mainClass .

// creating object of mainClass
		ExampleOfObjectMethodAndClass obj = new ExampleOfObjectMethodAndClass();
//calling the method using object and (.) operator.
		obj.Walking();
		obj.Running();
		


	}

}



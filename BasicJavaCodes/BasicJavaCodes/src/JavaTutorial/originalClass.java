package JavaTutorial;

public class originalClass {

	
	public void methodFromOriginalClass() {
		System.out.println("I am from this class only.");
	}
	// Create main method
	public static void main(String[] args) {

		// create object of class from which you want to call the methods.

		// Creation of object of other class
		CallThisClassmethodsIntoOtherClass othercalling = new CallThisClassmethodsIntoOtherClass();

		// call the methods using object
		othercalling.calling();
		othercalling.callinefromAnotherClass();
		
		//To call the methods from this class. Create the object of this class.
		
		//creation of object of this class.
		originalClass orgObj=new originalClass();
		
		//calling the method of this class using object.
		orgObj.methodFromOriginalClass();

	}

}

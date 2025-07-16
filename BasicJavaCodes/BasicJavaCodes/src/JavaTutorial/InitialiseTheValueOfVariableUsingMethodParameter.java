package JavaTutorial;

public class InitialiseTheValueOfVariableUsingMethodParameter {

	
	  String Name;
	  String Address;
	  
	  public void insertValues(String name, String address) {
		  
		  //here we are storing the values of method parameters into class variable
		  Name=name;
		  Address=address;
	  }
	  
	  public void displaydata() {
		  System.out.println("I am "+ Name);
		  System.out.println("Currently i am living in the "+Address);
	  }
	
	public static void main(String[] args) {
		//create the object of class
		InitialiseTheValueOfVariableUsingMethodParameter obj=new InitialiseTheValueOfVariableUsingMethodParameter();
		
		//pass the value to the method using object
		obj.insertValues("Pratik Shamrao Sadupatil", "Ghatkopar");
		
		//Calling the method
		obj.displaydata();
		
	}
}

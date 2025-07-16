package JavaTutorial;

public class multlevelInheritanceExample {

	public static void main(String[] args) {
		//here we are creating the object of Dodge class .
		Thar t=new Thar();
		//calling the methods of parent class as well as derived class using object of Thar class
		//here we are inherit the properties of one class into multiple class using extends keyword
		t.name();
		t.type();
		t.colour();
	}
}


class Vehicle{
	public void type() {
		System.out.println("This is a four wheeler vehicles");
	}
}

class Dodge extends Vehicle{
	public void name() {
		System.out.println("It is an Dodge car. One of the most attractive car");
	}
}

class Thar extends Dodge{
	public void colour() {
		System.out.println("It is an Thar. Black coloured and good looking");
	}
}
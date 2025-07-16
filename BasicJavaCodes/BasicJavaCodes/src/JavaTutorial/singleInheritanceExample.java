package JavaTutorial;

public class singleInheritanceExample {
	public static void main(String[] args) {

		// here we are creating the object of child class i.e. Dog class
		dog d = new dog();
		// herev we are calling the methods of parent class i.e Animal using child class
		// object.because we inherit the properties of
		// parent class using extend class
		d.eating();

		// here we are calling the methods of child class i.e dog class

		d.category();

	}

}

class Animal {

	// this is an parent class
	public void eating() {
		System.out.println("Animals eating veg and non-veg foods.");
	}

}

class dog extends Animal {
	// here dog class is child class. and it extends all the methods,variables of
	// the Animal class.
	public void category() {
		System.out.println("I am belongs from Dog class");
	}

}
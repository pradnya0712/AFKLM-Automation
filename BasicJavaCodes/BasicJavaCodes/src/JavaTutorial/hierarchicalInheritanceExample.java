package JavaTutorial;

public class hierarchicalInheritanceExample {
	public static void main(String[] args) {
		// create object of both child classes.
		male m = new male();
		female f = new female();
		// calling the methods of male class as well as parent class.
		m.maleMembers();
		m.memnbers();
		// calling the methods of female class as well as parent class
		f.femaleMembers();
		f.memnbers();
	}

}

class Home {
	// parent class
	public void memnbers() {
		System.out.println("There are 4 members in the house");
	}

}

class male extends Home {
	// child class
	public void maleMembers() {
		System.out.println("There are 3 male present in the home. 2 sons and 1 father");
	}

}

class female extends Home {
	// child class
	public void femaleMembers() {
		System.out.println("There are only 1 female member i.e mother");
	}
}

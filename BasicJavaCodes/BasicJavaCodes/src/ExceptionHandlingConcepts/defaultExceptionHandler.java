package ExceptionHandlingConcepts;

public class defaultExceptionHandler {
	
	public static void main(String[] args) {
		car();
		
	} 
	
	public static void car() {
		bike();
		
	}
	
	public static void bike() {
		System.out.println(10/0);//here exception occurs and jvm not able to go forward so after this line execution get stopped.
		train();
	}
	public static void train() {
		System.out.println("Hello, This is a train..."); 
	//	System.out.println(10/0);
	}

}

//Default exception means:---if there are multiple classes and out of them if one class get failed abnormally then it will going to raised default exception.
//default exception prints the Exception name and path where exception occurs .

//----------------flow in stack------------------//
//first in stack main thread get stored and see main class calling which class.
//now main class calling car() class so jvm goes inside the car class and see car class calling which class.
//now car class calling bike class .so in stack bike class get store above the car class.
//now bike class caliling the train class and so in stack train class stored above the bike class.
//now jvm goes inside the train class and looking for execution .it will execute the fisrt line successfully but in the second
//line Airthmetic exception occurs.
//at that time JVM ask Train class do u have handle the code train class says no.after that jvm goes towards the bike class because
//bike class called the train class.here JVM ask same question to the bike class.do u have handle the code bike class says no.then
//jvm goes towards car class becuse car class call the bike class and asks same question.car class says no then at the end 
//jvm goes towards main  class and ask same question do u have handle the exception main class says no.
//now main class is called by jvm so now jvm is reasponsible for handkling the exception at that time jvm calls the deafault exception.
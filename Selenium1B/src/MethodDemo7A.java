
public class MethodDemo7A {

	public static void main(String[] args) {
		System.out.println("Main Method of MethodDemo7A");
		
		MethodDemo7A m1 = new MethodDemo7A();// object was created inside main method 
		//so that I can have access to instance variables 
		//declared at class level and methods in this particular class.
		m1.funB();
		System.out.println("DOne");
		}
	void funA(){
		System.out.println("FunA of MethodDemo7A");
	}
	void funB(){
		System.out.println("FunB of MethodDemo7A");
		funA();// Calling from functionB current object.
	}

}

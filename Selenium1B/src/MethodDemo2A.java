
public class MethodDemo2A {

	public static void main(String[] args) {
	System.out.println("main method of MethodDemo2A");
	funC();// execution (or) invoking (or) method calling
	
	MethodDemo2A m1 = new MethodDemo2A();
	m1.funA();// instance method funA is being invoked using reference variable 'm1'.
	m1.funB();// instance variable funB is being invoked using reference variable 'm1'.
	}
	void funA(){
		System.out.println("funA of MethodDemo2A");
	}
	
	void funB() {
		System.out.println("funB of MethodDemo2A");
		
	}
	
	static void funC(){
		System.out.println("func of MethodDemo2A");
	}
	

}

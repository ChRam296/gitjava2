 // non-static method called in non-static method.

public class MethodDemo7 {

	public static void main(String[] args) {
		System.out.println("Main Method of MethodDemo7");
    //m1.funB();
		MethodDemo7 m1 = new MethodDemo7();//Object was created inside main method. 
		//so that I can have access to all instance members (methods, instance variables)
		m1.funB();
		System.out.println("DOne");
		
	}
  void funA() {
	  System.out.println("FunA of MethodDemo7");
  }
	void funB(){
		System.out.println("FunB of MethodDemo7");
		MethodDemo7 m1 = new MethodDemo7();// object was created inside funB() method.
		m1.funA();
	}
}

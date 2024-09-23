
public class MethodsDemo7B {

	public static void main(String[] args) {
	System.out.println("Main Method of MethodsDemo7B");
	MethodsDemo7B m2 = new MethodsDemo7B();
	
	m2.funB();
    System.out.println("Done");
	}
 
	void funA()
	{
		System.out.println("funA of MethodsDemo7B");
	}
	
	void funB()
	{
		System.out.println("funB of MethodsDemo7B");
		funA();//calling from function B current object.
	}
}

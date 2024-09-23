
public class MethodDemo8A {

	public static void main(String[] args) {
		MethodDemo8A m5 = new MethodDemo8A();
		m5.funA();
		m5.funB();

	}
	
	void funA()
	{
		System.out.println("funA of MethodDeemo8A");
		return;
	//	System.out.println("funA of MethodDemo8A");
	}
	int funB()
	{
		System.out.println("funB of MethodDemo8A");
		return 10;
		//System.out.println("funB of MethodDemo8A");
	}

}

   
public class MethodDemo8 {

	public static void main(String[] args) {
		MethodDemo8 m4 = new MethodDemo8();
		m4.funA();
		m4.funB();

	}

	void funA()
	{
		System.out.println("funA of MethodDemo8");
	}
	int funB()
	{
		System.out.println("funB of MethodDemo8");
		return 10;
	}
}

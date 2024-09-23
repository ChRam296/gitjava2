 
public class MethodDemo9 {

	public static void main(String[] args) {
		MethodDemo9 m6 = new MethodDemo9();
		m6.funA();
		m6.funB();
		
    System.out.println("Done");
	}

	void funA()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	int funB()
	{
		int a = 40;
		int b = 60;
		int c = a+b;
		System.out.println(c);
		return 3000;//c;//a;//b;
	}
}

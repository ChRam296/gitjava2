
public class ParameterMethodDemo2 {

	public static void main(String[] args) {
		ParameterMethodDemo2 d1 = new ParameterMethodDemo2();
		d1.function1();
		d1.functionA(10, 20);
		d1.functionB(33, false);
		d1.functionC(44f, false);
		d1.functionD(55.0, 66f);
		d1.functionF(77.0, 'a');

	}

	void function1()
	{
		System.out.println("function1 of ParameterMethodDemo2");
		
	}
	void functionA(int a , int b)
	{
		System.out.println("functionA of ParameterMethodDemo2");
		System.out.println(a);
		System.out.println(b);
	}
	void functionB(int a, boolean b)
	{
		System.out.println("functionB of ParameterMethodDemo2");
		System.out.println(a);
		System.out.println(b);
	}
	void functionC(float a, boolean b)
	{
		System.out.println("funtionC of ParameterMethodDemo2");
		System.out.println(a);
		System.out.println(b);
	}
	void functionD(double a , float b)
	{
		System.out.println("functionD of PaameterMethodDemo2");
		System.out.println(a);
		System.out.println(b);
	}
	void functionF(double a, char b)
	{
		System.out.println("functionF of ParameterMethodDemo2");
		System.out.println(a);
		System.out.println(b);
	}
}

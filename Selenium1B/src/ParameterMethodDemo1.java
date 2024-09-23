
public class ParameterMethodDemo1 {

	public static void main(String[] args) {
		ParameterMethodDemo1 d1 = new ParameterMethodDemo1();
        d1.function1();
        d1.functionA(10);
        d1.functionB(20l);
        d1.functionC(21.0f);
        d1.functionD(55.0);
        d1.functionE(false);
        d1.functionF('f');
	}
	
	void function1()
	{
		System.out.println("function1 of parameterMethodDemo1");
	}
	
	void functionA(int a)
	{
		System.out.println("functionA of parameterMethodDemo1");
		System.out.println(a);
	}

	void functionB(long b)
	{
		System.out.println("functionB of ParameterMethodDemo1");
		System.out.println(b);
	}
	void functionC(float c)
	{
		System.out.println("functionC of ParameterMethodDemo1");
		System.out.println(c);
	}
	void functionD(double d)
	{
		System.out.println("functionD of ParameeterMethodDemo1");
		System.out.println(d);
		
	}
  void functionE(boolean e)
{

	  System.out.println("functionE of ParameterMethodDemo1");
	  System.out.println(e);
}
   void functionF(char f)
   {
	  System.out.println("functionF of ParameterMethodDemo1"); 
	   System.out.println(f);
   }
}

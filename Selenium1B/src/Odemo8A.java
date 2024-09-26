
public class Odemo8A {

	public static void main(String[] args) {
		Odemo8A d1 = new Odemo8A();
          d1.functionA();
          d1.functionB(35);
          d1.functionC(true);
          d1.functionD('c');
          Ramesh r1 = new Ramesh();
          d1.functionE(r1);
          //d1.functionE(null);
          //d1.functionE(new Ramesh());
	}

	void functionA()
	{
		System.out.println("functionA of Odemo8A");
	}
	void functionB(int a)
	{
		System.out.println("functionB of Odemo8A");
		System.out.println(a);
	}
	void functionC(boolean b)
	{
		System.out.println("functionC of Odemo8A");
		System.out.println(b);
	}
	void functionD(char c)
	{
		System.out.println("functionD of Odemo8A");
		System.out.println(c);
	}
	void functionE(Ramesh r1)
	{
		System.out.println("functionE of Odemo8A");
		System.out.println(r1);
	}
	
}

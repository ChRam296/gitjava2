
public class PracticeConsDemo1 {

	int a;
	int b;
	
	PracticeConsDemo1(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void functionA()
	{
		System.out.println("a:" + this.a);
		System.out.println("b:" + this.b);
	}
	
	public static void main(String[] args) {
		
		PracticeConsDemo1 obj1 = new PracticeConsDemo1(55,65);
		obj1.functionA();
	}

}

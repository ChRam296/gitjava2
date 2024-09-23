
class A
{
	int i;
	int j;
	void funA()
	{
		System.out.println("funA of classA");
	}
}
public class Odemo1 {

	int x,y;
	void fun1()
	{
		x = x+1;
		A a1 = new A();
	}
	public static void main(String[] args) {
		
     Odemo1 d1 = new Odemo1();
     d1.fun1();
     A a1 = new A();
     System.out.println(a1.i);
	}

}

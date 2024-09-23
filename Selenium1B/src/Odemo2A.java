
public class Odemo2A {

	int x,y;
	void fun1()
	{
		x = x+1;
		Odemo2A d1  = new Odemo2A();
		d1.x = x+2;
		System.out.println(d1.x);
		System.out.println(x);
	}
	
	
	
	
	public static void main(String[] args) {
		Odemo2A d1 = new Odemo2A();
        d1.fun1();
	}

}

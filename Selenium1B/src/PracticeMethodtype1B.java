
public class PracticeMethodtype1B {
	int a;
	int b;
	int c;
	public static void main(String[] args)
	{

	PracticeMethodtype1B Obj3 = new PracticeMethodtype1B();

	Obj3.M1();
	Obj3.M2();

	}

	PracticeMethodtype1B M1()
	{
	PracticeMethodtype1B obj1 = new PracticeMethodtype1B();
	 obj1.a = 25;
	obj1.b = 35;
	obj1.c = a+b;
	System.out.println("The value of c is:" + obj1.c);

	return obj1;
	}


	PracticeMethodtype1B M2()
	{
	PracticeMethodtype1B obj1 = new PracticeMethodtype1B();
	 obj1.a = 45;
	obj1.b = 55;
	obj1.c = a+b;
	System.out.println("The value of c is:" + obj1.c);

	return obj1;
	}
	}


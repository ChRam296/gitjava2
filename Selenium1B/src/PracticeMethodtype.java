
public class PracticeMethodtype {
	
		int a;
		int b;
		int c;
		public static void main(String[] args)
		{
            System.out.println("Main Method Start");
            System.out.println("Non-static Method M1 and M2 are invoking");
			PracticeMethodtype M1 = new PracticeMethodtype();
			M1.M1();

		}

		PracticeMethodtype M1()
		{
		PracticeMethodtype obj1 = new PracticeMethodtype();
		 obj1.a = 25;
		obj1.b = 35;
		obj1.c = obj1.a+obj1.b;
		System.out.println("The value of c in M1 Method is :" +obj1.c);
        obj1.M2();
		return obj1;
		}


		PracticeMethodtype M2()
		{
		PracticeMethodtype obj1 = new PracticeMethodtype();
		 obj1.a = 45;
		obj1.b = 55;
		obj1.c = obj1.a+obj1.b;
		System.out.println("The value of c in M2 Method is:" +obj1.c);

		return obj1;
		}

}
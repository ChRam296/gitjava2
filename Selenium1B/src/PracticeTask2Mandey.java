public class PracticeTask2Mandey {

int a = 30;
int b = 25;
int c ;
  public class Be_Happy
	{
	  int a;
          int b;
          int c;	
	}
	public static void main(String[] args) {
	
		PracticeTask2Mandey obj1 = new PracticeTask2Mandey();
		System.out.println("Main method is invoking");
                  obj1.c = obj1.a / obj1.b;
                System.out.println("The total value of c is:" +obj1.c);
                obj1.c = obj1.a + obj1.b;
                System.out.println("The total value of c is:" +obj1.c);
                obj1.c = obj1.a - obj1.b;
                System.out.println("THe total value of c is:" +obj1.c);
        obj1.hello();
		obj1.hello1();
	}
	Be_Happy hello()
	{
		System.out.println("Hello Method is invoking");
		Be_Happy obj1 = new Be_Happy();
                 obj1.a = 45;
                 obj1.b = 55;
                 obj1.c = obj1.a*obj1.b;
                 System.out.println("The total value stored in c:" + obj1.c);
		// Instance was created here to return the value as Be_Happy
		return obj1;
		}
	Be_Happy hello1(){
	 System.out.println("Hello1 Method is invoking");

		 Be_Happy obj1 = new Be_Happy();
                 obj1.a = 58;
                 obj1.b = 68;
                 obj1.c = obj1.a+obj1.b;
               System.out.println("The total value stored in c:" + obj1.c);
		 return obj1; 
}
}

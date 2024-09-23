/* Below code is an example of bad practice as we using static logic but only values were dynamic
 */
public class Ramesh4 {

	public static void main(String[] args) {
		Ramesh4 r4 = new Ramesh4();
		r4.addNumbers();
		r4.addNumbers2();
		r4.addNumbers3();

	}

	void addNumbers()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	void addNumbers2()
	{
		int a = 30;
		int b = 40;
		int c = a+b;
		System.out.println(c);
				
	}
	void addNumbers3()
	{
		int a = 50;
		int b = 70;
		int c = a+b;
		System.out.println(c);
	}
}


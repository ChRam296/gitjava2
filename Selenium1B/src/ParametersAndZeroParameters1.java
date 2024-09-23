/* In the below code I have only included method logic inside my parameterized function that is
 * inside my 'funB'. this below code serves real purpose of parameterized function as I can change
 * my values of local variables randomly.
 * 
 */
public class ParametersAndZeroParameters1 {

		
	public static void main(String[] args) {
		ParametersAndZeroParameters1 bd4 = new ParametersAndZeroParameters1();
		bd4.funA();// o/p: 30
		bd4.funB(10,50);//o/p:60
		bd4.funB(60, 80);//o/p:140;
		bd4.funB(110, 150);//o/p:260;

		System.out.println("done");
}

	void funA()
	{

	int a = 10;
	int b = 20;
	int c = a+b;
	System.out.println(c);
	}

	void funB(int a, int b)
	{
	 
	int c = a+b;
	System.out.println(c);
	}

}


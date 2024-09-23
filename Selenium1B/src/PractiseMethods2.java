/* Non-static return data-type being called in main method. 
 * 
 */

public class PractiseMethods2 {

	public static void main(String[] args) {
		PractiseMethods2 m1 = new PractiseMethods2();
         //m1.functionA();
         System.out.println(m1.functionA());
        // m1.functionB();
         System.out.println(m1.functionB());
         //m1.functionC();
         //System.out.println(m1.functionC());
         //m1.functionD();
         System.out.println(m1.functionD());
         //m1.functionE();
         System.out.println(m1.functionE());
         //m1.functionF();
         System.out.println(m1.functionF());
	}
	int functionA()
	
	{
		System.out.println(23);
		return 33;
	}
	
	long functionB()
	{
		System.out.println(55l);
		return 44l;
	}
	float functionC()
	{
		System.out.println(85f);
		return 65f;
	}
	double functionD()
	{
		System.out.println(111.0);
		return 95.0;
	}
	boolean functionE()
	{
		System.out.println(true);
	return false;
	}
	char functionF()
	{
		System.out.println('g');
		return 'f';
	}
}

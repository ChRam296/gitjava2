/* Static return data-type function being called in main method.
 * 
 */
public class PracticeMethods1 {
	static int a;
	public static void main(String[] args) {
		
		int b = functionB();
		System.out.println(b);
		System.out.println(functionB());//when functionB() was given in system.out.println statement
		// functionB statements gets executed line by line and the value 10 will now be passed to functionB().
		// so first 20 will be printed and later 10 will be printed.
		System.out.println(functionC());
		System.out.println(functionD());
		System.out.println(functionE());
		System.out.println(functionF());
		System.out.println(functionG());
		a = functionB();// a variable is local member for main method.
		}
   
   static int  functionB()
   
   {
	   int a = 30;// a variable is local member for functionB() method.
	   System.out.println(20);
	   return 10;
   }
   static long functionC()
   
   {
	   System.out.println(33l);
	   return 20l;
   }
   static float functionD()
   {
	   System.out.println(75.0f);
	   return 20.0f;
   }
   static double functionE()
   {
	   System.out.println(45.0);
	   return 33.0;
   }
   static boolean functionF()
   {
	   System.out.println(true);
   return false;
   }
   static char functionG()
   {
	   System.out.println('b');
	   return 'a';
   }
}

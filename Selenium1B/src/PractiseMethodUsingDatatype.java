/*You cannot assign values to these parameters directly in the main method or
 *  elsewhere outside the methodDatatypes method because they are local to that method.
Instead, you provide values to these parameters when calling methodDatatypes from main. 
The method then uses these values as if they were its own local variables.
 * 
 */
public class PractiseMethodUsingDatatype {

	public static void main(String[] args) {
		PractiseMethodUsingDatatype value2 = new PractiseMethodUsingDatatype();
		value2.methodDatatypes(10,20l,33f,44, 'k', false);//local variables declaration 
		
		

	}
	void methodDatatypes(int a, long b,float c, double d , char e , boolean f)//local
	// variables intialization 
	
	{
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  System.out.println(d);
	  System.out.println(e);
	  System.out.println(f);
	}
}

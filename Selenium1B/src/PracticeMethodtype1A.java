/* I have declared instance variables with values 'a' and 'b'.
 * , Again I have declared and intialized local variables with 
 * values 'A', 'B'.
 * but arthematical operation was performed on instance variables of a and b which were not 
 * intialized.
 * hence the output is 0.
 * 
 */
public class PracticeMethodtype1A {

	 int a;
	    int b;
	    int c;

	    public static void main(String[] args) {
	        System.out.println("Main Method Start");
	        System.out.println("Non-static Method M1 and M2 are invoking");

	        // Create an instance of PracticeMethodtype
	        PracticeMethodtype1A obj1 = new PracticeMethodtype1A();
	        
	        // Call the M1 method
	        obj1.M1();
	    }

	    // M1 method
	    PracticeMethodtype1A M1() {
	        // Initialize local variables but not instance variables
	        int A = 25;
	        int B = 35;

	        // Perform operation on local variables
	        c = a + b; // a and b are not initialized, so their default value is 0
	        System.out.println("The value of c in M1 Method is: " + c);

	        // Call M2 method using the same instance
	        M2(); // This will use the instance's uninitialized values for a and b
	        PracticeMethodtype1A obj1 = new PracticeMethodtype1A();
	        return obj1; // No need to return an instance
	    }

	    // M2 method
	    PracticeMethodtype1A M2() {
	        // Initialize local variables but not instance variables
	        int A = 45;
	        int B = 55;

	        // Perform operation on instance variables
	        c = a + b; // a and b are still not initialized, so their default value is 0
	        System.out.println("The value of c in M2 Method is: " + c);
	        PracticeMethodtype1A obj1 = new PracticeMethodtype1A();
	        return obj1; // No need to return an instance
	    }
	}

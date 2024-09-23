/*we can conclude from below program that a static method can be called inside 
 * a non-static (instance) method. 
 * we tried to do this by calling funA()(A static method) inside a non-static method by using
 * method signature(funA();)
 */
public class MethodDemo5 {

	// The entry point of the program
	public static void main(String[] args) {
		// Print a message indicating the start of the main method
		System.out.println("Main Method of MethodDemo5");
		// Create an instance of MethodDemo5
        // This is necessary because funB is an instance method and requires an object to be called.
		MethodDemo5 m1 = new MethodDemo5();
		// Call the instance method funB on the created object
		m1.funB();
		
		// Print a message indicating that the main method has finished execution
		System.out.println("Done");
		}
	
	// Static method funA
    // This method is declared as static, which means it belongs to the class rather 
	//than an instance
    // It can be called without creating an instance of MethodDemo5
	static void funA() {
		// Print a message indicating that funA is being executed
		System.out.println("funA of MethodDemo5");
	}
	
	 // Instance method funB
    // This method is not static, so it must be called on an instance of MethodDemo5
	void funB() {
		 // Print a message indicating that funB is being executed
		System.out.println("funB of MethodDemo5");
		// Call the static method funA from within funB
        // Static methods can be called from instance methods within the same class
		funA();
	}

}

/*we can conclude from the MethodDemo6 program that we can call a non-static (instance) method 
 * from within a static method by using an object of the class.
 We tried to achieve this by creating an instance for non-static method that is funA()
  so by using an object we can access the non-static member inside a static member that is funB() 
 */

public class MethodDemo6 {

	// The entry point of the Java application
	public static void main(String[] args) {
		// Print a message indicating the start of the main method
		System.out.println("Main Method of MethodDemo6");
		// Call the static method funB
		funB();
		// Print a message indicating that the main method has finished execution.
		System.out.println("Done");
}
	 // Instance method funA
    // This method is not static, so it must be called on an instance of MethodDemo6
	void funA()
	{
		// Print a message indicating that funA is being executed
	System.out.println("funA of MethodDemo6");	
	
	}
	 // Static method funB
    // This method is static, so it belongs to the class rather than any instance
	static void funB(){
		 // Print a message indicating that funB is being executed
		System.out.println("funB of MethodDeo6");
		 // Create an instance of MethodDemo6
        // This is necessary because funA is an instance method and must be called on an object
		MethodDemo6 m1 = new MethodDemo6();
		 // Call the instance method funA using the created object
		m1.funA();
	}
}

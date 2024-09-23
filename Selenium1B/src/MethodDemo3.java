
/*we can conclude from below program that the static method funA() 
 * is being called inside another static method, 
 * funB(), in the MethodDemo3 class. 
  */
public class MethodDemo3 {

	public static void main(String[] args) {
		
	System.out.println("main method of MethodDemo3"); 
	// Print a message indicating the start of the main method.
	// Call the static method funB.
    // Since funB is a static method, it can be called directly from the static context of main.
     funB();
     System.out.println("done"); // Print a message indicating the end of the main method.
	}
	
     static void funA()  // Static method funA prints a message.
     {    
    	 System.out.println("funA of MethodDemo3");
     }
     
     static void funB()// Static method funB prints a message and then calls funA.
     
     {
    	 System.out.println("funB of MethodDemo3");
    	 funA();//// Call the static method funA from within funB.
     }
}


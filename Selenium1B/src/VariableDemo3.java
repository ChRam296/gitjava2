
public class VariableDemo3 {

	int i = 10;
	static int j = 20;
	
	public static void main(String[] args) {
    
	System.out.println(j); //This line prints the value of the static variable j, which is 20.
    
	j = 30;
    
	System.out.println(j);// This line changes the value of the static variable j to 30. 
	                      // As the updated value of j is now 30.
	
	
	int j = 40;//Here, a new local variable j is declared within the main method. 
	     //This local variable shadows the static variable j within the scope of the main method. 
      // Thus, within this block, j refers to the local variable j and not the static variable.
	          
	
	System.out.println(j); // This prints the value of the local variable j, which is 40.
	
	//System.out.println(k); //k is not declared anywhere in the class, 
	//so attempting to print it would result in a compile-time error.
	
	//System.out.pritln(i);
	
    
	}

}

//Negative case in the below code we tried to when converting from a larger type to 
//a smaller type or between incompatible types 
//(e.g., float to int, double to float, double to long, double to int). 
//This must be done explicitly by the programmer to acknowledge potential data loss 
//or precision issues.


public class DataTypeCastingDemo2 {

	public static void main(String[] args) {
		int a = 10;
		float f1 = a; // Implicit type casting from int to float is allowed.

		//int b = f1;//// Error: Cannot convert from float to int.
		//In this line, you are trying to assign a float value (f1) to an int variable (b). 
		//This is not allowed without an explicit cast because converting from float to int 
		//can lose precision (i.e., the fractional part of the float will be truncated). 
		
		
	//	long k = f1; Error: Cannot convert from float to long
		
	//Similar to the previous case, assigning a float to a long requires explicit casting. 
  //Converting from float to long can also lose precision (the fractional part of the float 
		//is discarded).
		
		
		
		//float f2 = 10.23; // Error: 10.23 is treated as a double by default.
//The literal 10.23 is treated as a double by default in Java. 
//Since double has a higher precision than float, 
//you cannot directly assign it to a float variable without a cast. 
		
	
		//long m = 10.23;//// Error: Cannot convert from double to long
		
		//int c = 10.23;///// Error: Cannot convert from double to int
///Both lines have issues because 10.23 is treated as a double, and Java 
		//does not automatically convert double to long or int.
	}

}

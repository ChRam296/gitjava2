
public class DataTypeCastingDemo3 {

	public static void main(String[] args) {
	int a = 10;
	float f1 = a;//implicit data type casting
	
//an int value a is assigned to a float variable f1. This is an example of implicit 
//(or automatic) type casting, where Java converts int to float automatically 
//because float has a larger range and precision than int.This operation is safe and does not lose data.
	
	int b = (int)f1;//explicit data type casting
//Here, a float value f1 is being cast to an int type. 
//This is explicit casting, as it requires an explicit type conversion. 
//The fractional part of f1 will be truncated when converting from float to int. 
	
	long k = (long)f1;// Explicit data type casting.
//Converting a float to a long requires explicit casting. 
//The fractional part of the float will be lost, and the remaining integer part 
//will be assigned to k.	
	
	float f2 = (float) 10.23;// explicit data type casting
//The literal 10.23 is treated as a double by default in java. 
//To store it in a float variable f2, you need to cast it explicitly.
//The cast float truncates the precision of the double value.	
	System.out.println(f2);
	
	float f3 = (float)10.237876767;//explicit data type casting
//Similar to f2, the literal 10.237876767 is a double, 
//and explicit casting to float is required.
//This casting reduces the precision of the value.we will notice the loss of precision when printing f3.	
	System.out.println(f3);
	
	long m = (long) 10.23; //explicit data type casting
//Converting a double value 10.23 to long involves truncating both the fractional part 
	//and converting it to a long. 
	System.out.println(m);
	
	int c = (int)10.23; //explicit data type casting
//Converting a double value 10.23 to an int involves truncating the fractional part. 
//The resulting value will be 10.	
	System.out.println(c);
			
	

	}

}

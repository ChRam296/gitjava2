//Implicit Casting (Widening Conversion): Java allows implicit casting when converting 
//from a smaller or less precise type to a larger or more precise type. 
//This is safe and usually performed automatically by the Java compiler.
//long to float: Possible, but with potential precision loss.
//long to double: Possible without precision loss, as double 
//can accurately represent all long values.
//float to double: Possible and safe, as double has more precision than float.
//This is because the target type can accommodate all possible values of the source type. 
//For example:

//int to float
//long to float
//int to double
//long to double
//float to double

public class DatatypeCastingDemo1 {

	public static void main(String[] args) {
		
		int a = 10;       //int: A 32-bit integer type.
		                   //float: A 32-bit floating-point type.
		
		float f1 = a;    //Converting an int to float is safe because float has enough range to 
		//include all possible values of int, even if it loses some precision.
		System.out.println(f1);
		
		long k = 3000;//long: A 64-bit integer type that can hold very large integer values.
		                  
		float f2 = k; //float: A 32-bit floating-point type that represents numbers with fractional parts.
		System.out.println(f2);
		
		double d1 = a;///int: A 32-bit signed integer.
		             ///double: A 64-bit floating-point type. double has sufficient precision to store all 
		             ///possible int values accurately, 
		              //and it can accommodate additional decimal places if needed.
		System.out.println(d1);
		
		
		
		double d2 = k; //long: A 64-bit integer type.
		               //double: A 64-bit floating-point type with greater precision than float.
		System.out.println(d2);
		
		
		double d3 = f1;//float: A 32-bit floating-point type.
		                //double: A 64-bit floating-point type.
		
		System.out.println(d3);
		
		
		

	}

}

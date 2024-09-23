

// In the below code we tried to declare static variables of various primitive data types.
// Java initializes static and instance variables with (defalut values) 
//if they are not explicitly intialized.

public class DataTypesDemo1 {
  
	static byte b1;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean b2;
    
	
	public static void main(String[] args) {
	
		// int a;
		// System.out.println(a);// This line results in a compile-time error.
		//Local variables (like a) must be initialized before they are used. 
		//Unlike static and instance variables, local variables do not have default values in Java, 
		//so trying to print an uninitialized local variable results in an error.
		
		
		System.out.println(b1);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b2);
		
		char c1 = 'a';
		char c2 = 'e';
		char c3 = '5';//char data type is used to represent single 16-bit Unicode characters. 
		//While char is used for characters, it can also represent digits because, in Unicode, 
		//each character is assigned a specific numerical value, which includes digits.
		//char values are essentially integer values that represent Unicode code points. 
		//For example, the character '5' is represented internally by its Unicode code point, 
		//which corresponds to the number 53 in decimal.
		
		char c5 = ' ';
	}

}

// Basically in java by default static variables are readily converted into machine level code.  
// For instance variables we need to give written instruction(code) in which we are creating an
// object using 'new' keyword.
// But still we are not able to print the values of 'a' and 'b' as we havent assigned the object
// to any variables tats the reason for this compilation error.

public class ObjectDemo2 {
	
	int  a = 10;
	boolean b = true;
	static int c = 20;

	public static void main(String[] args) {
		System.out.println(c);
		
		//System.out.println(a);
		//System.out.ptintln(b);
		
		new ObjectDemo2();
		new ObjectDemo2();
		
		//System.out.println(a);
	//	System.out.println(b);
		
		

	}

}

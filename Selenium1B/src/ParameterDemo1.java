/*Explanation
Method Parameters vs. Variables:

Method Parameters: These are the variable names defined in the method signatures 
(e.g., a in funA(int a)). They act as placeholders for the values you pass when you 
call the method.

Variables in the Main Method: These are the values or variables (i, l1, f1, d1, e1, f2) 
that you use when calling the methods. They hold data that you want to pass to the methods.
Direct Values and Variables:

Direct Values: When you call a method with a direct value (e.g., p1.funA(20);), 
you are passing that value directly to the method's parameter.
Variables: When you call a method with a variable (e.g., p1.funA(i);), you are passing 
the value contained in the variable i to the method.

Summary
Method Parameters: Are used to define what type of data the method will work with.
Variables: Hold data that you pass to the methods.

Direct Values vs. Variables: You can call methods with either direct values or variables. 
The method will use these values as if they were its own local variables.
This approach ensures that your methods can be reused with different values, 
making your code more flexible and modular.
 
 */


public class ParameterDemo1 {

	public static void main(String[] args) {
		ParameterDemo1 p1 = new ParameterDemo1();
		p1.funA(20);// Calls funA with the direct value 20
		int i = 30;
		p1.funA(i);//Calls funA with the variable i which has the value 30
		p1.funB(33l);// Calls funB with the direct value 33L (long)
		long l1 = 45l;
		p1.funB(l1);//Calls funB with the variable l1 which has the value 45L
		p1.funC(10.23f);//Calls funC with the direct value 10.23f (float)
		float f1 = 23.89f;
		p1.funC(f1);//Calls funC with the variable f1 which has the value 23.89f
		p1.funD(95);// Calls funD with the direct value 95 (int, which is automatically 
		//converted to double)
		
		double d1 = 105;
		p1.funD(d1);//Calls funD with the variable d1 which has the value 105 (double)

		p1.funE('e');// Calls funE with the direct value 'e' (char)
		char e1= 'g';
		p1.funE(e1);// Calls funE with the variable e1 which has the value 'g'
        p1.funF(false);//Calls funF with the direct value false (boolean)
		boolean f2 = true;
		p1.funF(f2);//Calls funF with the variable f2 which has the value true
		}
	void funA(int a){
		System.out.println(a);
	}
	
	void funB(long b){
		System.out.println(b);
	}
	
	void funC(float c){
		System.out.println(c);
	}
	
	void funD(double d){
		System.out.println(d);
	}
	void funE(char e){
		System.out.println(e);
	}
	
	void funF(boolean f){
		System.out.println(f);
	}
	
}

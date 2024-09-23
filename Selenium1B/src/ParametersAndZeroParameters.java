/*funA() has no parameters and simply computes the sum of the local variables a and b.
The output here is 30, which is the sum of 10 and 20.
 * 
 * First Call to funB(10, 50):

a is initially 10, and b is initially 50, but within the method, a and b 
are reassigned to 40 and 50.// values '10', '50' were only passed as arguments to invoke funB()
The sum 40 + 50 results in 90, which is printed.

Second Call to funB(60, 80):

Similarly, a is initially 60, and b is initially 80, but within the method, they are reassigned to 40 and 50.
The sum 40 + 50 results in 90, which is printed again.
values '60', '80' were only passed as arguments to invoke funB()

Conclusion:
The method funB always reassigns its parameters to 40 and 50, regardless of the values 
passed when calling it. This reassignment overrides the original values passed to the method. 
As a result, the output of funB is always 90, and this is why you see 30, 90, 90 in the output.
 *
 * *********THE BELOW CODE IS INEFFICIENT AS IT DOESN'T FULLY SERVE THE REAL PURPOSE OF USING 
 * PARAMETERIZED FUNCTION. THAT IS THE POINT OF USING PARAMETERIZED FUNCTION IS TO CHANGE 
 * THE VALUES OF MY LOCAL VARIABLES WHICH IS NOT DONE IN THE BELOW PROGRAM***********
 * 
 * 
 */
public class ParametersAndZeroParameters {

	public static void main(String[] args) {
		ParametersAndZeroParameters bd4 = new ParametersAndZeroParameters();
		bd4.funA();
		bd4.funB(10,50);
		bd4.funB(60, 80);
		bd4.funB(110, 150);

		System.out.println("done");
}

	void funA()
	{

	int a = 10;
	int b = 20;
	int c = a+b;
	System.out.println(c);
	}

	void funB(int a, int b)
	{
	 a = 40;
	 b = 50;
	 int c = a+b;
	System.out.println(c);
	}

}

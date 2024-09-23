/*The provided program performs a sequence of value assignments among four variables (a, b, c, d) 
 * and uses a temporary variable (e) to facilitate this process. 
 * Although the final values are in a descending order, the code doesn't perform a 
 * typical sorting or cyclic swap. Instead, it reassigns values in a 
 * specific sequence that results in the variables holding values in descending order.
  
 */
public class PractiseReAssignNumbers {

	public static void main(String[] args) {
		int a = 40;
		int b = 50;
		int c = 60;
		int d = 70;
		int e;

		e = d;
		System.out.println("The value of e is:" + e);// value of a is now been assigned to e.

		d = c;
		System.out.println("The value of d is :" +d);

		c= b;
		System.out.println("The value of c is:" +c);

		b = a;

		System.out.println(" The value of b is:" +b);
		 
		}
		} 

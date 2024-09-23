/* Instance Variables: Accessed and printed using the object reference value. 
 * These values are set at the class level.
 * 
Local Variables: Declared and used within the NewValues method. 
They do not affect or modify the instance variables. 

The local variables in NewValues are independent of the instance variables and 
exist only within the scope of the NewValues method.
And Local variables inside NewValues method do not affect the instance variables and 
are separate from them. Also we cannot modify instance variables directly 
inside NewValues without using the 'this' keyword 
 * 
 */
public class PracticeObject1 {

	int x = 11;
	int y = 13;
	int z = 17;
	public static void main(String[] args) {
		PracticeObject1 value = new PracticeObject1();
		
		System.out.println("Instance value of x: " + value.x); // Corrected to print instance variable x
        System.out.println("Instance value of y: " + value.y); // Corrected to print instance variable y
        System.out.println("Instance value of z: " + value.z); // Corrected to print instance variable z
		value.NewValues();
	

	}
 void NewValues(){
	 int x = 19;
	 int y = 23;
	 int z = 27;
	 System.out.println("local value of x:" +x);
	 System.out.println("local value of y:" +y);
	 System.out.println("local value of z:" +z);
 }
 
}

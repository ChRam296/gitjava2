/*Instance Variables Initialization:

The instance variables x, y, and z are initialized at the class level and have initial values 
(45, 55, 65).

Method Modification:

The Modifiedvalues() method updates the instance variables x, y, and z to new values (75, 85, 95).
 * The Modifiedvalues() method updates the instance variables x, y, and z to new values (105, 115, 125).
 * In both Modifiedvalues() and Modifiedvalues1(), you are indeed modifying the instance variables x, y, and z. 
 * This is because the variables x, y, and z in these methods refer to the instance variables 
 * declared at the class level.
 * instance variables are accessible and modifiable within the instance methods because 
 * they are declared at the class level, and the methods directly affect these variables.

No Local Variables: There are no local variables declared in these methods with the same names 
as the instance variables. If you had declared local variables named x, y, and z 
inside these methods, they would have shadowed the instance variables within the 
scope of the method, but that is not the case here.
 */
public class PracticeObject {
	int x = 45;
	int y = 55;
	int z = 65;
	public static void main(String[] args) {
		PracticeObject Obj1 = new PracticeObject();

        // Print original values of x, y, and z
        System.out.println("Original x value: " + Obj1.x); // Outputs: Original x value: 45
        System.out.println("Original y value: " + Obj1.y); // Outputs: Original y value: 55
        System.out.println("Original z value: " + Obj1.z); // Outputs: Original z value: 65

        // Call the method that modifies values
        Obj1.Modifiedvalues();

        // Print values after calling Modifiedvalues()
        System.out.println("Modified x value: " + Obj1.x); // Outputs: Modified x value: 75
        System.out.println("Modified y value: " + Obj1.y); // Outputs: Modified y value: 85
        System.out.println("Modified z value: " + Obj1.z); // Outputs: Modified z value: 95
        
        Obj1.Modifiedvalues1();
        System.out.println("Modified x value: " + Obj1.x); // Outputs: Modified x value: 105
        System.out.println("Modified y value: " + Obj1.y); // Outputs: Modified y value: 115
        System.out.println("Modified z value: " + Obj1.z); // Outputs: Modified z value: 125
        
        
    }

    // Method to modify instance variables
    void Modifiedvalues() {
        // Modify the instance variables
        x = 75;
        y = 85;
        z = 95;
    }
	
	
    void Modifiedvalues1(){
	x=105;
	y=115;
	z=125;
}
}
/* From below code we can conclude that we can use class name as return type in a return method
 *  
 *  Inner Class Definition:

The Be_Happy class is defined as an inner class within PracticeTask1Mandey. 
This means Be_Happy is associated with instances of PracticeTask1Mandey and can be used 
within the methods of PracticeTask1Mandey.

Purpose of Creating Instances:

In the methods hello() and hello1(), you create instances of the Be_Happy class 
(Be_Happy obj1 = new Be_Happy();).
These instances are then returned by the methods.
Returning Instances:

The methods hello() and hello1() return an instance of Be_Happy. 
This allows you to create and pass around objects of the Be_Happy type. 
However, in the provided code, the returned instances are not used or stored; 
they are simply returned.

Clarification on Your Understanding
Role of Be_Happy:

The Be_Happy class is indeed used to create instances that are returned by the hello() and hello1() 
methods. The instance of Be_Happy created within these methods is returned to the caller, 
but in this code, the instances are not assigned to any variables or used further.

Shared Instances:

Each time hello() or hello1() is called, a new instance of Be_Happy is created and returned. 
These instances are independent of each other and exist as separate objects in memory.

Purpose:

You are using Be_Happy to return objects of that type from the methods. 
This can be useful if you need to pass objects around in your program, 
but in the current implementation, the returned instances are not utilized after they are returned.

Step-by-Step Explanation:
Method Call:

obj1.hello() invokes the hello() method.
Inside hello(), a new Be_Happy object (obj1) is created.

Return Statement:

The return obj1; statement in the hello() method sends the Be_Happy instance back to the caller.
In the main method, this returned object is assigned to the variable obj1.

Local Variable:

Inside hello(), obj1 is a local variable that holds a reference to the new Be_Happy object.
The return statement makes the reference to this object available to the caller.
Similarly, inside hello1(), obj1 is a local variable that holds a reference to a 
new Be_Happy object, which is returned and assigned to obj1 in the main method.

Captured Values:

After obj1.hello() executes, Obj1 in the main method now holds 
the reference to the Be_Happy instance created inside hello().
After obj1.hello1() executes, Obj1 in the main method now holds 
the reference to the Be_Happy instance created inside hello1().

Summary
Execution and Return: When a method is invoked, it executes and then returns a value 

if specified. This returned value is captured by the calling code if needed.

Local Variable: Variables created within a method, like obj1 in hello() and hello1(), 
are local to that method but can be returned and used outside the method.
Capture Returned Values: To use the returned value, you assign it to a variable 
in the calling code, allowing further operations with that value.
This flow ensures that the value or object created 
inside the method can be used outside the method where it was created.
 */

public class PracticeTask1Mandey {
	

  public class Be_Happy
	{
		
	
	
	}
  
  public static void main(String[] args) {
		
		PracticeTask1Mandey obj1 = new PracticeTask1Mandey();
		// Instance was created here to invoke the method.  
		
		obj1.hello();
		obj1.hello1();
  }

	Be_Happy hello()
	{
		System.out.println("Arif");
		Be_Happy obj1 = new Be_Happy();
		// Instance was created here to return the value as Be_Happy
		return obj1;
		}
	Be_Happy hello1(){
		int a =15;
		int b = 20;
		 int c = a+b;
		 System.out.println("The value of c is:" + c);
		 Be_Happy obj1 = new Be_Happy();//// Instance was created here to return the value as Be_Happy
		 return obj1;
	}

}

/* Flow of Execution:
Here’s how the methods call each other:

The main method calls func.
The func method prints its message and calls funB.
The funB method prints its message and calls funA.
The funA method prints its message and calls func again.
This creates a loop where:

func calls funB
funB calls funA
funA calls func
Infinite Recursion:
When func is called from funA, it prints "func of MethodDemo4" and then calls funB again.
funB calls funA, and funA calls func again.
This cycle continues indefinitely.*/


public class MethodDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Start");
		func();
		System.out.println("Done");
}
static void funA(){
	System.out.println("funA of MethodDemo4");
	func();
}

static void funB(){
	System.out.println("funB of MethodDemo4");
	funA();
}
static void func(){
	System.out.println("func of MethodDemo4");
	funB();
}
}
	

// From the previous program 'MethodDemo1' we got a clarification that 
//JVM executes all statements present inside main method.
// So in current program I tried to invoke funC() , funA(), funB() inside my main method
// func() func() does not get executed implicitly by default. 
//It only gets executed if you explicitly call it in your code.
//The JVM does convert bytecode (produced by the Java compiler) into machine code, 
//but this conversion occurs as part of the JVM’s process of executing bytecode. 
//The JVM handles this automatically at runtime, but it does not 
//execute methods unless they are explicitly called.


public class MethodDemo2 {

	public static void main(String[] args) {
	System.out.println("main method of MethodDemo2");
	func();
	//funA();
	//funB();
	}
	
//	void funA(){
//		System.out.println("funA of MethodDemo2");
	//	}

	//void funB(){
		//System.out.println("funB of MethodDemo2");
	//	}
	static void func(){
		System.out.println("funC of MethodDemo2");
	}
	}



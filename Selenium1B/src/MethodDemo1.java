//Below program demonstrates the usage of static methods and instance methods. 
// you can write any number of instance methods or static methods 
// but they need to be called from the main method for static we can call by using className.method name
// for instance method there is a necessity of creating an instance(object creation) from that
// particular instance I can call my instance method.

public class MethodDemo1 {

	public static void main(String[] args) {
	
	System.out.println("main method of MethodDemo1");
	   //  MethodDemo1.func();
	}

	void funA(){                                  // instance method
		System.out.println("funA of MethodDemo1");
		funB();                           // I am trying to invoke or call funB() method in funA()
	}
	void funB(){                               // instance method
		System.out.println("funB of MethodDemo1");
		funA();                          //  I am trying to invoke or call funA() method in funB()
		}
	static void func(){                         // static method with method name 'func'. 
		                                        // This method can be called in main method 
		                                         // by using classname.method name.
		System.out.println("func of MethodDemo1");
	}
}



//Type Mismatch: int a = new ObjectDemo3(); and boolean b = new ObjectDemo3(); 
//both attempt to assign an ObjectDemo3 object to primitive types (int and boolean respectively). 
//This is a type mismatch and will result in a compilation error.

//Reason: new ObjectDemo3() creates an object of type ObjectDemo3, 
//not an int or boolean. You cannot directly assign an object to a primitive data type. 
// finally we can say type casting is possible.


public class ObjectDemo3 {
	int a = 10;
	 boolean b = true;
	 static int c = 20;
	 
	public static void main(String[] args) {
	// int a = new ObjectDemo3();
	 
	 //boolean b = new ObjectDemo3();

	}

}

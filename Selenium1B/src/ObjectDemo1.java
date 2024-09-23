// Negative case. We can use class name as Data type in java. 
//By using this data type we tried to actually initialize values for two variables a1, a2.
// but java was throwing error because 'ObjectDemo1' intended purpose was to store address for 
// memory location for all instance variables but it doesnt actually hold the values directly
//for any variables.
//ObjectDemo1 is trying to assign primitive values to an object type, which is also incorrect.

//Type Mismatch:ObjectDemo1 a1 = 10; and ObjectDemo1 a2 = true; 
//attempt to assign primitive values to an object type ObjectDemo1. 
//This will result in a compilation error.
//Reason: ObjectDemo1 is a class type, and you cannot assign primitive values 
//(int, boolean) directly to a class type variable. Finally we can say type casting is not possible


public class ObjectDemo1 {

	public static void main(String[] args) {
		
		//ObjectDemo1 a1 = 10;
		//ObjectDemo1 a2 = true;

	}

}

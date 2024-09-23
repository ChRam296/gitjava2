
public class Odemo4 {

	int x;
	A a1;
	
	public static void main(String[] args) {
	
		Odemo4 d1 = new Odemo4();
        System.out.println(d1.x);
        System.out.println(d1.a1);
        System.out.println(d1.a1.i);// compile time error as a1 is now holding null address and we cannot get the value of 'i' variable
        // null pointer exception.
	}

}

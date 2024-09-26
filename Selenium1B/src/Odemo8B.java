
public class Odemo8B {

	public static void main(String[] args) {
		Odemo8B d1 = new Odemo8B();		
		Suresh s1 = new Suresh();
		d1.functionA(s1);
		VariableDemo1 v1 = new VariableDemo1();
		d1.functionB(v1);
		MethodDemo7 m1 = new MethodDemo7();
		d1.functionC(m1);
	}
 void functionA(Suresh s1)
 {
	 System.out.println(s1);
 }
 void functionB(VariableDemo1 v1)
 {
	 System.out.println(v1);
 }
 void functionC(MethodDemo7 m1)
 {
	 System.out.println(m1);
 }
}

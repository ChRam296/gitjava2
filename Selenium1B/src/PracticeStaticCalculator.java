
public class PracticeStaticCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the world of mathematics");
		PracticeStaticCalculator calculation = new PracticeStaticCalculator();
		calculation.addition();
		calculation.subtraction();
		calculation.multiplication();
		calculation.division();
}

	void addition(){
		int a =20;
		int b = 30;
		int c = a+b;
		System.out.println(c);
		}
	
	void subtraction(){
		int a = 30;
		int b = 20;
		int c = a-b;
		System.out.println(c);
		}
	void multiplication(){
		int a = 20;
		int b = 10;
		int c = a*b;
		System.out.println(c);
		}
	void division(){
		int a = 35;
		int b = 5;
		int c = a/b;
		System.out.println(c);
	}
}

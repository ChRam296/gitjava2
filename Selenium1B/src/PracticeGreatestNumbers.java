
public class PracticeGreatestNumbers {

	public static void main(String[] args) {
		int a = 25;
		int b  = 78;
		int c = 87;
		int d = 117;
		
		if (a>b && a>c && a>d){
			System.out.println("a is greater than b, c, d");
		}
		
		if (b>a && b>c && b>d){
			System.out.println("b is greater than a,c,d");
		}
		if (c>a && c>b && c>d)
		{
			System.out.println("c is greaater than a,b,d");
		}
		if (d>a && d>b && d>c)
		{
			System.out.println("d is greater than a,b,c ");
		}

	}

}

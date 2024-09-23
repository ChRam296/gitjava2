
public class PactiseSmallestNumbers {

	public static void main(String[] args) {
		int a = 117;
		int b = 229;
		int c = 87;
		int d = 78;
		int e = 25;
		if(a<b && a<c && a<d && a<e){
			System.out.println("a is smallest of b,c,d,e");
		}
		if(b<a && b<c && b<d && b<e){
			System.out.println("b is smallest of a,c,d,e");
		}
		if(c<a && c<b && c<d && c<e)
		{
			System.out.println("c is smallest of a,b,d,e");
		}
		
		if (d<a && d<b && d<c && d<e){
			System.out.println("d is smallest of a,b,c,e ");
		}
		
		if(e<a && e<b && e<c && e<d){
			System.out.println("e is smallest of a,b,c,d");
		}

	}

}

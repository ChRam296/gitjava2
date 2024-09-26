
public class OdemoPractise {

public static void main(String[] args) {
	OdemoPractise d1 = new OdemoPractise();
	d1.functionA(10, 20);
	d1.functionB(33, 44);
	d1.functionC(44, 55);
	d1.functionC(44, 44);
	d1.functionC(55, 44);
	d1.functionD(75, 65);
	d1.functionD(75, 75);
	d1.functionD(65, 75);
	d1.functionE(85, 85);
	d1.functionE(95, 105);
	d1.functionF(111, 111);
	d1.functionF(100, 121);

	}
   void functionA(int a, int b)
   {
	   
	   if(a < b)
	   {
		   System.out.println("Above statement in functionA holds true");
	   } else
	   {
		System.out.println("Above Statement in functionA holds false"); 
   }}
   void functionB(int a ,int b)
   {
	   if(a > b)
	   {
		   System.out.println("Above Statement in functionB holds true");
	   } else{
		   System.out.println("Above statement in functionB holds false");
	   }
   }
   void functionC(int a, int b)
   {
	   if (a<=b)// a < b, or a = b then this condition holds true
	   {
		 System.out.println("Above statement in functionC holds true");  
	   } else {
		   System.out.println("Above statement in functionC holds false");
	   }
   }
   void functionD(int a, int b)
   {
	   if(a>=b)// a > b, or a = b then this condition holds true
	   {
		   System.out.println("Above condition in functionD holds true");
	   } else {
		   System.out.println("Above condition in functionD holds false");
	   }
   }
   void functionE(int a, int b)
   {
	 if(a==b)
	 {
		 System.out.println("Above condition in functionE holds true");
	 } else {
		 System.out.println("Above condition in functionE holds false");
	 }
   }
   void functionF(int a, int b)
   {
	   if (a!=b)
	   {
		   System.out.println("Above condition in functionF holds true");
	   } else {
		   System.out.println("Above condition in functionF holds false");
	   }
   }
   }




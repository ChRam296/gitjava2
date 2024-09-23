
public class PractiseMethodTypeDemo {

	
	public static void main(String[] args) 
	 {
	    PractiseMethodTypeDemo Obj = new PractiseMethodTypeDemo();
	    Obj.functionA(10, 22l, 33.0f, 44.0, 'e', false);
        Obj.functionB(10, 20, 3);
	    Obj.functionC(44l, 2l, 2l);
	    Obj.functionD(33F, 4F, 1F);
	    Obj.functionE(10.0, 20.0, 0.0);
	    functionF(11,33l,55.0f,65.0,'f', false);
	    functionG(33,22,1);
	    functionH(44f,20f,1f);
	    functionI(55.0,4.0,0.0);
	    functionJ(false);
	    functionK('f');
	    
	  }
	  
	  void functionA(int a , long b, float c, double d, char e , boolean f)
	  {
	    System.out.println("Parameterized function of non-return type was invoked sucessfully");
	    
	  }
	  
	  int functionB(int a, int b, int c)
	  {
		  c = a+b;
		  System.out.println(c);
		  return 0;
	  }
	  long functionC(long a, long b, long c)
	  {
		   c = a/b;
		   System.out.println(c);
		  return 0l;
	  }
	  
	  float functionD(float a, float b , float c)
	  {
		  c = a*b;
		  System.out.println(c);
		  return 0.0f;
	  }
	  
	  double functionE(double a, double b, double c)
	  {
		  
		  c = a*b;
		  System.out.println(c);
		  return 0.0;
	  }
	  
	  static void functionF(int a, long b, float c, double d, char e, boolean f)
	  {
		  System.out.println("Static function of non-return type was invoked sucessfully");
		  
	  }
	  static int functionG(int a, int b, int c)
	  {
		  c = a-b;
		  System.out.println(c);
		  return 0;
	  }
	  static float functionH(float a, float b, float c)
	  {
		  c = a/b;
		  System.out.println(c);
		  return 0.0f;
	  }
	  static double functionI(double a, double b, double c)
	  {
		  c = a/b;
		  System.out.println(c);
		  return 0.0;
	  }
	  static boolean functionJ(boolean a)
	  {
		  System.out.println("Static non-return boolean datatype function was invoked");
		  return false;
		  
	  }
	  static char functionK(char a)
	  {
		  
		  System.out.println("Static non-return char datatype function was invoked");
		  return 'e';
	  }
	 
	  }
	  



	
 


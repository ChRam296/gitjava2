
public class ParametersAndZeroParameters2 {

	public static void main(String[] args) {
		ParametersAndZeroParameters2 bd4 = new ParametersAndZeroParameters2();
		bd4.funA();
		bd4.funB("Krishna", 1022,35000,25);
		bd4.funB("Ramesh",1024,45000,26);
		bd4.funB("Suresh",1027,55000,27);

		System.out.println("done");
}

	void funA()
	{
         String Emp_Name = "HariRamKrishna";
          System.out.println( "The Employee name is:" + Emp_Name);
         int Emp_ID = 1020;
         System.out.println("The Employee Id is:" + Emp_ID);
         int Emp_Salary = 30000;
         System.out.println("The Employee Salary is:" + Emp_Salary);
         int Emp_Age = 30;
         System.out.println("The Employee Age is:" + Emp_Age);
	}


	void funB(String Emp_name, int Emp_ID , int Emp_salary, int Emp_Age)
	{
	 
          System.out.println( "The Employee name is:" + Emp_name);
         
         System.out.println("The Employee Id is:" + Emp_ID);
         
         System.out.println("The Employee Salary is:" + Emp_salary);
         
         System.out.println("The Employee Age is:" + Emp_Age);
	}
	
}






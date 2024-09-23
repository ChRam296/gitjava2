
public class PracticeEmployeeInfo {

	String employee_Name;
	int employee_ID;
	int employee_Salary;
	String employee_Designation;

	public static void main(String[] args) {
	
		PracticeEmployeeInfo value5 = new PracticeEmployeeInfo();
		value5.EmployeeDetails1();
		value5.EmployeeDetails2();
	}

	void EmployeeDetails1()
	{
	String employee_Name = "HariKrishna";
	System.out.println("Employee name is:" + employee_Name);
	int employee_ID=10011;
	System.out.println("Employee ID is:" + employee_ID);
	double employee_Salary=45000;
	System.out.println("Employee Salary is:" + employee_Salary);
	String employee_Designation="Analyst";
	System.out.println("Employee designation is:" + employee_Designation);
	}

	void EmployeeDetails2()
	{
	String employee_Name= "RamaKrishna";
	System.out.println("EmployeeDetails is:" + employee_Name);
	int employee_ID = 10014;
	System.out.println("Employee ID is:" + employee_ID);
	double employee_Salary = 55000;
	System.out.println("Employee salary is: " + employee_Salary);
	String employee_Designation = "Senior Analyst";
	System.out.println("Employee designation is:" + employee_Designation);
	}
}

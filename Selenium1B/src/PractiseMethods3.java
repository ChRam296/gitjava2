
public class PractiseMethods3 {

	public static void main(String[] args) {
		int GrossSalary = 100000;
		PractiseMethods3 p1 = new PractiseMethods3();
		
		int NetSalary = GrossSalary - p1.monthlyexpenses();//non-static function of return datatype
		System.out.println( "Remaining salary after deducting all expenses were:" +NetSalary);
		monthlyexpenses1();//static function of return datatype
		p1.monthlyexpenses3();//non-static function of non-return datatype
		monthlyexpenses4();//static function of non-return datatype
		p1.monthlyexpenses5(20000, 5000, 3000, 5000, 45000, 3000);//non-static parameterized function of return type.
		monthlyexpenses6(20000,5500,3000,5000,48000,3000);// static parameterized function of return type
		p1.monthlyexpenses7(30000, 6000, 5000, 8000, 55000, 4000);// non-static parameterized function of  non-return type
		monthlyexpenses8(35000,4500,4500,6000,45000,3500);// static parameterized function of non-return type
	}
	
	int monthlyexpenses()//1) Non-static function of  return datatype
	{
		System.out.println("MonthlyExpenses of non-static function of returntype is invoking");
		int Rent = 20000;
		int ElectricityBill = 5000;
		int waterBill = 2500;
		int ProvidentFund = 5000;
		int TaxDeduction = 45000;
		int ProfessionalTax = 3000;
		int totalExpenses = Rent+ElectricityBill+waterBill+ProvidentFund+TaxDeduction+ProfessionalTax;
		
		return totalExpenses;
	}
	static int monthlyexpenses1()//2) static function of return datatype
	{
		System.out.println("MonthlyExpenses of static function of returntype is invoking");
		int Rent = 20000;
		int ElectricityBill = 5000;
		int waterBill = 2500;
		int ProvidentFund = 5000;
		int TaxDeduction = 45000;
		int ProfessionalTax = 3000;;
		int totalExpenses = Rent+ElectricityBill+waterBill+ProvidentFund+TaxDeduction+ProfessionalTax;
		return totalExpenses;
	}
	
	void monthlyexpenses3() //3) non-static function of non-return datatype
	{
		System.out.println("MonthlyExpenses of non-static function of non-returntype is invoking");
		int Rent = 20000;
		int ElectricityBill = 5000;
		int waterBill = 2500;
		int ProvidentFund = 5000;
		int TaxDeduction = 45000;
		int ProfessionalTax = 3000;
		int totalExpenses = Rent+ElectricityBill+waterBill+ProvidentFund+TaxDeduction+ProfessionalTax;
        System.out.println("Remaining salary after deducting all expenses" +totalExpenses);
		
	}
	
	static void monthlyexpenses4() // 4)static function of non-return datatype
	{
		System.out.println("MonthlyExpenses of static function of non-returntype is invoking");
		int Rent = 20000;
		int ElectricityBill = 5000;
		int waterBill = 2500;
		int ProvidentFund = 5000;
		int TaxDeduction = 45000;
		int ProfessionalTax = 3000;
		int totalExpenses = Rent+ElectricityBill+waterBill+ProvidentFund+TaxDeduction+ProfessionalTax;
        System.out.println("Remaining salary after deducting all expenses" +totalExpenses);
		
	}
	int monthlyexpenses5(int Rent, int ElectricityBill,int waterBill,int ProvidentFund,int TaxDeduction , int ProfessionalTax ) // 5)non-static function of  parameterized return datatype
	{
		System.out.println("MonthlyExpenses of non-static function of returntype is invoking");
		
		int totalExpenses = Rent+ElectricityBill+waterBill+ProvidentFund+TaxDeduction+ProfessionalTax;
        System.out.println("Remaining salary after deducting all expenses" +totalExpenses);
		return totalExpenses;
	}
	static int monthlyexpenses6(int Rent, int ElectricityBill,int waterBill,int ProvidentFund,int TaxDeduction , int ProfessionalTax ) //6) static function of  parameterized return datatype
	{
		System.out.println("MonthlyExpenses of static function of returntype is invoking");
		
		int totalExpenses = Rent+ElectricityBill+waterBill+ProvidentFund+TaxDeduction+ProfessionalTax;
        System.out.println("Remaining salary after deducting all expenses" +totalExpenses);
		return totalExpenses;
	}
	void monthlyexpenses7(int Rent, int ElectricityBill, int waterBill, int ProvidentFund, int TaxDeduction,int ProfessionalTax) // 7)non-static  parmeterized function of non-return datatype
	{
		System.out.println("MonthlyExpenses of non-static parameterized function of non-returntype is invoking");
		
		int totalExpenses = Rent+ElectricityBill+waterBill+ProvidentFund+TaxDeduction+ProfessionalTax;
        System.out.println("Remaining salary after deducting all expenses" +totalExpenses);
		
	}
    static void monthlyexpenses8(int Rent, int ElectricityBill, int waterBill, int ProvidentFund, int TaxDeduction, int ProfessionalTax)
 {
System.out.println("MonthlyExpenses of static parameterized function of non-returntype is invoking");
		
		int totalExpenses = Rent+ElectricityBill+waterBill+ProvidentFund+TaxDeduction+ProfessionalTax;
        System.out.println("Remaining salary after deducting all expenses" +totalExpenses);
		
 }

}

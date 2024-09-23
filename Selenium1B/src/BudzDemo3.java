
public class BudzDemo3 {

	public static void main(String[] args) {
		
		BudzDemo3  bd1 = new BudzDemo3();
		
		int salary = 100000;
		int balanceamount = salary- bd1.housecharges();
		System.out.println(balanceamount);
		int taxcalculation = 30*bd1.housecharges();
		System.out.println(taxcalculation);
		
		}

	int housecharges()
	{
		System.out.println("housecharges is invoking");
		int rent = 10000;
		int childfee = 20000;
		int totalcharges = rent+childfee;
		System.out.println(totalcharges);
		return totalcharges;
	}
	
}

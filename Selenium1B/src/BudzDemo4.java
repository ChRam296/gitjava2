
public class BudzDemo4 {

	public static void main(String[] args) {
		BudzDemo4 bd1 = new BudzDemo4();
		int charges = bd1.housecharges();
		int salary = 100000;
		int balanceamount = salary - charges;
		System.out.println(balanceamount);
		int taxcal = 30*charges;
		System.out.println(taxcal);
		
		

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

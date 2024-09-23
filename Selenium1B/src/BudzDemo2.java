
public class BudzDemo2 {

	public static void main(String[] args) {
		BudzDemo2 bd1 = new BudzDemo2();
		int salary = 100000;
		int balanceamount = salary - bd1.housecharges();
		System.out.println(balanceamount);

	}
	int housecharges()
	{
		int rent = 10000;
		int childfee = 20000;
		int totalcharges = rent+childfee;
		System.out.println(totalcharges);
		return totalcharges;
	}

}

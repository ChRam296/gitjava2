
public class BooleanReturnType {

	public static void main(String[] args) {
		
			BooleanReturnType br1 = new BooleanReturnType();

			br1.functionA(1001,1001);
			br1.functionB(10000,5000);
			br1.functionC(30000,15000);
			}


			boolean functionA(int pin, int pin2)
			{

			if(pin==pin2)
			{
			System.out.println("ATM Pin entered successfully");
			} else {
			System.out.println("ATM Pin incorrect, please reenter correct pin");
			} 


			return false;
			}

			boolean functionB(int BalanceAmount ,  int WithDrawlAmount)
			{

			if (WithDrawlAmount<BalanceAmount)
			{
			System.out.println(" Withdrawal transcation is successful");
			} else {
			System.out.println("Withdrawal transcation is unsuccessful");
			}

			return false;
			}

			boolean functionC(int RemainingBalance , int TransferAmount)
			{
			if(RemainingBalance>TransferAmount)
			{
			System.out.println("Transfer done Sucessfully");
			} else {

			System.out.println("cannot complete this transcation insufficient funds");
			}
			return false;
			}
	}
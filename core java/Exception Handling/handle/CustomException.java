package handle;

 class InsufficientBalanceException extends Exception { //checked exception
	private String message;
	public InsufficientBalanceException() { this.message = ""; }
	public InsufficientBalanceException(String message) { this.message = message; }
	public String toString() {
		return "Money should be less than 2000." + this.message;
	}
}

class Account {
	private int money;

	public void withdraw(int money) throws InsufficientBalanceException {
		if(money> 1000)
			throw new InsufficientBalanceException("Insufficient Balance:" + money);
		this.money = money;
	}
}
class CustomException {
	public static void main(String args[]) {
		Account ac = new Account();
		try {
			ac.withdraw(1000);
		}
		catch(InsufficientBalanceException e)
		{
			e.printStackTrace();
		}
	}
}
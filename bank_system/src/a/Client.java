package a;

public class Client {

	private int id;
	private String name;
	private float balance;
	private Account[] accounts = new Account[5];
	private float commissionRate = 0;
	private float intrestRate = 0;
	private Logger logger;

	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		logger = new Logger("client name");
	}

//	*instant for logger
//	public Logger getLogger() {
//		return logger;
//	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void addAccount(Account a) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = a;
				Log act1 = new Log(0, 0, "null", 0);
				logger.log(act1);

			}
			break;

		}

	}

	public Account getAccount(int index) {
		if (accounts[index] == null) {

			return null;
		} else {
			return accounts[index];
		}

	}

	public void remove(int id) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getId() == id) {
				accounts[i] = null;
				System.out.println("your money transferd to your balance");
				Log act1 = new Log(0, 0, "null", 0);
				logger.log(act1);
			}

		}

	}

	public void deposit(int cDep) {
		balance += cDep;

	}

	public void withdraw(int cWith) {
		balance -= cWith;
	}

	public void autoUpdateAccounts() {
		for (Account ca : accounts) {
			ca.setBalance((balance) * (1 + intrestRate));

		}

	}

}

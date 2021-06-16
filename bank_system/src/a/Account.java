package a;

public class Account {

	private int id;
	private float balance;

	public Account(int id, float balance) {
		super();
		this.id = id;
		this.balance = balance;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(float balance) {
		this.balance = balance;
//		Log act1 = new Log(0, 0, "null", 0);
//		logger.log(act1);
	}

	// need to log balance

}

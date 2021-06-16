package a;

public class Logger {

	private String driverName;

	public Logger(String driverName) {
		super();
		this.driverName = driverName;
	}

	public void log(Log a) {
		System.out.println("log");

	}

	public static Log[] getLogs() {
		return null;

	}

}

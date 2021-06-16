package d.access.modifayers;

public class A {

	public int nPublic = 1;
	protected int nProtected = 2;
	int nSdefult = 3;
	private int nPrivate = 4;

	public void m(String[] args) {

		A a = new A();
		System.out.println(a.nPrivate);
		System.out.println(a.nProtected);
		System.out.println(a.nSdefult);
		System.out.println(a.nPublic);

	}

}

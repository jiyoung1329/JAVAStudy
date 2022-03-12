package threads;

public class Ex2 {
	public static void main(String[] args) {
		A2 a2 = new A2();
		B2 b2 = new B2();
		a2.start();
		b2.start();
	}
}

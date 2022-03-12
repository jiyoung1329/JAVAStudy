package threads;

public class Ex1 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		B1 b1 = new B1();
		a1.run();
		b1.run();
	}
}

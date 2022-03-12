package threads;

public class B1 {
	public void run() {
		for(int i = 100; i > 0; i--) {
			System.out.println("B1 : " + i);
		}
	}
}

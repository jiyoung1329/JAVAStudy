package threads;

public class B2 extends Thread{
	@Override
	public void run() {
		for(int i = 100; i > 0; i--) {
			System.out.println("B2 : " + i);
		}
	}
}

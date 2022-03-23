package lambda;

interface LamInterEx2{
	public void lam();
}

public class LambdaEx2{
	public static void main(String[] args) {
		LamInterEx2 lc = new LamInterEx2() {
			@Override
			public void lam() {
				System.out.println("구현");
			}
			
		};

		lc.lam();
	}
	
}

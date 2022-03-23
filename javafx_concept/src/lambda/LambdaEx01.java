package lambda;

interface LamInterEx1{
	public void lam();
}

class LamClassEx1 implements LamInterEx1{
	@Override
	public void lam() {
		System.out.println("구현");
	}

}

public class LambdaEx01{
	public static void main(String[] args) {
		LamClassEx1 lc = new LamClassEx1();
		lc.lam();
	}
}

package Method;

public class Prime {
	private int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public boolean isPrime() {
		for (int i=2; i<num; i++) {
			if (num % i == 0) return false;
		}
		return true;
		
		
	}
	
	
}

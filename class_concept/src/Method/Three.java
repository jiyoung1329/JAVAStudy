package Method;

public class Three {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public boolean result() {
		if (num % 3 == 0) return true;
		else return false;
	}
	
}

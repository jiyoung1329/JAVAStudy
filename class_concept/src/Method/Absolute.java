package Method;

public class Absolute {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int getAbsolute() {
		if (num >= 0) return num;
		else return (num * (-1));
	}
}

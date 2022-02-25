package constructor;

public class Reverse {

	int data, result;

	public Reverse() {}
	
	public Reverse(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	
	public int getResult() {
		int tmp = data;
		result = 0;
		while (tmp > 0) { 
			result *= 10;
			result += (tmp % 10);
			tmp /= 10;
		}
		return result;
	}


	
}

package Method;

public class EvenOdd {
	
	private int data;
	
	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}
	
	public boolean result() {
		if (data % 2 == 0) {
			return true;
		} else 
			return false;
		
	}
	
}

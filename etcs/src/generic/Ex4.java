package generic;

class Save<All>{
	private All data1;
	private All data2;
	
	public void setData1(All data1) {
		this.data1 = data1;
	}
	public void setData2(All data2) {
		this.data2 = data2;
	}
	public All getData1() {
		return data1;
	}
	public All getData2() {
		return data2;
	}

}
public class Ex4 {

	public static void main(String[] args) {
		Save save1 = new Save();
		save1.setData1(100);
		save1.setData2(1.1);
		
		Object data1 = save1.getData1();
		Object data2 = save1.getData2();
		
		int intData = (int) data1;
		double doubleData = (double) data2;
		
		Save<Integer> save2 = new Save<>();
		save2.setData1(100);
		save2.setData2(200);
		int intData2 = save2.getData1();
		int intData3 = save2.getData2();
	}
}

package generic;

class PrintClass{
	public void print(double data1, double data2) {
		System.out.println(data1 + ", " + data2);
	}
	public void print(int data1, int data2) {
		System.out.println(data1 + ", " + data2);
	}
	public void print(String data1, String data2) {
		System.out.println(data1 + ", " + data2);
	}
}
public class Ex1 {

	public static void main(String[] args) {
		PrintClass pc = new PrintClass();
		pc.print(1.1,2.2);
		pc.print(1,2);
		pc.print("김", "변수");
	}

}

package generic;

class PrintClass2{
	public void print(Object data1, Object data2) {
		System.out.println(data1 + ", " + data2);
	}
}
public class Ex2 {

	public static void main(String[] args) {
		PrintClass2 pc2 = new PrintClass2();
		pc2.print(1.1, 2.2);
		pc2.print(1, 2);
		pc2.print("김", "변수");
	}

}

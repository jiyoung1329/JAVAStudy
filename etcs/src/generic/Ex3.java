package generic;

class PrintClass3<All>{
	
	public void print(All data1, All data2) {
		System.out.println(data1 + ", " + data2);
	}
}
public class Ex3 {

	public static void main(String[] args) {
		PrintClass3 pc1 = new PrintClass3();
		pc1.print(1.1, 2.2);
		pc1.print(1, 2);
		pc1.print("김", "변수");
		
		PrintClass3<Integer> pc2 = new PrintClass3<>();
		pc2.print(100, 200);
		
		PrintClass3<Double> pc3 = new PrintClass3<>();
		pc3.print(1.1, 2.2);
	}

}

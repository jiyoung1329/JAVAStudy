package basic;

public class MainClass {
	// 접근제어자 예약어 반환자료형 함수이름(매개변수 0개이상)
	public static void main(String[] args) {
		test1();
		MainClass mc = new MainClass();
		mc.test2();
		
		SubClass sc = new SubClass();
		sc.test3();
//		sc.con();
		sc.insert();
	}
	
	public static void test1() {
		System.out.println("test1 method in MainClass");
	}
	
	public void test2() {
		System.out.println("test2 method in MainClass");
		
	}
}

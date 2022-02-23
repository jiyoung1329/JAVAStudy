package Method;

import java.util.Scanner;

public class EvenOddMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EvenOdd eo = new EvenOdd();
		System.out.print("데이터 입력");
		eo.setData(sc.nextInt());
		
		if (eo.result()) {
			System.out.println(eo.getData() + "는 짝수");
		} else {
			System.out.println(eo.getData() + "는 홀수");
			
		}
		
		
		
	}
}

package input;

import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		System.out.print("입력 : ");
		/*
		 * System.in.read();
		 * 단일 문자 입력 : 메소드 한번에 한 문자 입력
		 * 
		 * 입력후 결과 반환, 반환자료형은 int
		 * 
		 */
		int data  = 0;
		while (true) {
			data = System.in.read();
			System.out.println("입력 데이터 : " + data);
			System.out.println("입력 데이터 : " + (char)data);
			
		}

	}
}

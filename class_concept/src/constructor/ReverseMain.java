package constructor;

import java.util.Scanner;

public class ReverseMain {
	public static void main(String[] args) {
		/*
		 * 정수를 한 개 입력받은 후 입력받은 정수를 거꾸로 정수에 담아 출력
		 * Reverse 클래스
		 * int data, result
		 * getter, setter, 생성자
		 */
		
		Scanner sc = new Scanner(System.in);
		Reverse reverse = new Reverse();
		System.out.print("정수 입력 : ");
		reverse.setData(sc.nextInt());
		System.out.println(reverse.getData() + "의 거꾸로된 정수는 " + reverse.getResult());
		
		System.out.print("\n정수 입력 : ");
		Reverse reverse2 = new Reverse(sc.nextInt());
		System.out.println(reverse2.getData() + "의 거꾸로된 정수는 " + reverse2.getResult());
	}
}

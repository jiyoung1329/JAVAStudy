package input;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name1 = sc.nextLine();

		System.out.print("이름 입력 : ");
		String name2 = sc.next();
		
		sc.nextLine(); // 버퍼 삭제
		System.out.print("이름 입력 : ");
		String name3 = sc.nextLine();
		
		System.out.println("이름 : " + name1);
		System.out.println("이름 : " + name2);
		System.out.println("이름 : " + name3);
	}
}

package loop;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 소수 찾기
		System.out.print("숫자를 입력하세요. : ");
		int num = sc.nextInt();
		boolean check; 
		System.out.println("2에서 " + num + "까지의 소수는 다음과 같습니다.");
		for (int i = 2; i <= num; i++) {
			check = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check = false;
					break;
				}
			}
			if (check)
				System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		// 3x + 2y = 10의 해를 구하기
		check = false;
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (3 * x + 2 * y == 10) {
					check = true;
					System.out.println("3x + 2y = 10의 해는 x = " + x + ", y = " + y + "입니다.");
					break;
				}
			}
			if (check)
				break;
		}

	}
}

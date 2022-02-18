package array;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int plus = 3, LEN = 0, preLEN = 0;
		int[] arr = new int[LEN];
		int[] tmp; // 이전 배열 저장하는 임시 배열

		int i = 0, num;
		boolean check = false;
		while (true) {

			// 배열 사이즈업
			if (i == LEN) {
				// 이전 배열 임시 저장
				tmp = new int[LEN];
				tmp = arr;

				// 배열 사이즈업
				preLEN = LEN;
				LEN += plus;
				arr = new int[LEN];
				System.out.println("증가됨(" + LEN + ")");

				// 사이즈 증가된 배열에 이전 데이터 다시 저장
				for (int j = 0; j < preLEN; j++) {
					arr[j] = tmp[j];
				}
			}

			// 데이터 입력 받기 & 중복 확인
			try {
				System.out.print("입력(현재 길이 : " + LEN + ") : ");
				num = sc.nextInt();

				// 중복확인
				check = false;
				for (int j = 0; j <= i; j++) {
					if (num == arr[j]) {
						System.out.println("중복된 숫자입니다.");
						check = true;
						break;
					}
				}
				if (check)
					continue;

				// 중복되지 않았으면 배열에 저장
				arr[i] = num;
				i++;

			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
				sc.nextLine();
				continue;
			}

			// 배열 프린트
			for (int j = 0; j < i; j++) {
				System.out.print(arr[j] + ", ");
			}
			System.out.println();

		}
	}

}

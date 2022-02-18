package array;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int LEN = 3;
		int[] arr = new int[LEN];
		int[] tmp; // 이전 배열 저장하는 임시 배열
		
		int i=0;
		while(true) {
			// 데이터 입력 받기
			try {
				System.out.print("입력(현재 길이 : " + LEN + ") : ");
				arr[i] = sc.nextInt();
				i++;
				
			} catch(Exception e) {
				System.out.println("숫자를 입력하세요.");
				sc.nextLine();
				continue;
			}

			// 배열 프린트
			for (int j = 0; j < i; j++) {
				System.out.print(arr[j] + ", ");
			}
			System.out.println();

			// 배열 사이즈업
			if (i % 3 == 0) {
				// 이전 배열 임시 저장
				tmp = new int[LEN];
				tmp = arr;
				
				// 배열 사이즈업
				LEN += 3;
				arr = new int[LEN];
				System.out.println("증가됨(" + LEN + ")");

				// 사이즈 증가된 배열에 이전 데이터 다시 저장
				for (int j = 0; j < LEN - 3; j++) {
					arr[j] = tmp[j];
				}
			}

		}

	}
}

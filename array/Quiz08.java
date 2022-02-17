package array;

import java.util.Random;

public class Quiz08 {
	public static void main(String[] args) {
		Random r = new Random();
		boolean[] check = new boolean[46];
		int[] lotto = new int[6];

		int num;
		for (int i = 0; i < 6; i++) {
			// 중복 체크
			while (true) {
				num = r.nextInt(45) + 1;
				if (!check[num]) {
					check[num] = true;
					break;
				}
			}

			lotto[i] = num;
		}

		// 로또 번호 오름차순으로 정렬
		int tmp;
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (lotto[j] < lotto[i]) {
					tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}

		System.out.print("번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}

	}
}

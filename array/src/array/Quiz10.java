package array;

import java.util.Random;

public class Quiz10 {
	public static void main(String[] args) {
		Random r = new Random();
		int[][] arr = new int[5][6];
		
		int tmp;
		for (int i=0; i<5; i++) {
			boolean[] check = new boolean[46];
			// 입력 받기
			for (int j=0; j<6; j++) {
				while(true) {
					arr[i][j] = r.nextInt(45)+1;
					if (!check[arr[i][j]]) {
						check[arr[i][j]] = true;
						break;
					}
				}
			}
			
			// 정렬 하기
			for (int j=0; j<5; j++) {
				for (int k=j+1; k<6; k++) {
					if (arr[i][k] < arr[i][j]) {
						tmp = arr[i][j];
						arr[i][j] = arr[i][k];
						arr[i][k] = tmp;
					}
				}
			}
		}
		
		// 출력하기
		for(int i=0; i<5; i++) {
			for (int j=0; j<6; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}

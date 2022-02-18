package array;

import java.util.Random;

public class Quiz09 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int[][] numArr = new int[5][5];
		char[][] charArr = new char[5][5];
		
		// 0-9 범위
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				numArr[i][j] = r.nextInt(10);
			}
		}
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(numArr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		// a-z 범위
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				charArr[i][j] = (char) (r.nextInt(26) + 97);
			}
		}
		
		System.out.println();
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(charArr[i][j] + "\t");
			}
			System.out.println();
		}
	}	
}

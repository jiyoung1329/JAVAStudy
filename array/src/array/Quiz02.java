package array;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] st = new int[4];
		String[] name = new String[] {"국어", "영어", "수학"};
		int score = 0;
		for (int i=0; i<st.length-1; i++) {
			// 점수 입력받기
			do {
				try {
					System.out.print(name[i] + "점수(0이상 100이하) : ");
					score = sc.nextInt();
					
				} catch (Exception e) {
					System.out.println("숫자를 입력하세요.");
					sc.nextLine();
					continue;
				}
				
			}while (score > 100 || score < 0);
			
			st[i] = score;
			st[st.length-1] += score;
		}
		
		
		System.out.println("총점 : " + st[3]);
		System.out.println("평균 : " + ((float) st[3]/(st.length-1)));
		
	}
}

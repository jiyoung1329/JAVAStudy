package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		// UP & Down 게임 
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int menu, per, com, ans;
		int comStart = 1, comEnd = 100;
		// 점수 관련 
		int perScore = 0, total = 0;
		
		System.out.println(">>>>> UP & DOWN 게임 <<<<<");
		while(true) {
			System.out.println("======= 메뉴 ======="); 
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. Game Exit");
			System.out.println("===================");
			
			// 입력 받기
			try { 
				System.out.print("메뉴 선택 >> ");
				menu = sc.nextInt();
				
			} catch(Exception e) {
				System.out.println("숫자를 입력해주세요.");
				sc.nextLine();
				continue;
			}
			
			switch(menu) {
			case 1:
				// 게임 횟수 체크
				total ++;
				
				// 정답(랜덤값 0~100)
				ans = r.nextInt(100) + 1;
				per = -1; com = -1;
				System.out.println("ans = " + ans);
				while (true) {
					// 사용자 입력 
					try {
						System.out.println("--------------------------");
						System.out.println("<< Player Turn >>");
						System.out.println("1 ~ 100 사이의 숫자를 입력하세요. ");
						System.out.println("--------------------------");
						System.out.print("사용자 입력 >> ");
						per = sc.nextInt();
						System.out.println("--------------------------");
						
					} catch(Exception e) {
						System.out.println("숫자를 입력하세요. ");
						sc.nextLine();
						continue;
					}
					// 사용자 - ans와 비교
					if (per > ans) {
						System.out.println("결과 >> DOWN!!");
						comEnd = per-1;
						
					} else if (per < ans) {
						System.out.println("결과 >> UP!!");
						comStart = per+1;
					}else {
						System.out.println("사용자가 정답을 맞췄습니다!!");
						perScore ++;
						break;
					}
					System.out.println(comStart + " " + comEnd);

					// 컴퓨터 난수 발생
					com = r.nextInt(comEnd - comStart + 1) + comStart;
					
					System.out.println("--------------------------");
					System.out.println("<< Computer Turn >>");
					System.out.println("1 ~ 100 사이의 숫자를 입력하세요. ");
					System.out.println("--------------------------");
					System.out.println("컴퓨터 입력 >> "+com);
					System.out.println("--------------------------");
					
					// 컴퓨터 - ans 비교
					if (com > ans) {
						System.out.println("결과 >> DOWN!!");
						comEnd = com-1;
						
					} else if (com < ans) {
						System.out.println("결과 >> UP!!");
						comStart = com+1;
					} else {
						System.out.println("컴퓨터가 정답을 맞췄습니다!!");
						break;
					}
					System.out.println(comStart + " " + comEnd);
					
				}
				
				continue;
				
			case 2:
				System.out.println("사용자 : " + perScore + "승 " + (total - perScore) + "패");
				System.out.println("컴퓨터 : " + (total - perScore) + "승 " + perScore + "패");
				continue;
				
			case 3:
				System.out.println("게임을 종료합니다.");
				break;
				
			default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				
			}
			
		}
		
	}
}

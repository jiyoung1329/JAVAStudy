package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		
		// UP & Donw 게임 
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		String user;
		int menu, per, ans;
		int cnt = 0, minCnt = 9999999;
		System.out.println(">>>>>> Up & Down 게임 <<<<<");
		while (true) {
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
			
			if (menu == 1) {
				// 정답(랜덤값 0~100)
				ans = r.nextInt(100) + 1;
				per = -1;
				while (per != ans) {
					
					cnt++;
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
					
					// ans와 비교
					if (per > ans) {
						System.out.println("결과 >> DOWN!!");
						continue;
						
					} else if (per < ans) {
						System.out.println("결과 >> UP!!");
						continue;
					}
					
				}
				System.out.println("축하합니다!! 당신은 " + cnt +"번 만에 정답을 맞췄습니다.");
				// 최고점수 비교
				if (cnt < minCnt) minCnt = cnt;

				
			} else if (menu == 2) {
				System.out.println("현재 최고 기록은 : " + minCnt + "번 입니다.");
				
			} else if (menu == 3){
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
			
		}
	
		
		
	}
}


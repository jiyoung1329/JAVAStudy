package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r= new Random();
		
		String user = "";
		char res;
		int menu, money = 10000;
		int myDice, comDice;
		
		while (true) {
//			menu();
			// 메뉴 보여주기 
			System.out.println("=== Dice Game ===");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.println("==================");
			
			// 메뉴 입력받기
			try {
				System.out.print("메뉴 입력 >> ");
				menu = sc.nextInt();
			} catch(Exception e) {
				System.out.println("숫자를 입력해주세요.");
				sc.nextLine();
				continue;
			}
			
			if (menu > 3) {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
			else if (menu == 3) break;
			else if (menu == 2) {
				System.out.println("=== Game Score ===");
				System.out.println(user + "님이 현재 보유하고 계시는 금액은 " + money + "원 입니다.");
			} else {
				// 돈을 모두 잃었을때
				if (money <= 0) {
					while (true) {
						System.out.print("배팅 금액을 모두 잃었습니다. 새로운 게임을 시작하겠습니까? (y/n) : ");
						res = sc.next().charAt(0);
						if (res == 'y' || res == 'n') break;
						else System.out.println("잘못입력하였습니다. 다시 입력해주세요. ");
					}
					
					if (res == 'y') {
						money = 10000;
						user = "";
					}
				} 
				
				// 돈이 있을때
				if (money > 0) {
					
					// 유저 네임 세팅
					if (user == "") {
						System.out.print("새 유저의 이름을 작성해 주세요. : ");
						user = sc.next();
						sc.nextLine();
					}
					while (true) {
						System.out.println("배팅 금액 : " + money);
						System.out.println("주사위를 돌리겠습니다.");
						
						// 주사위 굴리기(사용자)
						myDice = 0;
						for (int i=1; i<=3; i++) {
							int dice = r.nextInt(6) + 1;
							System.out.println(i+"번째 주사위 : " + dice);
							myDice += dice;
						}
						System.out.println("당신의 주사위 총 합 : " + myDice);
						
						// 배팅하기
						int batting = money;
						while (true) {
							try {
								System.out.println("배팅 금액을 정해주세요 : ");
								batting = sc.nextInt();
								if (batting > money) {
									System.out.println("배팅 금액이 너무 많습니다. 다시 입력해주세요.");
								} else if (batting < 0){
									System.out.println("배팅금액은 0원 이상 가능합니다.");
								} else break;
							} catch (Exception e) {
								System.out.println("숫자를 입력해주세요.");
								sc.nextLine();
							}
						}
						
						// 컴퓨터 주사위 합 구하기
						comDice = 0;
						for (int i=1; i<=3; i++) comDice += r.nextInt(6)+1;
						
						// 결과 계산 & 보여주기
						System.out.println("=== 결과 ===");
						System.out.println("당신의 눈 : " + myDice);
						System.out.println("상대의 눈 : " + comDice);
						
						if (myDice > comDice) {
							System.out.println("이겼습니다. " + batting + "원을 얻었습니다.");
							money += batting;

						} else if (myDice < comDice) {
							System.out.println("졌습니다. " + batting + "원을 잃었습니다.");
							money -= batting;
							
						} else {
							System.out.println("무승부입니다.");
						} 
						
						// 돈없으면 강제종료
						if (money <= 0) {
							System.out.println("배팅 금액을 모두 잃었습니다. 종료합니다.");
							break;
						}
						
						// 게임 진행여부 확인
						
						while (true) {
							System.out.print("게임을 계속하시겠습니까? (y/n) : ");
							res = sc.next().charAt(0);
							if (res == 'y' || res == 'n') break;
							else System.out.println("잘못 입력하였습니다. 다시 입력해주세요. ");
						}

						if (res == 'n') break;
						
					}
				}
			}
			
			
			
		}
		
	}
	
}

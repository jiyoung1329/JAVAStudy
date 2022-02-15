package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		int input = 0;
		int ans;
		int anscnt = 0;
		
		System.out.println("동전 맞추기 게임입니다. 아레 메뉴에서 선택해 주세요.");
		while (input != 3) {
			System.out.println("-------- Menu --------");
			System.out.println("1. 앞면, 2. 뒷면, 3. 종료");
			System.out.println("----------------------");
			System.out.print("입력 번호 : " );
			input = sc.nextInt();
			ans = r.nextInt(2) + 1;
			
			if (input == 3) {
				System.out.println("프로그램을 종료합니다. ");
				break;
			} else if (input == ans) {
				anscnt ++;
				System.out.println("맞췄습니다!! 맞힌 개수 : " + anscnt);
			} else if (input > 3){
				System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
			} else {
				System.out.println("떙 틀렸습니다! 다시 입력해주세요.");
			}
		}
		
		
		

		
	}
}

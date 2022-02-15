package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] arg) {
		// 가위바위보 게임
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int per, com;
		
		System.out.println(">>>>>>>>>>>> 가위바위보 게임!! <<<<<<<<<<<<");
		System.out.print("사용자 이름을 적어주세요 : ");
		String user = sc.next();

		while (true) {
			System.out.println("----------------------------------");
			System.out.println("아래 번호 중 하나를 선택하세요!!");
			System.out.println("1. 가위 / 2. 바위 / 3. 보 / 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("입력 >> "); 
			try {
				per = sc.nextInt();
				
			} catch(Exception e) {
				System.out.println("숫자를 입력하세요");
				sc.nextLine();
				continue;
			}
			com = r.nextInt(3) + 1;
			
			System.out.println("----------------------------------");
			if (per == 1) {
				if (com == 1) {
					System.out.println(user + " : 가위, 컴퓨터 : 가위");
					System.out.println("결과 : "+ user +"와 컴퓨터가 비겼습니다.");
					
				} else if (com == 2) {
					System.out.println(user + " : 가위, 컴퓨터 : 바위");
					System.out.println("결과 : "+ user +"님 아쉽네요. 컴퓨터가 이겼어요.. ");
					
				} else {
					System.out.println(user + " : 가위, 컴퓨터 : 보");
					System.out.println("결과 : 축하드립니다. "+ user +"님께서 이겼어요!! ");
				}
				
				
			} else if (per == 2) {
				if (com == 1) {
					System.out.println(user + " : 바위, 컴퓨터 : 가위");
					System.out.println("결과 : 축하드립니다. "+ user +"님께서 이겼어요!! ");

				} else if (com == 2) {
					System.out.println(user + " : 바위, 컴퓨터 : 바위");
					System.out.println("결과 : "+ user +"와 컴퓨터가 비겼습니다.");

				} else {
					System.out.println(user + " : 바위, 컴퓨터 : 보");
					System.out.println("결과 : "+ user +"님 아쉽네요. 컴퓨터가 이겼어요.. ");

				}
			
				
			} else if (per == 3) {
				if (com == 1) {
					System.out.println(user + " : 보, 컴퓨터 : 가위");
					System.out.println("결과 : "+ user +"님 아쉽네요. 컴퓨터가 이겼어요.. ");

				} else if (com == 2) {
					System.out.println(user + " : 보, 컴퓨터 : 바위");
					System.out.println("결과 : 축하드립니다. "+ user +"님께서 이겼어요!! ");

				} else {
					System.out.println(user + " : 보, 컴퓨터 : 보");
					System.out.println("결과 : "+ user +"와 컴퓨터가 비겼습니다.");

				}
			} else if (per == 4) {
				System.out.println("가위바위보 게임을 종료합니다.");
				break;
			} else {
				System.out.println("잘못입력하셨어요! 다시입력해주세요~~ ");
			}				
			
			
		}
		
	}
}

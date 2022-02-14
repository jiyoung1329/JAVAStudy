package loop;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 영문자 'q'가 입력될 때까지 반복
		char ch = ' ';
		String str;
		while(true) {
			System.out.print("영문자 하나를 입력하세요. ");
			str = sc.next();
			
			// 하나의 문자를 입력하였는지 확인
			if (str.length() > 1) {
				System.out.println("하나 이상의 문자를 입력하였습니다. 다시입력해주세요. ");
				continue;
			} 
			
			// 캐릭터 확인
			ch = str.charAt(0);
			if (ch == 'q') break;
			else System.out.println("잘못 입력하였습니다.");
			
		}
		
		
		// 입력된 수의 각 자리수의 합을 구하는 프로그램
		System.out.println("\n입력된 수의 각 자리수의 합을 구하는 프로그램입니다.");
		
		System.out.print("숫자를 입력하세요. : ");
		int num = sc.nextInt();
		int sum = 0, tmp = num;
		while (tmp > 0) {
			sum += (tmp % 10);
			tmp /=10;
		}
		System.out.println(num + "의 각 자리수의 합은 " + sum + "입니다.");
		
		
		// 입력된 수를 거꾸로 정수형 변수에 담아 출력(123 > 321)
		System.out.println("\n입력된 수를 거꾸로 변환시켜주는 프로그램입니다.");
		System.out.print("숫자를 입력하세요. : ");
		num = sc.nextInt();
		int rev = 0;
		
		// 숫자 위치 reverse
		tmp = num;
		while (tmp > 0) {
			rev += (tmp % 10);
			tmp /= 10;
			rev *= 10;
		}
		
		System.out.println(num + "를(을) 거꾸로 변환시키면 " + (rev/10) + "입니다.");

	}
}


package loop;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 두 수의 최대공약수 구하기
		int min = sc.nextInt();
		int max = sc.nextInt();
		if (min > max) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		
		int GCD = min;
		for (int i=min; i>=1; i--) {
			if (max % i == 0 && min % i == 0) {
				GCD = i;
				break;
			}
		}
		System.out.println(min+"과 "+max+"의 최대공약수는 " + GCD + "입니다.");
		
				
		// 1~1000 자연수에서 개개의 수가 서로 연속적으로 되어있는 수를 찾아 출력
		int maxNum = 10000;
		boolean check = true;
		int checkNum = 0, tmp = 0;
		for (int i=10; i<maxNum; i++) {
			check = true;
			checkNum = i % 10;
			tmp = i;
			while (true) {
				tmp /= 10;
				if (tmp == 0) break;
				if ((tmp % 10) != checkNum) {
					check = false;
					break;
				}
			}
			if (check) {
				if (i == maxNum-1) System.out.println(i);
				else System.out.print(i + ", ");
			}
		}
		
			
	}
}

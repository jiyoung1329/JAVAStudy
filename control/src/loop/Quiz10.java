package loop;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 369 게임
		int N = sc.nextInt();
		
		int cnt = 0, tmp, n;
		for (int num=1; num<=N; num++) {
			
			tmp = num;
			while (tmp > 0) {
				
				n = tmp % 10;
				if (n == 3 || n == 6 || n==9) {
					cnt ++;
				}
				
				tmp /= 10;
			}
			
		}
		
		System.out.println(cnt);
		
		
	}
}
 
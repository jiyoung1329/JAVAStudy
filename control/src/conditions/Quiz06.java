package conditions;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 커피 가격 계산, 10개 이하 : 2000원, 10개 초과시 초과분에 대해서는 1500원
		System.out.print("구매할 커피의 개수를 입력하세요. : ");
		int cnt = sc.nextInt();
		int sum;
		if (cnt < 10) {
			sum = cnt * 2000; 
		} else {
			sum = 20000 + (cnt - 10) * 1500;
		}
		System.out.println("커피의 총 가격은 " + sum + "원 입니다.");
		
		
		// 과자 가격 계산
		// 1~9개 : 1000원, 10개 ~ 99개 : 전체의 10%할인, 100개 이상 : 전체의 12% 할인
		System.out.print("구매할 과자의 개수를 입력하세요. : ");
		cnt = sc.nextInt();
		sum = cnt * 1000;
		if (10 <= cnt && cnt < 99) {
			sum *= 0.9;
		} else if (cnt >= 100){
			sum *= 0.88;
			
		}
		System.out.println("과자의 총 가격은 " + sum + "원 입니다.");
	
		
		
		
		
	}
}

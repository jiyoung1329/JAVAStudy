package loop;

import java.util.Scanner;
 
public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//두 수를 입력받아 작은수 ~ 큰 수의 합계 출력
		System.out.print("1. 두 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int max, min, sum = 0;
		
		if (num1 < num2)  {max = num2; min = num1;}
		else {max = num1; min = num2;}
		
		for (int i=min; i<=max; i++){
			sum += i;
		}
		
		System.out.println(min + " ~ " + max + "까지의 합은 " + sum + "입니다.");
				
		
		
		// 수를 입력받아 소수인지 아닌지 판별해서 출력하기
		System.out.print("2. 숫자를 입력하세요. : ");
		num1 = sc.nextInt();
		boolean IsPN = true;
		for (int i=2; i<num1; i++) {
			if (num1 % i == 0) {
				IsPN = false;
				break;
			}
		}
		if (IsPN) System.out.println(num1 + "은(는) 소수입니다.");
		else System.out.println(num1 + "은(는) 소수가 아닙니다.");
	}
}

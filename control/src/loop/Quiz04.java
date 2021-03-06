package loop;

import java.math.BigInteger;

public class Quiz04 {
	public static void main(String[] args) {
		
		int i;
		// 1. 1에서 1000까지 자연수중에 4, 6으로 나누어도 나머지가 1인 수의 합 출력
		int sum = 0;
		for (i=1; i<=1000; i++) {
			if (i % 4 == 1 && i % 6 == 1) {
				sum += i;
			}
		}
		System.out.println("1~1000의 자연수 중, 4 또는 6으로 나눴을때 나머지가 1인 수의 합은 " + sum + "입니다.");
		
		
		// 2. 첫날에 1원 저축하고, 다음날에는 전날의 두배씩 증가, 30일동안 저축한 금액
		int money = 0;
		int seed = 1;
		for (int day=0; day<30; day++) {
			money += seed;
			seed *= 2;
		}
		System.out.println("총 저축금액은 " + money + "입니다.");
		
		
		// 3. 첫 사각형에 밀알 1개, 2번쨰 사각형은 밀알 2개... 64칸에 밀알을 2배씩 채워줄떄
		//  필요한 밀알의 총 개수
		BigInteger kong = BigInteger.valueOf(0);
		BigInteger can = BigInteger.valueOf(1);
		for (i =0; i<64; i++) {
			kong = kong.add(can);
			can = can.multiply(BigInteger.valueOf(2));
		}
		System.out.println("총 밀알의 개수는 " + kong + "입니다.");
		
	}
}

package Method;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * 두 수를 입력받아 큰수 판별(Max.java)
		 * 두 수를 입력받아 소수 판별(Prime.java)
		 */
		
		Scanner sc = new Scanner(System.in);
		Max max = new Max();
		Prime prime = new Prime();
		
		max.setNum1(sc.nextInt());
		max.setNum2(sc.nextInt());
		System.out.println("둘 중 더 큰 수는 " + max.getMax() + "입니다.");

		prime.setNum(sc.nextInt());
		if (prime.isPrime()) System.out.println(prime.getNum() + "은 소수입니다.");
		else  System.out.println(prime.getNum() + "은 소수가 아닙니다.");
	}
	
}

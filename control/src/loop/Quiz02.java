package loop;

public class Quiz02 {
	public static void main(String[] args) {

		int i, sum = 0;
		for (i = 1; i <= 1000; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0)
					sum += i;
			} else
				sum += i;
		}
		System.out.println("1 ~ 1000까지의 합은(3의 배수 제외, 15의 배수 포함) " + sum + "입니다.");

		sum = 0;
		for (i = 1; sum < 10000; i += 2) {
			
			sum += i;
//			System.out.println(i + " " + sum);
		}
		i -= 2;

		
		
		System.out.println("1 ~ " + i + "까지의 홀수의 합이 10000을 넘지 않습니다. 그 합은 " + sum + "입니다.");
		
		i = 1; sum = 0;
		while (sum < 10000) {
			sum += i;
			System.out.println(i + " " + sum);
			i += 2;
			
		} i -= 2;
		System.out.println("1 ~ " + i + "까지의 홀수의 합이 10000을 넘지 않습니다. 그 합은 " + sum + "입니다.");

	}
}

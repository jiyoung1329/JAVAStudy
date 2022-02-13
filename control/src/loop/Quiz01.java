package loop;

public class Quiz01 {
	public static void main(String[] args) {
		int i;
		// hello 네번 출력하기 
		for (i = 1; i <= 4; i++) {
			System.out.println(i+". hello");
		}
		System.out.println();
		
		// 1~100까지 합 중에서 합이 528일때 i 값 출력
		int sum = 0;
		int checkNum = 528;
		for (i=1;i<=100; i++) {
			sum += i;
			if (sum == checkNum) {
				System.out.println("1 ~ " + i + "까지의 합이 "+checkNum+" 입니다.");
				break;
			}
		}
		System.out.println();
		
		// for을 활용하여 1~25까지 출력
		for (i = 1; i<=25; i++) {
			System.out.print(i+"\t");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}
}

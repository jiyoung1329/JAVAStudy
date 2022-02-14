package loop;

public class Quiz07 {
	public static void main(String[] args) {
		// 세자리 수 중 1, 2, 3으로 구성된 수들을 오름차순 나열했을때 14번째 위치한 수 출력
		System.out.print("1, 2, 3으로 구성된 수들을 오름차순으로 나열 했을때, 14번째 위치한 수 : ");
		
		int ans = 0, cnt = 0;
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=3; j++) {
				for (int k=1; k<=3; k++) {
					cnt ++;
					ans = i * 100 + j * 10 + k;
					if (cnt == 14) break;
				}
				if (cnt == 14) break;
			}
			if (cnt == 14) break;
			
		}
		System.out.print(ans + "\n");
		
		
		// 1~1000까지의 자연수 중 완전수 구하기
		// 완전수 : 자기자신을 제외한 약수의 합이 자신과 같아지는 수
		System.out.print("1 ~ 1000까지의 자연수 중 완전수는 : ");
		
		int sum;
		for (int num=2; num<=1000; num++) {
			sum = 0;
			for (int i=1; i<num; i++) {
				if (num % i == 0) sum += i; 
			}
			if (sum == num) System.out.print(num + " ");
		}
	
	}

}

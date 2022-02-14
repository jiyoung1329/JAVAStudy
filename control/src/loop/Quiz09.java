package loop;

public class Quiz09 {
	public static void main(String[] args) {
		// 문제 1
		// 쌀 102통(1통 = 1키로)이 저장되어있는 창고에 암수 1쌍의 쥐가 있다.
		// 쥐 1마리가 하루에 20g씩의 쌀을 먹고 10일(10, 20, 30..)마다 쥐의 수가 2배씩 증가한다
		// 며칠만에 창고의 쌀이 모두 쥐의 먹이가 될까. 그리고 쥐는 총 몇마리인가?
		
		int ssal = 102 * 1000;
		int mouse = 2;
		int day = 0;
		while (ssal > 0) {
			day ++;
			
			// 10일 마다 쥐의 수는 2배
			if (day % 10 == 0) mouse *= 2;
			
			// 하루에 쥐는 20g씩의 쌀을 먹는다.
			ssal -= (mouse * 20);
			
//			System.out.println("Day : " + day+ ", 현재 쥐는 총 " + mouse + "마리이며 쌀은 " + ssal +"g 남았습니다.");
		}
		System.out.println(day+ "일차에, " + mouse + "마리의 쥐가 창고의 쌀을 모두 먹었습니다.");
	
		
		
		// 문제 2
		// 1*2 - 2*3 + 3*4 - 4*5 .... 규칙으로 합계를 구할 때
		// 합이 100이 넘는 마지막 수 2개를 구하는 프로그램을 작성하여라
		int sum = 0;
		int num = 0;
		while(sum < 100) {
			
			num ++;
			
			if (num % 2 == 0) {
				sum -= (num * (num+1));
			} else {
				sum += (num * (num+1));
			}
			
//			System.out.println(num + "*" + (num+1) + "->" + sum);
		}
		System.out.println("수학 규칙에 따라 합이 100이 넘는 마지막 수 2개는 " + num +"과 " + (num+1) + "입니다.");
	}
}

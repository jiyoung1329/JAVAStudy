package array;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		// -1 : mix / 0 : ascending / 1 : decending
		int check = 0;
		
		System.out.print("입력 : ");
		
		// 입력 받기
		for (int i=0; i<5; i++) arr[i] = input(sc);
		
		// 오름차순 내림차순 확인
		for (int i=1; i<5; i++) {
			// 오름차순
			if (arr[i] > arr[i-1]) check++;
			// 내림차순
			else if (arr[i] < arr[i-1]) check --;
		}

		// 출력하기
		if (check == 4) System.out.println("출력 : ascending");
		else if (check == -4) System.out.println("출력 : descending");
		else System.out.println("출력 : mixed");
		
	}
	public static int input(Scanner sc) {
		int in=0;
		
		while(true) {
			try {
				in = sc.nextInt();
				break;
			}catch (Exception e){  
				System.out.println("숫자를 입력하세요.");
				sc.nextLine();
			}
		}
		
		return in;
	}
	
}

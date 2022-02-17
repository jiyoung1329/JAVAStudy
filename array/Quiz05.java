package array;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 배열 길이값 입력 받기
		System.out.print("생성할 배열의 길이를 입력 >> ");
		int len = sc.nextInt();
		
		// 배열 생성
		int[] arr = new int[len];
		System.out.println(len + "개의 배열이 생성되었습니다.");
		
		// 배열 데이터 입력 받기
		System.out.println("데이터를 입력하세요.");
		for(int i=0; i<len; i++) {
			System.out.print((i+1) + "번째 데이터 : ");
			arr[i] = sc.nextInt();
		}
		
		// 출력하기
		System.out.print("배열 데이터 : ");
		for (int i=0; i<len; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("입니다.");
		
		
	}
}

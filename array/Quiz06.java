package array;

import java.util.Scanner;

public class Quiz06 {
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
		System.out.print("입력받은 배열 데이터 : ");
		for (int i=0; i<len; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("입니다.");
		
		// 정렬하기
		int tmp;
		for (int i=0; i< len-1; i++) {
			for (int j=i+1; j<len; j++) {
				if (arr[j] <arr[i]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// 출력하기
		System.out.print("정렬된 배열 데이터 : ");
		for (int i=0; i<len; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("입니다.");
	}
}

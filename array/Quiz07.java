package array;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int LEN = 5;
		
		String[] names = new String[LEN];
		int[] ages = new int[LEN]; 
		for (int i=0; i<LEN; i++) {
			System.out.println((i+1)+"번째 정보 입력");
			System.out.print("이름 : ");
			names[i] = sc.next();
			System.out.print("나이 : ");
			ages[i] = sc.nextInt();
		}
		
		for (int i=0; i<LEN; i++) {
			System.out.println((i+1) + "정보");
			System.out.println("이름 : " + names[i] + ", 나이 : "+ ages[i] +"세");
		}
		
		String tmpName;
		int tmpAge;
		for (int i=0; i<LEN-1; i++) {
			for (int j=i+1; j<LEN; j++) {
				if (ages[j] < ages[i]) {
					tmpName = names[i];
					names[i] = names[j];
					names[j] = tmpName;
					
					tmpAge = ages[i];
					ages[i] = ages[j];
					ages[j] = tmpAge;
				}
			}
		}
		
		System.out.println("\n정렬 후 : ");
		for (int i=0; i<LEN; i++) {
			System.out.println((i+1) + "정보");
			System.out.println("이름 : " + names[i] + ", 나이 : "+ ages[i] +"세");
		}
		
	}
}

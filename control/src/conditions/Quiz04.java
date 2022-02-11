package conditions;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 학접 입력 받아 구분하여 문자열 출력
		System.out.print("학점을 입력해 주세요(A-E). : ");
		String grade = sc.next();
		System.out.print("학점 : " + grade);
		if (grade.equals("A") || grade.equals("B")) {
			System.out.println(", 결과 : 참 잘했어요!");
		} else if (grade.equals("C") || grade.equals("D")) {
			System.out.println(", 결과 : 분발합시다.");
			
		} else if (grade.equals("E") || grade.equals("F")){
			System.out.println();
			
		} else {
			System.out.println(", 잘못입력하였습니다.");
		}
		
		// 년도를 입력받아 윤년 펴연 판별해주는 프로그램 작성
		System.out.print("년도를 입력해주세요. : ");
		int year = sc.nextInt();
		String res;
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					res = "윤년";
				} else {
					res = "평년";
				}
			} else {
				res = "윤년";
			}
		} else {
			res = "평년";
		}
		System.out.println("연도 : " + year + ", " + res + "입니다.");
	}
}

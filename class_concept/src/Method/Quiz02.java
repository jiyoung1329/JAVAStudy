package Method;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		 * 절대값 구하기
		 * 점수 입력받아 A~F학점 출력
		 * (A : 90점 이상, B : 80점 이상, C : 70점이상, D: 60점 이상, F: 그 이하)
		 */
		
		Scanner sc = new Scanner(System.in);
		Absolute ab = new Absolute();
		Grade grade = new Grade();
		
//		ab.setNum(sc.nextInt());
//		System.out.println(ab.getAbsolute());
		
		grade.setScore(70);
		System.out.println(grade.getScore() + " " + grade.getGrade());
		
	}
}

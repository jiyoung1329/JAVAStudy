package Method;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		/*
		 * Student 클래스 작성
		 * 이름, 국어, 영어, 수학의 정보를 입력받아, 합계와 평균 구하기
		 */
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("이름 : ");
		student.setName(sc.next());
		System.out.print("국어 : ");
		student.setKor(sc.nextInt());
		System.out.print("수학 : ");
		student.setMat(sc.nextInt());
		System.out.print("영어 : ");
		student.setEng(sc.nextInt());
		
		System.out.println("이름 : " + student.getName());
		System.out.println("국어 : " + student.getKor());
		System.out.println("수학 : " + student.getMat());
		System.out.println("영어 : " + student.getEng());
		System.out.println("-----------------------");
		System.out.println("합계 : " + student.getTotal());
		System.out.println("평균 : " + student.getAverage());
		
	}
}

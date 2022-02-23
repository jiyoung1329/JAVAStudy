package Method;

import java.util.Scanner;

public class ThreeMain {
	public static void main(String[] args) {
		// Three 인스턴스로 3의 배수 여부 확인
		Scanner sc = new Scanner(System.in);
		Three three = new Three();
		
		three.setNum(sc.nextInt());
		if (three.result()) System.out.println(three.getNum() + "은 3의 배수입니다.");
		else  System.out.println(three.getNum() + "은 3의 배수가 아닙니다.");
		
	}
}

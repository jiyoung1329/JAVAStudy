package interfaces;

public class AttackMain {
	public static void main(String[] args) {
//		AttackImpl ai01 = new AttackImpl();
//		ai01.attack();
//		ai01.defense();
//		
//		AttackImpl2 ai02 = new AttackImpl2();
//		ai02.attack();
//		ai02.defense();
		
		
		/* 
		 * 인터페이스 
		 *  - 여러 사람과 작업하는 상황에서 메소드 정의
		 *  - 다형성(업캐스팅), 코드의 결합도를 낮출 수 있는 방법.
		 *  - 다중 상속
		 */
		AttackImpl2 att = new AttackImpl2();
		att.attack();
		att.defense();
	
	}
}

package inheritance5;

public class Main {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		
		c1.method01(); // 부모의 멤버 메소드
		c1.method02(); // 부모-자식 멤버 메소드, 자식에서 오버라이드
		c1.method03(); // 자식의 멤버 메소드
		
		System.out.println();
		
		Parent p = new Parent();
		p.method01();
		p.method02();
		
		System.out.println();
		
		// 부모의 기능: 자식 인스턴스의 참조 값을 지정할 수 있음.
		
		// 업캐스팅
		Parent parent1 = (Child1) c1;
		Parent parent2 = (Parent) c1;
		
		parent1.method01();
		parent1.method02();
//		parent.method03(); // 에러 발생
		
		System.out.println();
		
		// 다운캐스팅
		Child1 c11 = (Child1) parent1; // 다운 캐스팅
		c11.method01(); // 부모의 멤버 메소드
		c11.method02(); // 부모 - 자식 멤버 메소드, 자식에서 오버라이드
		c11.method03(); // 자식의 멤버 메소드
		
		Child2 c2 = new Child2();
		
		c2.method01(); // 부모의 멤버 메소드
		c2.method02(); // 부모-자식 멤버 메소드, 자식에서 오버라이드
		c2.method03(); // 자식의 멤버 메소드
		
		System.out.println();
		info(c1);
		info(c2);
		
	}
	
	public static void info(Parent p) {
		System.out.println("==info==");
		p.method01();
		p.method02();
		
		if (p instanceof Child1) {
			Child1 c = (Child1) p;
			c.method03();
		} else if (p instanceof Child2) {
			Child2 c = (Child2) p;
			c.method03();
		}
		
	}

}

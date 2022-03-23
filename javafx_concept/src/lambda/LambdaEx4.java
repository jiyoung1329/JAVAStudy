package lambda;

interface LamInterEx3{
	public void lam();
}

public class LambdaEx4{
	public static void main(String[] args) {
		// 인터페이스의 메소드가 하나일때만 사용 가능
		LamInterEx3 lc = () -> System.out.println("구현"); 
		lc.lam();
		
		lc = () -> {
			System.out.println("람다식을 이용하여");
			System.out.println("인터페이스의 추상메소드의 내용을");
			System.out.println("현위치에서 구현");
		};
		lc.lam();
		
	}
	
}

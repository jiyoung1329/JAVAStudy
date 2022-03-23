package lambda;

interface LamInterEx4{
	public void lam(Object data);
}

public class LambdaEx3{
	public static void main(String[] args) {
		// 인터페이스의 메소드가 하나일때만 사용 가능
		LamInterEx4 lc = (data) -> System.out.println("매개변수 : " + data); 
		lc.lam("10");
		
		// 매개변수가 한개있으면 소괄호없어두 됨
		lc = data -> {
			System.out.println("람다식을 이용하여");
			System.out.println("인터페이스의 추상메소드의 내용을");
			System.out.println("현위치에서 구현");
			System.out.println("매개변수 : " + data);
		};
		lc.lam("ddd");
		
	}
	
}

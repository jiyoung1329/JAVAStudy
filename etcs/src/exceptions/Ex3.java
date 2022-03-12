package exceptions;


public class Ex3 {
	public static void main(String[] args) {
		String arr[] = {"admin", "1234", "관리자"};
		
		try {
			for(int i = 0; i < 4; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("접근 할 수 없는 영역");		
		}
		System.out.println("다음 코드");
	}
}

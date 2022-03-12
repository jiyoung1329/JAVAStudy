package exceptions;

import java.util.Scanner;

public class AuthMain {
	public static void main(String[] args) {
		Auth auth = new Auth();
		auth.start();
	}
		
}

class Auth{
	/*
	 * 인증 프로그램
	 * - 입력 : 901010
	 * - 입력 데이터 검증 : 6자리가 아닐 경우 "여섯자리의 년월일을 입력하세요" 출력하기, LengthException(직접만들기)
	 * - 숫자 데이터 검증 : 숫자 외 다른 문자 포함할 경우 "숫자를 입력하세요" 출력, NumberFormatException(내장)
	 * - 결과 : 입력데이터가 90년 이상일 경우 "90년생 이상입니다.", 90년년 미만일경우 "90년생 미만입니다." 출력
	 */
	private Scanner sc;
	
	private String data;
	private int age;
	
	
	public Auth() {
		sc = new Scanner(System.in);
	}
	
	public void start() {
		age = 0;
		while (true) {
			try {
				System.out.println("여섯자리의 생년월일을 입력하세요.");
				data = sc.nextLine();
				if (data.length() != 6) {
					throw new LengthException();
				}
				age = Integer.parseInt(data.substring(0, 2));
				break;
				
			} catch(NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
				continue;
				
			} catch(LengthException e) {
			}
			
		}
		if (age <= 90) {
			System.out.println("90년생 미만입니다.");
		} else {
			System.out.println("90년생 이상입니다.");
			
		}
		
		
	}
	
}

class LengthException extends RuntimeException{
}

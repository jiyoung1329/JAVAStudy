package basic;

import java.util.HashMap;

public class SubClass {
	private String connect; // 멤버 변수, 멤버 필드
	private HashMap<String, String> map;
	public void test3() {
		System.out.println("test3 method in SubClass");
		
	}
	
	public void con() {
		System.out.println("con 시작");
		System.out.println("데이터 저장소에 연결");
		connect = "연결 정보";
		
	}
	
	public void insert() {
		System.out.println("insert 시작");
		System.out.println(connect);
		System.out.println("데이터 저장");
		
	}
	
	public static void test() {
	}
}

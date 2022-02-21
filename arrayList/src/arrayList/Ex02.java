package arrayList;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		// <> 안에 자료형 적는 것 : 제너릭
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("13");
		list.add("12.3");
		list.add("string");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		for(String s : list) {
			System.out.println(s);
			
		}
		
	}
}

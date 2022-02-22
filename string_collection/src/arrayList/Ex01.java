package arrayList;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(13);
		list.add(12.3);
		list.add("string");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// 값 출력은 단순히 list.get 해도 되는데
		// 다른 변수에 저장할때는 자료형을 지정해야함
		// ArrayLIst에 저장되는 변수들은 다 Object형이기 때문
		int num = (int) list.get(0);
	}
}

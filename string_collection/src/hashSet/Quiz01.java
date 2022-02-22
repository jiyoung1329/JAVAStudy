package hashSet;

import java.util.HashSet;
import java.util.Random;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * HashSet을 이용하여 6개의 난수를 저장하기
		 * 난수범위 : 1~45
		 */
		
		Random r = new Random();
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		for (int i=0; i<6; i++) {
			lotto.add(r.nextInt(45)+1);
		}
		
		System.out.println(lotto.toString());
		
	}
}

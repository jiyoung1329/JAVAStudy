package string_collection;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		/*
		 *  "FF590-2DX83-M81LZ-XDM7E-MKUT4" 문자열에 있는 정수의 합계를 구하기
		 *  ex > 590 + 283 + 81 + 7 + 4
		 */
		str = "FF590-2DX83-M81LZ-XDM7E-MKUT4";
		System.out.println("str1 : " + str);
		String[] strs = str.split("-");
		String num;
		int sum = 0;
		for (int i=0; i<strs.length; i++) {
//			// 정수 유무 확인
//			num = "";
//			for (int j = 0; j<strs[i].length(); j++) {
//				if (Character.isDigit(strs[i].charAt(j))){
//					num += strs[i].charAt(j);
//				}
//			}
//			// 모든 정수의 합 구하기
//			sum += Integer.parseInt(num);
			
			// 정수 아닌 것들은 제외
//			strs[i] = strs[i].replaceAll("[^0-9]", "");
			sum += Integer.parseInt(strs[i].replaceAll("[^0-9]", ""));
		}
		
		
		System.out.println("sum : " + sum + "\n");
		
		// 향상 for
		for (String s : strs) {
			System.out.println(s);
		}
		
		int[] arr = {1, 2, 3, 4};
		for (int i : arr) {
//			System.out.println(i);
		}
		
		
		/*
		 *  OX가 주어졌을때 점수를구하는 프로그램
		 *  OOXXOXXOOO : 1 + 2 + 0 + 0 + 1 + 0 + 0 + 1 + 2 + 3 = 10
		 *  입력 : OOXXOXXOOO
		 *  결과 : 10
		 */
		System.out.print("OX 점수를 입력하세요 : ");
		str = sc.next();
		
		int score = 0;
		int tmpScore = 1;
		boolean isOK = true;
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) =='O') {
				score += tmpScore++;
			} else if (str.charAt(i) == 'X') {
				if (tmpScore > 1) tmpScore = 1;
			} else {
				isOK = false;
				break;
			}
		}
		if (isOK) System.out.println(str + "의 점수는 : " + score + "점 입니다.");
		else System.out.println("잘못된 점수입니다.");
		
		
	}
}

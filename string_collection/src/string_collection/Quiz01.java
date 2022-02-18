package string_collection;

public class Quiz01 {
	public static void main(String[] args) {
		method1();
		method2();
		
	}
	public static void method1() {
		String str;
		
		/*
		 * "Have a nice day Have a nice day Have a nice day" 문자열에서
		 * a의 위치를 저장하여 출력하기 
		 * 결과 : 1, 5, 13, 17, 21, 29, 33, 37, 45
		 */
		str = "Have a nice day Have a nice day Have a nice day";
		System.out.println("String : " + str);
		String result ="";
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == 'a') {
				result += (Integer.toString(i) + ", ");
			}
		}
		result = result.substring(0, result.length()-2);
		System.out.println(result);
		System.out.println();
		
		
		/*
		 * "It is a fun java programming" 문자열에서
		 * 'a'의 개수와 'g'개수와 문자의 총개수(공백 제외)를 출력
		 */
		str = "It is a fun java programming";
		System.out.println("String : " + str);
		str.replace(" ", "");
		
		int aCnt = 0, gCnt = 0, totalCnt = 0;
		for (int i=0; i<str.length(); i++) {
			totalCnt ++;
			if (str.charAt(i) == 'a') aCnt++;
			else if (str.charAt(i) == 'g') gCnt++;
		}
		System.out.println("a의 개수 : " + aCnt + ", g의 개수 : " + gCnt + ", 총 문자 개수 : " + totalCnt) ;
		
	}
	public static void method2() {
		String str;
		
		/*
		 * "Have a nice day Have a nice day Have a nice day" 문자열에서
		 * a의 위치를 저장하여 출력하기 
		 * 결과 : 1, 5, 13, 17, 21, 29, 33, 37, 45
		 */
		str = "Have a nice day Have a nice day Have a nice day";
		System.out.println("String : " + str);
		int idx = 0;
		int[] index = new int[str.length()];
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == 'a') {
				index[idx++] = i;
			}
		}

		for (int i=0; i<idx; i++) {
			if (i == idx-1) System.out.print(index[i]);
			else System.out.print(index[i]+", ");
		}
		System.out.println();
		
		/*
		 * "It is a fun java programming" 문자열에서
		 * 'a'의 개수와 'g'개수와 문자의 총개수(공백 제외)를 출력
		 */
		str = "It is a fun java programming";
		System.out.println("String : " + str);
		str.replace(" ", "");
		
		int aCnt = 0, gCnt = 0, totalCnt = 0;
		for (int i=0; i<str.length(); i++) {
			totalCnt ++;
			if (str.charAt(i) == 'a') aCnt++;
			else if (str.charAt(i) == 'g') gCnt++;
		}
		System.out.println("a의 개수 : " + aCnt + ", g의 개수 : " + gCnt + ", 총 문자 개수 : " + totalCnt) ;
		
	}
}

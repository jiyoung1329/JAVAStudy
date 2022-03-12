package times;

import java.text.SimpleDateFormat;

public class Ex2 {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		String timeFormat = sdf.format(time);
		System.out.println(timeFormat);
	}
}

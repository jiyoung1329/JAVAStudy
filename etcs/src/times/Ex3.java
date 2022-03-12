package times;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex3 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		String timeFormat = sdf.format(date);
		System.out.println(timeFormat);
	}
}

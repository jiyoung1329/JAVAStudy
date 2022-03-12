package times;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex4 {

	public static void main(String[] args) throws InterruptedException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		
		for(int i = 0; i < 10; i++) {
			Date date = new Date();
			String timeFormat = sdf.format(date);
			System.out.println(timeFormat);
			Thread.sleep(1000);
		}
	}
}

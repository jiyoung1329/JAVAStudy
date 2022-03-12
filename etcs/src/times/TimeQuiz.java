package times;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class TimeQuiz {
	private Date date;
	private SimpleDateFormat sdf;

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public SimpleDateFormat getSdf() {
		return sdf;
	}
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}
	
	public void time() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일, aa hh:mm:ss ");
		for (int i=0; i<10; i++) {
			Date date = new Date();
			System.out.println(sdf.format(date));
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
}

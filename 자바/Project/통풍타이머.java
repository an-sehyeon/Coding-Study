package Project;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class 통풍타이머 {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

		int count = 10;	
			@Override
			public void run() {
				if(count > 0) {
					System.out.println(count + "초 후 통풍이 시작됩니다.");
					count--;
				}else {
					System.out.println("지금부터 통풍을 시작합니다.");
					timer.cancel();
				}
			}
		};
		
		Calendar date = Calendar.getInstance();
		
		date.set(2023, 3, Calendar.ALL_STYLES, 18, 36, 50);
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);
		
	}

}

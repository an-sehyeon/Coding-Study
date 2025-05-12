package Project;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class 카운트다운 {
	public static void main(String[] args) {
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			int counter = 10;	//카운트 10
			
			@Override
			public void run() {
				if(counter > 0) {
					System.out.println(counter + "seconds");
					counter--;
				}else {
					System.out.println("HAPPY NEW YEAR!!");
					timer.cancel();	// 타이머 종료
				}
				
			}
		};
		
		Calendar date = Calendar.getInstance();
		
		//지정날짜 
		date.set(Calendar.YEAR, 2023);	//년도
		date.set(Calendar.MONTH, Calendar.APRIL);	// 해당 월
		date.set(Calendar.DAY_OF_MONTH, 7);	// 해당 일

		//지정 시간
		date.set(Calendar.HOUR_OF_DAY, 23); 	//자정0을 지정, 기본적으로(0~24)
		date.set(Calendar.MINUTE, 36);	//0분
		date.set(Calendar.SECOND, 0); 	//0초
		date.set(Calendar.MILLISECOND, 0); 	//밀리초 0초
		
		timer.scheduleAtFixedRate(task, date.getTime(), 1000); 	//지정한 날짜로 1초마다 run() 실행
	}

}

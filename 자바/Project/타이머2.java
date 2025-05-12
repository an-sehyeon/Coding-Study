package Project;

import java.util.Timer;
import java.util.TimerTask;

public class 타이머2 {
	
	public static int count;
	
	
	public static void main(String[] args) {
		count = 0;
		
		Timer m = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				if(count < 5) {
					System.out.println("숫자를 입력하세요");
					count++;
				}else {
					m.cancel();	//타이머 종료
				}
				
			}
		};
		m.schedule(task, 5000, 2000); 	//5초뒤에 2초마다 run메소드 수행
	}

}

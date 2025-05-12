package Project;

/**
 * 타이머 설정
 * Timer클래스는 실제 타이머의 기능을 수행하는 클래스
 * TimerTask클래스는 Timer클래스가 수행되어야 할 내용을 작성하는 클래스 -> run메소드 재정의 해야됨
 * schedule메소드의 역할은 타이머를 작동시키는 메소드
 * 
 * public void schedule(TimerTask task, long delay)
 * =단발성
 * public void schedule(TimerTask task, long delay, long period)
 * =연발성, 반복주기를 입력해줘야됨
 * 
 * -task에는 TimerTask객체를 담아주고, delay는 최초 시작 딜레이를 작성(시작되기전 대기하는 시간)
 */

import java.util.Timer;

import java.util.TimerTask;

public class 타이머1 {
	public static void main(String[] args) {
		
		Timer m = new Timer();
		TimerTask task1 = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("3초 지났습니다.");
			}
		};
		
		m.schedule(task1, 3000);
		
	}

}

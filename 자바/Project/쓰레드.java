package Project;

import java.util.ArrayList;

//public class Sample extends Thread {
//    int seq;
//
//    public Sample(int seq) {
//        this.seq = seq;
//    }
//
//    public void run() {
//        System.out.println(this.seq + " thread start.");  // 쓰레드 시작
//        try {
//            Thread.sleep(5000);  // 1초 대기한다.
//        } catch (Exception e) {
//        }
//        System.out.println(this.seq + " thread end.");  // 쓰레드 종료 
//    }
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {  // 총 10개의 쓰레드를 생성하여 실행한다.
//            Thread t = new Sample(i);
//            t.start();
//        }
//        System.out.println("main end.");  // main 메서드 종료
//    }
//}

public class 쓰레드 extends Thread{
	int seq;
	
	public 쓰레드(int seq) {
		this.seq = seq;
	}
	public void run() {
		System.out.println(this.seq + "thread start");
		try{
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		System.out.println(this.seq + "thread end.");
	}
	public static void main(String args[]) {
		ArrayList<Thread> thread = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			Thread t = new 쓰레드(i);
			t.start();
			thread.add(t);
		}
		
		for(int i = 0; i < thread.size(); i++) {
			Thread t = thread.get(i);
			try {
				t.join();		//t쓰레드가 종료될때까지 기다린다
			}catch (Exception e) {
			}
		}
		
		System.out.println("main and");
		
		
	}
}
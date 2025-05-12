package Project;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 공중습도 30% 미만일때 "분사하기"
 *  50~60% 확인 시 "분무정지"
 *  오전 9시 이후 "통풍하기"
 *  2시간 통풍 후 "환기창 닫기"
 *  겨울철 실내온도 18-20도 이범위를 벗어나면 "온도확인"
 *  온도 25도이상 습도 60%이상 "통풍하기" 
 */



public class 식물키우기 {
public static void main(String[] args) {
	System.out.println("===현재 습도 확인===");
	Scanner sc = new Scanner(System.in);
	int gauge = sc.nextInt();
		if(gauge <30) {
			System.out.println("분사하기");
		}else if(gauge<50) {
			System.out.println("분사대기");
		}else if(gauge<61) {
			System.out.println("분무정지");
		}else {
			System.out.println("습도과다");
		}
		
  }
}
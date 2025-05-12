package 자바2;
import java.util.Scanner;

/**
 *3과목의 점수를 입력 받아 Grade객체를 생성하고 성적 평균을 출력하세요
 *Hint : Grade클래스에 int 타입의 math, science, english 필드를 private로 선언하고, 생성자와 3과목의 평균을 리턴하는 average() 메서드를 작성하세요 
 *
 */

class Grade{
	private	int math;
	private	int science;
	private	int english;
	
	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average() {
		return (math + science + english) / 3;
	}
	
}

public class _2_14_문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 3개의 정수 입력");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
	
		
	}

}


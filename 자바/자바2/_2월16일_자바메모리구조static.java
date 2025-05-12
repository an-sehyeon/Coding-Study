package 자바2;

/**
 *자바 메모리 구조
 *1) 스택 영역 : {}내의 지역변수를 생성 {}벗어나면 소멸 
 *
 *2) 클래스 영역(메서드영역) : 공유메모리, static변수, 일반메서드, 생성자메서드
 *							프로그램 시작과 동시에 생성되며 프로그램 종료시 소멸 
 *
 *3) 힙 영역 : 객체저장공간, 
 *			new 예약어 사용시 생성 소멸은 JVM(자바버츄얼머신) 가비지 컬렉터에 의해서 소멸 
 *
 */

class Simple {
	static int Num1 = 0; //(static이 인트앞에 붙으면 모든 메모리공간에서 사용가능)공유변수
	int Num2; //멤버변수
	
	//멤버함수
	void ShowNum() {
		System.out.printf("NUM1 : %d NUM2 : %d\n", Num1, Num2);
	}
	
	
}

public class _2월16일_자바메모리구조static {

	public static void main(String[] args) {
		
		Simple obj1 = new Simple();
		Simple obj2 = new Simple();
		obj1.Num1 = 10;
		obj2.Num2 = 20;
		obj2.ShowNum();
		Simple.Num1 = 123;
		obj1.ShowNum();
		
	}

}


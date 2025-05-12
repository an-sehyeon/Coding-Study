package 자바2;

/**
 * 캐스팅 = 타입을 변환하는것을 말하며 형변환이라고도 한다.
 * 		자바의 상속 관계에 있는 부모와 자식 클래스 간에 서로 형변환이 가능하다 
 *
 * 업캐스팅 : 상위클래스 참조변수로 하위객체를 연결하는 형태
 * 			상위클래스 참조변수는 물려받는 속성에 접근 가능하다.
 * 			상위클래스 참조변수는 물려받는 기능에 접근 가능하다.
 * 			상위클래스 참조변수는 추가(확장)된 하위 멤버에 접근 불가능하다.
 * 			상위클래스 참조변수는 오버라이딩(함수재정의)된 멤버 함수에 접근 가능하다.
 * 
 * 		
 */


class Super{
	int num1;
	public void sound() {
		System.out.println("Sound1()");
	}
}

class Sub extends Super{
	int num2;
	public void move() {
		System.out.println("Sub1 move1()");
	}
	
	public void sound() {
		System.out.println("Sub's Sound1");
	}
}


public class _2월16일_캐스팅 {

	public static void main(String[] args) {
//		//정상범위(Nocasting)
//		Super ob1 = new Super();
		
		//Upcasting(상위클래스 참조변수 = 하위클래스 객체주소)
		Super ob2 = new Sub();
		ob2.num1=10;
		ob2.sound();
	}

}

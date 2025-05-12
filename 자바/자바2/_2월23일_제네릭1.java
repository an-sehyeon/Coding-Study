package 자바2;

/**
 *제네릭
 *데이터 형식에 의존하지 않고 나의 값이 여러 다른 데이터 타입들을 가질 수 있는 것
 *
 *제네릭의 기본구조
 *객체<타입, 클래스> 객체명 = new 객체<타입>();
 */

abstract class 호빵재료 {
	
}

class 팥 extends 호빵재료 {
	String meterial;
	
	팥(String meterial) {
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return "팥[meterial =" + meterial + "]";
	}
}

class 야채 extends 호빵재료{
	String meterial;
	
	야채(String meterial) {
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return "야채[meterial =" + meterial + "]";
	}
}

class 피자 extends 호빵재료{
	String meterial;
	
	피자(String meterial) {
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return "피자[meterial =" + meterial + "]";
	}
}

class 호빵<T extends 호빵재료> {
	private T meterial;
	
	호빵(T meterial) {
		this.meterial = meterial;
	}
	
	
	void ShowInfo() {
		System.out.println(meterial.toString() + "으로 만든 호빵");
	}
}

public class _2월23일_제네릭1 {

	public static void main(String[] args) {
		호빵<팥> 단팥호빵 = new 호빵<팥>(new 팥("단팥"));
		단팥호빵.ShowInfo();
		
		호빵<야채> 야채호빵 = new 호빵<야채>(new 야채("야채"));
		야채호빵.ShowInfo();

		호빵<피자> 피자호빵 = new 호빵<피자>(new 피자("피자"));
		피자호빵.ShowInfo();
	}

}

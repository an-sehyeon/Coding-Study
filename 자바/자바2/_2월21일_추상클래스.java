package 자바2;

/**
 * 추상클래스란
 * 공통된 행동이나 필드를 묶어 하나의 클래스를 만드는 것 
 * 하나 이상의 추상 메서드를 포함해야 된다.
 * 추상 클래스는 객체 생성이 불가능하다.
 * 추상클래스를 사용하는 이유는 객체들의 필드와 메소드의 이름을 통일하여 소스의 가독성을 높이기 위함
 */

//일반클래스
class par1 {
	void method1() {} //일반 메서드
}

class son1 extends par1{
	void method1() {
		System.out.println("Son1의 재정의 된 메서드");
	}
}


//추상클래스
abstract class par2{
	abstract void method2();
}

class son2 extends par2{
	
	@Override
	void method2() {
		System.out.println("Son2에서 강제로 재정의한 메서드");
	}
}


public class _2월21일_추상클래스 {//AbstaractMain

	public static void main(String[] args) {
		par1 ob1 = new par1();
		son1 ob2 = new son1();
		ob1 = ob2;
		ob1.method1();
		
		son2 ob3 = new son2();	//하위클래스에서 물려받은 추상메서드를 재정의한다면 객체생성 가능
		par2 ob4 = ob3;
		ob4.method2();
	}

}

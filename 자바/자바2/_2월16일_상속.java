 package 자바2;


/**
 *상속 : 상위클래스(부모클래스)의 속성과 기능을 하위클래스에서 그대로 받아 사용할 수 있도록 허용한 문법
 * extends : 상속받기위해서 사용하는 예약어
 * 확장성,유지보수,가독성
 * 
 * 필드값을 가져오는 메서드를 게터(getter), 설정하는 메서드를 세터(setter)라고 한다
 */

//상위 클래스, 부모 클래스, 슈퍼클래스
class Piont2D{
	int x;
	int y;
	
	void showPiont() {
		System.out.println(x + "," + y);
	}
}

//하위클래스, 자식클래스, 서브클래스
class Piont3D extends Piont2D{
	int z;
	void showpiont3D() {
		System.out.printf("%d  %d  %d\n", x ,y ,z);
	}
}

public class _2월16일_상속 {

	public static void main(String[] args) {
		Piont3D ob1 = new Piont3D();
		ob1.x= 10;
		ob1.y= 20;
		ob1.z= 30;
		ob1.showpiont3D();
		System.out.print("");
		
	}

}
package 자바1;

class Test {
	//속성
	int x;
	double y;
	char z;
	boolean flag;
	String name;
	
	Test() {	//Test 생성자
		System.out.println("디폴트 생성자 호출");		
	}
	
	Test(int x) {
		System.out.println("Test(int) 생성자");
		this.x= x;
	}
	
	Test(int x, double y) {
		System.out.println("Test(int, double)생성자");
		this.x = x;
		this.y = y;
	}
	
	Test(int x, double y, char z) {
		System.out.println("Test(int, double, char) 생성자");
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override // 상속관계에 있는 클래스간에 하위 클래스가 상위 클래스와 완전동일한 메소드를 덮어쓴다.
	public String toString() {
		return "Test[x = + x +=, y=" + y + ", z=" + z + ", flag=" + "]";		
		
	}
}

public class _2월3일_Test {

	public static void main(String[] args) {
//		Test obj = new Test();
		Test obj = new Test(10);
//		Test obj = new Test(10, 20.5);
//		Test obj = new Test(10,20.5, 'A');
		System.out.println(obj.toString());
		
		

	}

}

// 생성자 메서드
// 객체에 필요한 공간형성 + 초기값을 설정
// 클래스(객체)명과 동일한 이름을 지정
// 매개변수를 가질수도 있다.
// 반환자료형(result)값은 지정할 필요없다.
// 객체를 생성할때에는 호출되는 함수(1회만 호출)
//생성자를 명시하지 않은 경우(코드삽입x)는 컴파일러에 의해 기본생성자가 주입된다(디폴트 생성자)

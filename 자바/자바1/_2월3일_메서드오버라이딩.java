package 자바1;

//오버라이딩 : 동일한 변수명이라도 데이터타입에 따라 출력된다.	메인메소드에서 정의한 메소드를 서브 클래스에서 재정의한 변수(함수)를 호출
class Simple{
	
	int sum(int x, int y) {
		System.out.println("sum(int, int)호출");
		return x + y;
		
		
	}
	int sum(double x, double y) {
		System.out.println("sum(double, double)호출!");
		return (int)(x + y);
	}
	
	int sum(int x, int y, int z) {
		System.out.println("sum(int, int, int)호출");
		return x + y + z;
		
	}
	
}

public class _2월3일_메서드오버라이딩 {

	public static void main(String[] args) {
		Simple a = new Simple();
		int result = a.sum(234, 45, 78);
		System.out.println("RESULT: " + result);

	}

}
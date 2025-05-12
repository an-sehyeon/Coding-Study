package 자바2;

//name, addr 멤버변수가 있는 Man클래스를 만들고 생성자를 호출하여 toString으로 Man을 재정의 하세요.

class Man {
	String name;
	String addr;
	
	Man(){}
	
	Man(String name, String addr){
		this.name = name;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Man[name = " + ", addr = " + addr + "]";
	}
}

//x, y가 들어가 있는 제네릭 타입의 Simple클래스 생성 및 생성자를 호출하고 x,y에 값을 담을 수 있는 ShowMember메서드 구현
class Modern<T> {
	T x;
	T y;
	
	Modern(T x, T y) {
		this.x = x;
		this.y = y;
	}
	
	void ShowMember() { // x, y를 담아서 출력해주는 메서드
		System.out.println("x = " + x + ",Y = " + y);
		
		
}
}


public class _2월23일_제네릭문제 {

	public static void main(String[] args) {

		//모던 생성자를 제네릭 구조로 Inerger 타입을 호출하여 x에는 100, y에는 200을 담으세요
		Modern<Integer> ob1 = new Modern<Integer>(100,200);
	ob1.ShowMember();
	
	//Simple을 제네릭 Person으로 호출하여 "홍길동", "대구" & "서길동","남해"를 출력하세요
	Modern<Man> ob2 = new Modern<Man>(new Man("홍길동", "대구"), new Man("서길동", "남해"));
	ob2.ShowMember();
	}

}

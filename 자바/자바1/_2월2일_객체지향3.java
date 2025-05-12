package 자바1;

class Persion{
	String name;
	int age;
	float height;
	double weight;
	
	void talk() {	// talk 기능 정의
		System.out.println(name + "님이 말합니다.");
	}
	
	void walk() {	// walk 기능 정의
		System.out.println(name + "님이 걷습니다.");
	}
	
	void info() {	// info 기능 정의
		System.out.printf("%s %d %s %s\n", name, age, height, weight);
	}
}

public class _2월2일_객체지향3 {

	public static void main(String[] args) {
		Persion a = new Persion();		//persion객체 호출
		a.name = "안세현";
		a.age = 27;
		a.height = 180f;
		a.weight = 83;
		
		a.talk();		// persion 기능호출
		a.walk();		// persion 기능호출
//		a.info();		// persion 기능호출
			
		

	}

}


package 자바2;

/**
 * 오버라이딩(함수재정의)
 * 상송관계에서 상위클래스의 메서드를 하위클래스가 재정의(고쳐사용하기)하는 것을 허용하는 문법
 * 메서드의 헤더부분은 동일하나 바디{} 부분의 로직이 다를수가있다. 
 */

class Animal {
	public void Soound() {
		System.out.println("소리를 냅니다");
	}
}

class Dog extends Animal{
	public void Soound() {
		System.out.println("멍멍 소리를 냅니다");
	}
}

class Cat extends Animal{
	public void Soound() {
		System.out.println("야옹 소리를 냅니다");
	}
}




public class _2월16일_함수재정의_오버라이딩 {

	public static void main(String[] args) {
		Dog poppi = new Dog();
		Cat Yummi = new Cat();
		
		poppi.Soound();
		Yummi.Soound();
	}

}
package 자바1;

//지역 변수 : {}내에서 선언된 변수, {}벗어나면 소멸(사용하지 못함) = 절차지향 문법

class Local{
	int num = 10; //지역변수 num이 가지고 있는 초기값 10;
	
	void func1() {
		System.out.println("num: " + num);  //멤버변수
		
		if(true) {
			int num = 105;		//if문 안에서만 사용되는 지역변수 num
			System.out.println("num : "+ num);
		}
		System.out.println("num: "+ num);	//멤버변수
	}
}
public class _2월3일_LocalVar_지역변수 {

	public static void main(String[] args) {
		Local obj = new Local();
		obj.func1();
		

	}

}

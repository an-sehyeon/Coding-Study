package 자바2;

//Employee 클래스를 만들어 show함수와 name, age, addr을 가진 생성자를 작성하세요.(super예약어 사용)

class Employee {								
		String name;
		int age;
		String addr;
		
		public Employee(String name, int age, String addr) {
			super();
			this.name = name;
			this.age = age;
			this.addr = addr;
		}
		
		void show()	{
			
		}
	}


	//부모클래스를 상속받은 Parttimer클래스를 만들고 hourpay멤버변수를 만들어 부모클래스의 생성자가 가지고 있는 매개변수를 가지고 있는
	//자식클래스 생성자를 만드세요.
class Parttimer extends Employee{
	
	int hourpay;												  
	
	public Parttimer(String name, int age, String addr, int hourpay) {
		super(name, age, addr);
		this.hourpay = hourpay;
	}
	@Override
	void show() {
		System.out.printf("시간제 근로자 : %s %d %s %d\n", name, age, addr, hourpay);
	}
}
	//위와 같은 방식으로 salary멤버변수를 가지고 있는 Regular클래스를 완성하세요
class Regular extends Employee{
	
int salary;												  
	
	public Regular(String name, int age, String addr, int salary) {
		super(name, age, addr);
		this.salary = salary;
	}
	@Override
	void show() {
		System.out.printf("시간제 근로자 : %s %d %s %d\n", name, age, addr, salary);
	}
}


//showinfo 함수를 만들어 모든 멤버변수 전부 출력하기


public class _2월21일_문제 {
	public static void ShowInfo(Employee emp) { //ShowInfo함수
		emp.show();
	}
	public static void main(String[] args) {
		Parttimer emp1  = new Parttimer("홍길동", 25, "대구", 20000);
		Regular emp2  = new Regular("서길동", 45, "울산", 50000);
		ShowInfo(emp1);
		ShowInfo(emp2);
	}
}



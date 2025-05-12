package 자바1;

class carmodel{		//carmodel객체 생성
	
	//속셩(필드, 멤벼변수)
	String name;
	int spped;
	int fuel;
	String model;
	
	//기능
	//Accel();void
	
	void Accel() {
		//fuel 체크(-5)
		//speed 체크(200km/h +10)
		
		if (fuel - 5 <= 0) {
			fuel = 0;
		   System.out.println("[ERR} 가속불가 - 연료가 부족합니다.");
		}else {
			fuel -=5;
			if(spped + 10 >= 200) {
				spped = 200;
				System.out.println("[INFO] 가속합니다. - 현재속도");
			}else {
				spped += 10;
			}
		}
	}
	
	void Break() {
		if (spped - 15 <= 0) {	// 초기값 100을 15씩 빼주면서 0보다 작거나 같다면
			spped = 0;
			System.out.println(" [WARN] 감속불가 - 현재속도 0km/h");	// 감속불가를 출력
		}else {
			spped -= 15;
			System.out.println(" [INFO] 현재속도 " + spped + "km/h");	//그렇지 않다면 현재속도를 15씩 계속 빼주는것을 표현
		}
	}
	
	
		void info() {
			System.out.printf("%s %d %d %s\n",name, spped, fuel, model);
	 }
}
public class _2월2일_객체지향2 {

	public static void main(String[] args) throws InterruptedException {	//메인메소드 : 프로그램 최초 실행시 호출되는 메소드, 
												// InterruptedException : try catch문 없이 sleep 메소드를 사용하기 위해 필요
		
		carmodel a = new carmodel();		//a라는 이름으로 carmodel이라는 객체를 호출
		a.name ="안세현";	// 객체가 가지고 있는 name변수 호출
		a.spped =100;	// 객체가 가지고 있는 spped변수 호출
		a.fuel = 200;	// 객체가 가지고 있는 fuel변수 호출
		a.model = "소나타";	// 객체가 가지고 있는 model변수 호출
		System.out.printf("차주 : %s 현재속도 : %f 연료량 : %f 차종 : %s", a.name, a.spped, a.fuel, a.model);
		
		while(true) {
			//a.Accel();
			a.Break();
			Thread.sleep(500);
		}
			
	}

}

package 자바2;

/**
 * 싱글톤 =공유프린터 
 * 		-프로그래밍언어의 디자인 패턴
 * 		-프로그램 제작시 사전에 발견되었던 문제들을 해결하고 정형화 시켜놓은 작업패턴 
 * 
 * 상품 제작시 사전에 발견되었던 문제들을 해결하고 정형화 시켜놓은 작업패턴
 * 디자인 패턴은 제작자들간의 의사소통 수단의 일종이다.
 * **싱글톤은 무조건 private 사용해야됨
 * 
 * 싱글톤의 장점(사용하는 이유)
 * 메모리 낭비 방지
 * 속도측면에서 이점
 * 데이터공유가 쉬움(여러클래스의 인스턴스에서 싱글톤인스턴스의 데이터에 동시 접근하게 되면 동시성 문제 발생)
 * 
 * 싱글톤의 단점
 * 싱글톤 패턴을 구현하는 코드 자체가 많이 필요함
 * 테스트하기 어려움
 */

class Company { 
	int x;
	int y;
	
	private static Company instance;
	
	private Company() {};
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}

public class _2월16일_싱글톤 {

	public static void main(String[] args) {

		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1 == myCompany2);
		
		myCompany1.x = 10;
		myCompany2.y = 20;
		
		Company myCompany3 = Company.getInstance();
		System.out.println(myCompany3.x + " " + myCompany3.y);
	}

}


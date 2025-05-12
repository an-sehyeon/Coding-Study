package 자바2;
class Person {
	String name;
	String age;
	String addr;
	
	@Override
	public String toString() {
		return "Person [name = " + name + ", age = " + age + ", addr = " + addr + "]";
	}
	
}

public class _2_14_배열객체화 {

	public static void main(String[] args) {
		Person employeep[] = new Person[3];
		employeep[0] = new Person();
		employeep[0].name = "홍길동";
		employeep[0].age = "44";
		employeep[0].addr = "대구";
		
		System.out.println(employeep[0].toString());
		
		//다른 객체를 연결해서 이름 : 남길동, 나이 : 22, 주소 : 서울 로 저장하는 코드를 작성하세요
		employeep[1] = new Person();
		employeep[1].name = "남길동";		
		employeep[1].age = "22세";
		employeep[1].addr = "서울";
		
		System.out.println(employeep[1].toString());
		
	}

}



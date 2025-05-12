package 자바2;

class ceo {
	String id;
	String name;
	int salary;
	
	ceo(String id, String name, int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//equals를 재정의하여 id와 salary이 같으면, true 다르면 false를 반환하도록한다
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ceo) {
			ceo down = (ceo)obj;
			return this.id.equals(down.id)&& this.salary == down.salary;
			
		}
		return false;
	}
}


public class _2월23일_오브젝트2 {

	public static void main(String[] args) {
		ceo ob1 = new ceo("1010", "홍길동", 5000);
		ceo ob2 = new ceo("2020", "김길동", 6000);
		ceo ob3 = new ceo("1010", "홍길동", 5000);
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		System.out.println(ob2.equals(ob3));
	}

}

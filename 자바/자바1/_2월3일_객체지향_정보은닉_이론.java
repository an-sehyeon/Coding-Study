package 자바1;

//정보은닉

//		클래스 내의 멤버변수(멤버함수)의 사용을 제한하는 문법
//public : 모든 클래스내에서 접근가능
//default(기본값) : 동일 패키지에 속한 클래스만 접근 가능
//private : 현재 클래스내에서만 접근 가능
//protected : 동일 패키지에 속한 클래스 or 상속관계에서의 하위클래스에서만 접근가능 

class Profile {
	String name;	
	private String id;
	private int age;
	float weight;
	double height;
	private String salary;

	public Profile(String name, String id, int age,float weight, double height, String salary) {
	this.name = name;
	this.id =id;
	this.height = height;
	this.weight = weight;
	this.salary = salary;
	}

	public void getname() {
		this.name = "안세현";
	}
	
	public void getweight() {
		this.weight = 83;
	}
	
	public void getheight()	{
		this.height = 180;
	}

	//Setter함수
	public void setSalary() {
		this.salary = "직장인";
}
	//Getter함수
	public void getId() {
		this.id = "shan334";
//		return this.Id;
	}

	public void setAge(int age) {
		this.age = 27;
	}
	public void getProfile1(){
		System.out.printf("이름 : %d  아이디 : %d  나이 : %d 몸무게 : %d  키 : %d  직업 : %d\n", name, id, age, weight, height, salary );
	}
}
public class _2월3일_객체지향_정보은닉_이론{
	public static void main(String[] args) {
		String name = "안세현";
		String id = "shan334";
		int age = 27;
		float weight = 83;
		double height = 180;
		String salary = "직장인";
		Profile a = new Profile(name, id, age, weight, height, salary);
		System.out.println("신상정보 : " + a);
//		a.getname();
//		a.getId();
//		a.setAge(27);
//		a.getweight();
//		a.getheight();
//		a.setSalary();
//		a.getPerson12();
		
	}

}

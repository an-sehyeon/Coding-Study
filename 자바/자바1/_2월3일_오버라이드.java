package 자바1;

class Man{
	String name;
	int age;
	float height;
	double weight;
	
	Man(String name, int age, float height, double weight){
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	void talk() {
		System.out.println(name + "님이 말합니다.");
	}
	
	void walk() {
		System.out.println(name + "님이 걷습니다.");
	}
	
	void show() {
		System.out.printf("name = %s, age = %d, height = %f, weight = %f\n",name,age,height,weight);
	}
	
	public String toString() {
		return "Person[name =" + name + "\tage =" + age + "\theight = " + height + "\tweight = " + weight +"]";
	}
}

public class _2월3일_오버라이드 {
	public static void main(String[] args) {
		Man per = new Man("김아무개", 23, 188.9f, 89);
		per.walk();
		per.talk();
		per.show();
		System.out.println(per.toString());
	}
}
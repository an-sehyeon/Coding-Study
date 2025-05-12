package 자바1;



class Person{
	//속성(필드, 멤버변수)
	String name;
	int age;
	float height;
	double weight;
	
}
public class _2월2일_객체지향 {
	//Person : 객체
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person a = new Person();
		a.name = "안세현";
		a.age = 27;
		a.height = 180f;
		a.weight = 83;
		System.out.printf("%s %d살 %scm %skg\n",a.name, a.age, a.height, a.weight);
	
			
	}

}

package 자바2;

/**
	 * 상속관계에서 생성자 호출
	 * 상위클래스(부모클래스) 생성자 호출 -> 하위클래스(자식클래스) 생성자 호출
	 * 상위 클래스 생성자 호출시 super()예약어를 사용하여 상위클래스의 오버로딩된 생성자에 접근이 가능하다.
	 *  
	 * super() : 자식클래스의 생성자에서 부모클래스의 생성자를 호출하기 위해서 사용된다. 
	 * super : 자신이 상속받은 부모클래스에 대한 멤버변수로, 부모클래스의 멤버에 접근할때 사용한다.
	 */

	class Parent {
		int x;
		int y;
		
		Parent() {
			System.out.println("Parent() 생성자 호출");
		}
		
		Parent(int x){
			System.out.println("Parent(x) 생성자 호출");
			this.x = x;
		}
		Parent(int x, int y){
			System.out.println("Parent(x,y) 생성자 호출");
			this.y = y;
			this.x = x;
		}
	}

	class Son extends Parent {
		int z;
		
		Son() {
			super();
			System.out.println("Son() 생성자 호출");
		}
		
		Son(int x){
			super(x);
			System.out.println("Son(x) 생성자 호출");
		}
		
		Son(int x, int y){
			super(x,y);
			System.out.println("Son(x,y) 생성자 호출");
		}
		Son(int x, int y, int z){
			super(x,y);
			this.y= y;
			System.out.println("Son(x, y, z) 생성자 호출");
		}
		
	}

	public class _2월16일_생성자호출 {

		public static void main(String[] args) {
			Son ob1 = new Son();
			System.out.println();
			
			Son ob2 = new Son(10,78);
			System.out.println();
			
		}

	}


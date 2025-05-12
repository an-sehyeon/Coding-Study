package 자바2;

class A {
	int a = 10;
	
}

class B extends A{
	int b = 20;
}

class C extends A{
	int c = 30;
}

class D extends B {
	int d = 40;
}

class E extends B {
	int e = 50;
}

class F extends C {
	int f = 60;
}

class G extends E {
	int e = 70;
}

class UpdownTest {
	void ShowMember(A obj) {
		//instanceof : 클래스형 구별을 위한 예약어
	
		if(obj instanceof D) {
			D down = (D)obj;
			System.out.println("D 객체 : " + down.a + " " + down.b + " " + down.d);
		}else if (obj instanceof C) {
			C down = (C)obj;
			System.out.println("C 객체 : " + down.a + " " + down.c );
		}else if (obj instanceof C) {
			B down = (B)obj;
			System.out.println("B 객체 : " + down.a + " " + down.b );
	}
	}
}


public class _2월21일_업다운캐스팅 {

	public static void main(String[] args) {
		UpdownTest test = new UpdownTest();
		B ob1 = new B();
		C ob2 = new C();
		D ob3 =	new D();
		
		test.ShowMember(ob1); // A obj = ob1 
		test.ShowMember(ob2);
		test.ShowMember(ob3);
		test.ShowMember(new D());
		
	}

}


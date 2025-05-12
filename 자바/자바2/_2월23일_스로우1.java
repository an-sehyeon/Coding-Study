package 자바2;

public class _2월23일_스로우1 {
	public static void Ex1() {
		try {
			throw new NullPointerException("Ex1의 예외처리");
		} catch(Exception e) {
			System.out.println("Ex1의 예외처리");
		}
		System.out.println("Ex1 실행코드");
	}
	
	public static void Ex2() throws Exception {
		throw new NullPointerException("Ex2의 예외처리");
	}

	public static void main(String[] args) {
			Ex1();
			
			try {
				Ex2();
			} catch(Exception e) {
		System.out.println("Ex2 예외처리");
		
	}
	}
}

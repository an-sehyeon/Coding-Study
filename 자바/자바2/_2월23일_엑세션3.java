package 자바2;

public class _2월23일_엑세션3 {

	public static void main(String[] args) {
			try {
				int arr[] = new int[3];
				arr[5] = 10;
				String str = null;
				System.out.println(str.hashCode());
			} catch(Exception e) {
				System.out.println("예외처리");
				e.printStackTrace();
			}finally {
			System.out.println("실행코드1");
			System.out.println("실행코드2");
	}
	}
}

package 자바2;

/**
 * 래퍼클래스란 
 * 기본 자료타입을 객체로 다루기 위해서 사용하는 클래스들을 래퍼클래스라고 함
 *
 * 1)기본타입		2)래퍼클래스
 * 	byte			Byte
 * 	char			Char
 * 	int				*Integer
 * 	float			Float
 * 	double			Double
 *  boolean 		Boolean
 *  
 *  
 */

public class _2월21일_래퍼 {

	public static void main(String[] args) {
		//Boxing(자료 -> Integer 정수형 객체로 변환)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = new Integer("300");
		System.out.println(obj1 + obj2 + obj3);
		
		//UnBoxing(Integer자료 -> 일반자료)
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//AutoBoxing
		Integer obj = 100;
		int n1 = obj + 10;
		System.out.println("결과 : " + n1);
	}

}

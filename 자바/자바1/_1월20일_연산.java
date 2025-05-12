package 자바1;

import java.util.Scanner;

public class _1월20일_연산 {

	public static void main(String[] args) {
		//복합대입 연산자
//		int a = 10; 
//		a += 10;
//		a -= 5;
//		a *= 3;
//		System.out.println("a="+a); //결과값 == 45
	
		// 비교연산자
//		int a = 100, b = 20;
//		System.out.println("A == B :" + (a = b));
//		System.out.println("A == B :" + (a == b));
//		System.out.println("A > B :" + (a > b));
//		System.out.println("A < B :" + (a < b));
//		System.out.println("A >= B :" + (a >= b));
		
//		자료형비교(instanceof 연산자)
//		비교대상 데이터가 다음과 같은 조건을 만족할때 true을 반환한다
//		-지정한 클래스
//		-지정한 클래스를 상속한 클래스
//		-지정한 인터페이스를 구현한 클래스
//		[1] 자료형 비교
//		String value = "가나다라마";
//		boolean result = value instanceof String;
//		System.out.println(result);

		
		// 논리연산자  
//		And연산자 '&&' : 모든 조건식이 true여야 true을 반환
//		or연산자 '||' : 조건식 중 하나라도 true면 true를 반환
//		NOT연산자 '!' : 조건이 true면 false를 반환하고 조건이 false면 true를 반환
	
//		and 연산자
//		System.out.println("true And true =" +(true && true) );	
//		System.out.println("false And true =" +(false && true) );
//		System.out.println("true And true =" +(true && false) );
//		System.out.println("false And false =" +(false && false) );
		
//		or 연산자
//		System.out.println("true || true =" + (true ||true));
//		System.out.println("true || false =" + (true ||false));
//		System.out.println("true || true =" + (false || false));
		
//		not연산자
//		boolean fiag = false;
//		System.out.println("flag : " + fiag);
//		System.out.println("!fiag : " + !fiag);
		
//		증감연산자(++, --)
//		++a 전치연산자 : 먼저 값을 1씩 증가(감소)이후 다른 연산 처리
//		--a 후치연산자 : 다른 연산 처리를 먼저한 후 1증가(감소)
//		int a = 10, b = 10, c, d;
//		c= --a + b--;
//		d = a-- + b--;
//		System.out.printf("a=%d, d=%d, c=%d, d=%d", a,b,c,d);

//		삼항연산자
//		(조건식)? 참인경우 실행코드 : 거짓인 경우 실행코드
//		int kor = 85;
//		int eng = 81;
//		char grade = (kor > 80 && eng > 80)? 'A' : 'B';
//		System.out.println(grade+ "등급입니다.");
	
//		Scanner sc = new Scanner(System.in);
// 	    int num1 = sc.nextInt();
		
//		String result = (num1 % 2 == 0)?"짝수입니다.":"홀수입니다."; // '?'는 참일경우, ':'거짓일경우
//		System.out.println("결과 : " + result);
		
//		Scanner sc = new Scanner(System.in);
//		int n1, n2, n3, sum;
//		n1 = sc.nextInt();
//		n2 = sc.nextInt();
//		n3 = sc.nextInt();
//		sum = n1 + n2 + n3;
//		-n1~n3의 합계를 5로 나눈값이 0과 같을때 5의 배수이다 같지않을경우 5의 배수가 아니다 "출력"
//		String result = (sum %5 ==0)?"5의 배수입니다.":"5의 배수가 아닙니다.";
//		System.out.println("result : " + result);
		
//		삼항연산자 이용 문제
//		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		int sum = n1 + n2 + n3;
		
//		String result = (sum % 2 == 0 && sum % 5 == 0)?"참입니다.":"거짓입니다.";
//				System.out.println("result : " + result); 
	
//		비트연산자
//		int num1 = 15;  00000000 00000000 00000000 00001111
//		int num2 = 20;  00000000 00000000 00000000 00010100
//		int num3 = num1&num2; // '&' 두항의 비트가 모두 1이면 1, 아니면 0으로 연산
//		int num4 = num1|num2; // '|' 두항의 비트가 모두 0이면 0, 아니면 1로 연산
//		int num5 = num1^num2; // '^' 두항의 비트가 서로 다르면 1, 같으면 1로 연산
//		int num6 = ~num1;
		
//		System.out.println("AND 비트 연산 결과 :" + num3);
//		System.out.println("OR비트 연산 결과 :" + num4);
//		System.out.println("XOR 비트 연산 결과 :" + num5);
//		System.out.println("NOT 비트 연산 결과 :" + num6);
		
//		Shift(시프트)연산
//		int num1 = 15;
//		int num2 = 20;
//		int num3 = num2<<3;
//		int num4 = num2>>2;
//		
//		System.out.println("<<Shift 연산 결과 : " + num3);
//		System.out.println(">>Shift 연산 결과 : " + num4);
		
		
		
		
	}

}

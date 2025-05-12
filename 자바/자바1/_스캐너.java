package 자바1;
import java.util.Scanner;

public class _자바기초{

	public static void main(String[] args) {
		
		
				//스캐너
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력하세요 :");
//		String name = sc.next();
//		
//		System.out.printf("%s 님의 나이를 입력하세요", name);
//		int age = sc.nextInt();
//		
//		
//		System.out.printf("%s 님의 주소를 입력하세요", name);
//		sc.nextLine();
//		
//		String addr = sc.nextLine();
//		System.out.printf("%s 님의 나이는 %d세 주소는 %s 입니다\n", name, age, addr);
//
//		//서식 출력문
//		%c = 문자형
//		%d = 정수형
//		%e = 지수형
//		%f = 실수형
//		%o = 8진수
//		%s = 문자열
//		%u = 부호없는 정수형
//		%x = 16진수
		
		//BigDecimal 클래스를 이용한 계산
//		메서드명		대응하는연산자		기능
//		add				+			더하기
//		subtract 		-			빼기
//		multiply		*			곱하기
//		divide			/			나누기
//		remainder		%			나머지
		//나눗셈할때 끝수 처리(RoundingMode 상수)
//		HALF_UP = 반올림
//		UP		= 올림
//		DOWN	= 내림
//		CEILING	= 양수일때는 up과 같지만 음수일경우 예를 들어 -5.5를 올리면 -5가된다
//		FLOOR 	= CEILING의 반대
//		소수점 반올림 예시
//		import java.math.BigDecimal;
//		import java.math.RoundingMode;
//		public class 실수 {
//		public static void main(String[] args) {
//			BigDecimal sum1 = new BigDecimal("84.7");
//			BigDecimal sum2 = new BigDecimal("23.5");
//			BigDecimal result = sum1.divide(sum2,0,RoundingMode.HALF_UP);
//			System.out.println("84.7 ÷ 23.5 =" + result);
		
		
		
		
//		System.out.println("Hello World");
//    	System.out.printf("%d %d %d\n", 10, 20, 30);
//    	System.out.printf("%f %f %f\n", 10.1, 20.1, 30.1);
//    	System.out.printf("%c %c %c\n", 'A', 'B', 'C');
//    	System.out.printf("%s %s %s\n", "This is", "Helㅣo", "Test");
//    	System.out.printf("%d.%s : %d\n", 1, "국어", 100);
//        	
//    	System.out.printf("%s \t %s \t %s \t %s\n", "NO", "이름", "나이", "주소");
//    	System.out.printf("%d \t %s \t %d \t %s\n", 1, "김광수", 35, "대구");
//    	System.out.printf("%d \t %s \t %d \t %s\n", 2, "이태수", 55, "울산");
//    	System.out.printf("%d \t %s \t %d \t %s\n", 3, "이지성", 44, "김해");	
//       	
//    	System.out.printf("10진수 : %d\n", 0b1111);
//    	System.out.printf("8진수 : %o\n", 173);
//    	System.out.printf("16진수 : %x\n", 0255);
//    	
//    	
//    	
//    	//구구단
//    	int num1 = 1, num2 = 2, num3 =3, num4 = 4, num5 = 5, num6 = 6, num7 = 7, num8 = 8, num9 = 9;
//		
////    	Scanner sc = new Scanner(System.in);
//    	
//    	System.out.print("정수를 입력하세요 : ");
//    	int num = sc.nextInt();
//    	int sum1 = num * num1;
//    	int sum2 = num * num2;
//    	int sum3 = num * num3;
//    	int sum4 = num * num4;
//    	int sum5 = num * num5;
//    	int sum6 = num * num6;
//    	int sum7 = num * num7;
//    	int sum8 = num * num8;
//    	int sum9 = num * num9;
//    	System.out.printf("%d * %d = %d\n", num, num1, sum1);
//    	
//    		System.out.print("단을 입력하시오");
////    		Scanner sc = new Scanner(System.in);
//    		int a = sc.nextInt();
//    		
//    		
//    		for(int b=1; b<10; b++) {
//    		System.out.println(a + "*" + b + "=" + (a*b));
//    		}
//    		sc.close();
//    		
//    		
//    		
//    		//형변환
//    		//자동형변환(암시적) : 컴파일러에 의해 자동을 변환
//    	    //강제형변환(명시적) : 프로그래머에 의해 강제로 변환
//    		
////    			자동형변환 예시	
////    			byte bValue = 10;
////    			double intValue = bValue;
////    			System.out.println("intValue : " + intValue);
//    		
////    			char cValue = '가';  //문자가 들어갈 수 있는 메모리공간에 '가'라는 문자 입력
////    			int intValue = cValue; //cValue가 가지고 있는 값을 intValue에 int 타입으로 대입한다.
////    			System.out.println("가 의 유니코드 : " + intValue);	//intValue가 가지고 있는 값을 출력해라.	
//    			
////    			long lValue =100; // 정수타입인 lValue의 값은 100이다.
////    			float fValue = lValue; // lValue의 값을 float타입으로 변환한 값이 fValue이다.
////    			System.out.println("fValue = " + fValue); //fValue값을 출력하라.
//    		
////    			float fValue = 100.5f;
////    			double dValue = fValue;
////    			System.out.println("dValue : " + dValue);
//    		
////    	 		강제형변환 예시 = -좁은 메모리공간에 큰값을 넣으려고 하는 경우 -기본젹으로 (자동형변환)불가능하기 때문에 강제로 데이터타입을 바꿔서 전달
////    			-데이터 손실 염려가 있다.
//    			
////    			int iValue = 44032;
////    			char cValue = (char)iValue;
////    			System.out.println(cValue);
//    			
////    			double dValue = 3.14; // 실수타입인 dValue의 값은 3.14
////    			int iValue = (int)dValue; // iValue의 값은 dValue의 값을 정수형 데이터타입으로 강베형 변환한 값
////    			System.out.println(iValue); // iValue 값을 출력
//    			
////    			int num1 = 129; //00000000 00000000 00000000 10000001
////    			int num2 = 130; //00000000 00000000 00000000 10000010
//    			
////    			byte ch1 = (byte)num1; ////1byte의 값만 가지고 있기 때문(10000001)
////    			byte ch2 = (byte)num2;
//    			
////    			System.out.printf("%d \n", (int)ch1);
////    			System.out.printf("%d \n", (int)ch2);
//    			
////    			int iValue = 10; //정수 변수 10 
////    			float fValue = 3.3f; //실수 변수 3.3
////    			double dValue = 5.5; //실수 변수 5.5
////    			double result = iValue + fValue + dValue; //변수 3개의 합을 double데이터타입인 실수형으로 변환
////    			System.out.println(result); //변수 result 출력
//    		
////    			int num1 = 10, num2 = 20; //각각의 변수에 10, 20을 대입
//    			
////    			double dnum1 = num1 / num2; //피연산자 num1은 int형이기 때문에 연산후 소수점 데이터 손실
////    			double dnum2 = (double)num1 / num2; //나누는 수를 double형으로 강제 형변환후 연산결과 출력
////    			double dnum3 = (1.0 * num1) / num2;
//    			
////    			System.out.println("dum1 : " + dnum1);                   %소문자로 시작하면 변수 대문자로 시작하면 함수
////    			System.out.println("dum2 : " + dnum2);					Double함수는 문자열을 실수형으로 변환시켜주는 함수
////    			System.out.println("dum3 : " + dnum3);
//    		
//    			long var1 = 2L;
//    			float var2 = 1.8f;
//    			double var3 = 2.5;
//    			String var4 = "3.9";
//    			int result = (int)(var1 + var2 + (int)var3 + Double.parseDouble(var4)); 
//    			System.out.println(result);
//    		
//    			
//    			
//    			
//    			//스캐너를 이용한 형변환
////    			Scanner sc = new Scanner(System.in); //스캐너 함수 호출 후 바로 사용할 수 없으니까 함수명, 스캐너, 객체를 생성
//    			
////    			int num1 = sc.nextInt();
////    			int num2 = sc.nextInt();
////    			int num3 = sc.nextInt();
////    			int num4 = sc.nextInt();
//    			
//    			
////    			int sum = num1 + num2 + num3 + num4;
////    			System.out.printf("%d + %d + %d +%d = %d \n", num1, num2, num3, num3, num4, sum);
////    			sc.close();
//    			
////    			Scanner sc = new Scanner(System.in);
//    			
////    			System.out.print("정수 입력 : ");
////    			int num1 = sc.nextInt();
////    			System.out.println("입력된 정수값 :" + num1);
//    			
////    			System.out.print("실수 입력 : ");
////    			double num2 = sc.nextDouble();
////    			System.out.println("입력된 실수값 : " + num2);
//    			
////    			System.out.print("문자열 입력 : ");
////    			String str1 = sc.next();
////    			System.out.println("입력된 문자열 : " + str1);
		
//					접근제한자
//				    -접근제한자를 이용하여 필드,메서드,클래스등에 다른 클래스의 접근을 제한할 수 있다.
//					public = 어느 클래스에서나 접근할 수 있다.
//					protected = 같은 패키지 내 클래스 및 상속한 클래스까지 접근할 수 있다.
//					(제한자 없음) = 같은 패키지 내 클래스까지 접근할 수 있다. default 혹은 friendly라고도 한다.
//					private = 자신의 클래스 내에서만 접근할 수 있다.
		
//		클래스의 경우(클래스의 경우 public만 지정가능)
//		접근제한자 class 클래스명{
//		}
//		
//		필드의 경우
//		접근제한자 자료형 자료명;
//		
//		메서드의 경우
//		접근제한자 반환형 메서드명(인수형 인수명) {
//		}
    			
    			Scanner sc = new Scanner(System.in);
    			
    			int num2 = 2, num3 = 3, num4 = 4;
    			
    			System.out.println("단 입력 : ");
    			int num1 = sc.nextInt();
    			System.out.printf("%d * %d = %d\n", num1, num2, num3);
	}
}

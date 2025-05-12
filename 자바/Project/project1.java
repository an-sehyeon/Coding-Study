package Project;

import java.util.Scanner;

/**
 *숫자를 2개를 입력받아 더 큰 숫자를 출력받고
 *추가로 숫자를 2개 더 입력받아 더 작은 숫자를 출력한 뒤
 *큰 숫자와 작은 숫자의 차를 출력받는 코드를 작성하세요 
 */

//public class project1 {
//	public static void main(String[] args) {
//		System.out.println("숫자를 2번 입력하세요.");
//		
//		Scanner sc = new Scanner(System.in);
//		int no1 = sc.nextInt();
//		int no2 = sc.nextInt();
//		int sum =0;
//		
//		
//		if(no1>no2) {
//			sum = no1;
//			System.out.println("더 큰 숫자는 " + no1 + "입니다.");
//		}else {
//			sum = no2;
//			System.out.println("더 큰 숫자는 " + no2 + "입니다.");
//		}
//		
//		System.out.println("숫자를 추가로 2번 입력하세요");
//		int no3 = sc.nextInt();
//		int no4 = sc.nextInt();
//		int sum1 = 0;
//		
//			if(no3>no4) {
//				sum1 = no4;
//				System.out.println("더 작은 숫자는 " + no4 + "입니다.");
//			}else {
//				sum1 = no3;
//				System.out.println("더 작은 숫자는 " + no3 + "입니다.");
//			}
//		
//		int plus = sum-sum1;
//		System.out.println("큰 숫자와 작은 숫자의 차 는 " + plus + "입니다.");
//	}		
//}


class Big{
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int sum2 = 0;
		void big() {
		if(a>b) {
			sum2 = a;
			System.out.println("a와 b 중 더 높은 점수는 a의 " + a + "점입니다.");
		}else {
			sum2 = b;
			System.out.println("a와 b 중 더 높은 점수는 b의" + b + "점입니다.");
		}
	}
}

class Small {
	Scanner sc = new Scanner(System.in);
	int c = sc.nextInt();
	int d = sc.nextInt();
	int sum1 = 0;
		void small() {
		if(c<d) {
			sum1 = c;
			System.out.println("c와 d 중 더 낮은 점수는 c의" + c + "점입니다.");
		}else {
			sum1 = d;
			System.out.println("c와 d 중 더 낮은 점수는 d의" + d + "점입니다."); 
		}sc.close();
	}
}

public class project1 {
public static void main(String[] args) {
	System.out.println("상위권 학생 2명의 점수를 입력해주세요");
	Big bg = new Big();

	bg.big();
	System.out.println("추가로 하위권 학생 2명의 점수를 입력해주세요.");
	Small sm = new Small();
	sm.small();
	System.out.println("1등(" + bg.sum2 +")과 꼴등(" + sm.sum1 + ")의 점수 차는 " + (bg.sum2-sm.sum1) + "점입니다.");
	}
}

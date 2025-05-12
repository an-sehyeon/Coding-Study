package 자바1;

import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class _1월26일_분기문if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	    } 문제 = 정수하나를 받아 입력받은수가 3의 배수인지 아닌지 확인, 두 수를 입력받아 큰 수를 출력 
//		Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//      int b = sc.nextInt();
       
//       if(a > b) {
//    	   System.out.println("큰수 : " + a);
//      }else {
//    	   System.out.println("큰수 : " + b);
//       }
//       if(a%3==0) {
//    	   System.out.println("3의 배수입니다.");
//     }else {
//       System.out.println("3의 배수가 아닙니다.");
//    	 }
		
		
//		 int n1 = sc.nextInt();
//	     int n2 = sc.nextInt();
//	     int n3 = sc.nextInt();
		
//	     if(n1  >= n2&& n1 >=3) {
//	      System.out.println("큰수 : " + n1);
//	       }else if(n2>=n1&&n2>=n3) {
//		  System.out.println("큰수 :" + n2);
//	       }else (n3 >=n1&& n3 >=n2) {
//	      System.out.println("큰수 : " + n3);
//		}
		/**
		 * 국어, 영어, 수학
		 * 각 과목당 40점 미만이면 불합격
		 * 평균이 60점 미만이면 불합격
		 * 그게 아니라면 합격
		 */
//		int kor = 0, eng = 0, mat = 0, sum = 0 ;
//		double avg = 0.0;
//		Scanner sc = new Scanner(System.in);
//		kor = sc.nextInt();
//		eng = sc.nextInt();
//		mat = sc.nextInt();
//		sum = kor + eng + mat;
//		avg = (double)sum/3;
		
//		if(kor<40) {  // 국어, 영어, 수학 중 한 과목이라도  40점 미만이면 불합격 출력
//			System.out.println("불합격"); 
//		}else if(eng<40) {  
//			System.out.println("불합격"); 
//		}else if(mat<40) {   
//			System.out.println("불합격"); 
//		}else if(avg<60) {   // 또는 평균이 60점 이하라면 불합격 출력
//			System.out.println("불합격");
//		}else {             //  전부 포함이 되지않는다면 합격 출력
//			System.out.println("합격");
//				
//		}
		/**
		 * 문제= 나이별로 요금부과
		 * 나이는 정수값으로 입력받는다.
		 * 8세미만 1000원
		 * 14세 미만 2000원
		 * 20세 미만 2500원
		 * 20세 이상 3000원
		 */
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int charge = 0;
		if(age<8) {
			charge=1000;
		} else if(age<14) {
			charge = 2000;
		} else if(age<20) {
			charge = 2500;
		}else {
			charge = 3000;
		}
		System.out.println("요금 :" + charge);
	}

}

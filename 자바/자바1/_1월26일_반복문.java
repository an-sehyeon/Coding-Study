package 자바1;

import java.util.Scanner;

public class _1월26일_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /**
         * for 문은 시작과 끝의 조건이 정해져 있고 일정하게 변하는 값에 따라 반복적으로 처리할 때 사용
         * -기본구조 : 초깃값; 조건식; 증감식
         */
//		for(int a = 1; a <= 20; a++) {
//		System.out.println(a + "");
//	}
		
		/** 문제 = 0부터 90까지 10단위로 출력해보세요
		 * 
		 */
//		for(int a = 0; a <= 90; a+= 10) {  
//			System.out.println(a + "");
//		}
		
		/**
		 * 문제 = 0부터 10까지 더한값을 출력하라
		 */
//		int sum = 0;
		
//      for(int i = 0; i <=10; i++) {
//   	  sum += i;
//      }
//	  System.out.println(sum);

		
		/**
		 * 문제 = 숫자를 5번 입력받고 입력받을때마다 더해지는 식을 작성하세요
		 */
//	    Scanner sc = new Scanner(System.in);
//	    
//	    int sum = 0;
//	    for(int i=0; i < 5; i++) {
//	    	System.out.println("숫자를 5번 입력하세요");
//	    	int num = sc.nextInt();
//	    	sum += num;  // 산술연산 좌변합을 우변값과 더해서 좌변에 대입
//	    	System.out.println("출력 : " + sum);
//	    }
//	    }
	    	



System.out.println("---[1] 레이블이 지정된 루프에서 break---");
label : for(int i=0; i<3; i++) {
	for(int j=0; j<3; j++) {
		if(j==1) {
			System.out.println("j==1일때 label에 대해 break");
		break label;
		}
		System.out.println("i = " + i + "j =" + j);
	}
}
System.out.println("---[2] 레이블이 지정된 루프에서 continue---");
label : for(int i =0; i<3; i++) {
	for(int j=0; j<3; j++) {
		if(j==1) {
			System.out.println("j ==1일때 label에 대해 continue");
			continue label;
		}
		System.out.println("i="+i+"j="+j);
	}
}
}
}


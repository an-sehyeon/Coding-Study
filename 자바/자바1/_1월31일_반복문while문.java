package 자바1;


import java.util.Scanner;

public class _1월31일_반복문while문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1부터 10까지 합을 구하시오
		 */
//		int a = 1;
//		int sum = 0;
//		while(a <=10) {
//			System.out.println("a값 :"+ a);
//			sum = sum + a;
//			a++;
//		}
//		System.out.println("1 부터 10까지 합 : "+ sum);
		
		/**
		 * 1부터 N까지(키보드로부터 입력)수의 합
		 */
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
		
//		while(i <= n) { // 초기값 1이 사용자 입력값(N)보다 작거나 같을때가지 1씩 증가
//			System.out.println("i값 : "+ i);
//		sum = sum+i;
//		i++;
//		}
//		System.out.printf("1부터 %d 까지 합 : %d",n, sum);

		//N부터 M까지의 합(N,M은 키보드로부터 입력) 조건 N>M
//		Scanner sc = new Scanner(System.in);
		
//		int n =sc.nextInt();  //초기값
//		int m =sc.nextInt();  //마지막값
		
//		if(n > m) {   // 
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		int i = n;
//		int sum = 0;
		
//		while(i <= m) {
//			System.out.println("i 값 :" + i);
//			sum = sum+i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d까지 합 : %d",n,m,sum);
		
		//문제 while이용해서 구구단 출력
//		int dan = 2;
//		int i = 1;
//		while(i<=9) {
//			System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			i++;
//		}
		
		//1부터 n까지 수 중의 4의 배수만 출력
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		while(i <= n) {
//			if(i % 4 == 0) {
//				System.out.println("i : " + i);
//			}
//			i++;
//		}
				
		//문제 1부터 n까지의 수 중에 3의 배수의 합만 출력
//		int n = sc.nextInt();  // 사용자의 값을 입력받는다
//		int i = 1;             // 초기값 1을 기준으로 한다.
//		int sum = 0;           //합계를 받을 변수를 0으로 지정한다.
		
//		while(i<=n) {          // 1이 입력값n보다 같거나 작을때까지 1씩 증가시킨다.
//			if( i%3 == 0) {	   //증가시킨 값을 기준으로 3을 나누어서 0이되면 합계에 더해준다.
//				System.out.println("i :" + i);  
//				sum += i;	   // 좌변의 값을 우변의 값과 더해서 나온 결과값을 좌변에 대입한다.
//			}
//			i++;
//		}	System.out.printf("합 : " + sum);
			
			//2단에서 9단까지 while문으로 출력
//		int dan = 2;
//		int i = 1;
//		while(dan <= 9) {		//2가 9보다 작거나 같을때가지 dan변수를 1씩 증가
//			i = 1;				
//			while(i<=9) {		//1이 9보다 작거나 같을때까지 i를 1씩 증가
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
			
		//문제 N단을 입력받아 N단을출력
//		int dan = sc.nextInt();
//		int i = 1;
//		while(i <= 9) {
//			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//			i++;
//			}
		
//				*****	문제 while문으로 별을 출력하라
//				*****  
//		    	*****
//		   		*****
//		int i = 0;
//		int j = 0;
		
//		while(i < 4) {
//			j = 0;
//			while(j < 5) {
//			   System.out.print("*");
//			   j++;
//			}
//			System.out.println();
//			i++;
//		}
		/**
		 * 	*
		 * 	**
		 * 	***
		 * 	****
		 * 	i=줄바꿈	j=별찍기
		 * 
		 * 
		 */
//		int i = 0;
//		int j = 0;
		
//		while(i<5) {
//			j =0;
//			while(j < i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
	}

}


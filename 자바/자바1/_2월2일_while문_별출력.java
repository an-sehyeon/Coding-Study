package 자바1;

import java.util.Scanner;

public class _2월2일_while문_별출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//높이만큼의 직각삼각형별이 출력시켜라
		//높이 입력 : 3
		Scanner sc = new Scanner(System.in); 
//		int h = sc.nextInt();          //입력변수, 줄 출력 변수, 별 출력 변수
//		int i = 0;					  // 줄 수
//		int j = 0;					  // 별 수
		
//		while(i < h ) {		//줄 수가 사용자 입력값보다 작을때까지 한줄씩 출력 시켜라
//			j = 0;
//			while(j <= i) {		//줄 수가 증가될때마다 줄 수 만큼 별을 한개씩 증가시켜라
				
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
//		int i = 0;
//		int j = 0;
//		while(i < 4) {
//			j = 0;
//			while(j <= 3 - i) {		//별의 개수가 줄의 수 만큼 작아지면 별의 개수도 감소된다.
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		
		
//		int h = sc.nextInt();
//		int i = 0;
//		int j = 0;
		
//		while(i < h) {
//			j = 0;
//			while(j <= (h -1) - i) {		//별이 줄 수 만큼 증가 될때마다 별을 한개씩 감소 시킨다.
//				System.out.print("*");
//				j++;
//			}
//		System.out.println();
//		i++;
//		}
	
		
		
		
//		int i = 0;	//줄
//		int j = 0;	//공백
//		int k = 0;	//별
		
//		while(i < 4) {	// 줄 수가 4보다 작을때까지 1씩 증가 시켜줘라
			
//			j = 0;
//			while(j <= 2 - i) {		// 공백을 3칸으로 설정하고 i가 늘어난만큼 공백이 줄어든다.
//				System.out.print(" ");
//				j++;
//			}
			
//			k = 0;
//			while(k <= 2 * i) {		//공백을 계산해서 줄 수 만큼 별을 출력해준다.
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
	
		
		
		
//		int h = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		int k = 0;
		
//		while(i < h) {		// i가 사용자 입력값보다 작을때까지 줄을 1씩 증가 시켜준다.
			
//			j = 0;
//			while(j <= h-2 - i) {		// 공백을 사용자 입력 값으로 설정하고 i가 늘어난만큼 공백이 줄어든다.
//				System.out.print(" ");
//				j++;
//			}
			
//			k = 0;
//			while(k <= 2 * i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
	
		
		
		
		
		int h = sc.nextInt();
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < h) {		//i가 사용자 입력값보다 작을때까지 줄을 1씩 증가 시켜준다.
			
			j = 0;
			while(j <= i -1) {		// 공백을 사용자 입력 값으로 설정하고 i가 늘어난만큼 공백이 늘어난다.
				System.out.print(" ");
			j++;
			}
			
			k = 0;
			while(k <= (h - 1) * 2 - 2 * i) {		//공백을 계산해서 줄수만큼 별 개수를 줄여준다.
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
	}

}


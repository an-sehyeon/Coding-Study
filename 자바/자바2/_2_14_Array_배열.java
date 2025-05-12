package 자바2;

import java.util.Scanner;

/**
 * 배열의 공간에 사용자 입력값을 넣는 코드 작성
 *
 */

public class _2_14_Array_배열 {

	public static void main(String[] args) {
//		int arr[] = new int [3]; // 1차원 배열
//		int arrr [행][열] = new int [3][5];// 2차원 배열

//		길이가 3인 int형 1차원 배열 생성
		Scanner sc = new Scanner(System.in);
//		int arr1[] = new int[3];
//		arr1[0] = sc.nextInt();
//		arr1[1] = sc.nextInt();
//		arr1[2] = sc.nextInt();
		
//		System.out.println("길이 : " + arr1.length);
//		System.out.println("arr1[0] = " + arr1[0]);
//		System.out.println("arr1[1] = " + arr1[1]);
//		System.out.println("arr1[2] = " + arr1[2]);
		
		//배열의 공간에 값이 들어가 있는 것을 확인하는 코드
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
//		
//		
//		//배열의 공간에 값을 저장하는 코드
//		for(int num : arr1) {
//			System.out.println(num);
//		}
		
//		double arr2[] = {10.5, 11.4, 15.3, 33.5};
//		System.out.println("길이 : " + arr2.length);
		
		//문제 : 5칸 int형 배열 생성후 각각 키보드부터 값을 받아 순서대로 저장한 다음 배열에 있는 모든 요소안의 숫자 합을 출력해보세요
		int arr1[] = new int[5];
		
		for(int i = 0; i < arr1.length; i++) {
		arr1[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int num : arr1) {
			sum+=num;
			System.out.println("SUM : " + sum);
		}
		
	}
}

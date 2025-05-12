package 자바2;

public class _2_14_MultiArray_2차원배열 {

	public static void main(String[] args) {
//		2차원 배열은 [행],[열]로 구성이 되어있다.
//		1차원 배열의 배열요소 단위는 자료형 단위이다.
//		2차원 배열의 배열요소 단위는 일차원 배열이다.
	
		int arr1[][] = new int [5][5];
		arr1[0][0] = 10;
		arr1[1][1] = 20;
		arr1[2][2] = 30;
		arr1[3][3] = 40;
		arr1[4][4] = 30;
	
//		arr1[1][0] = 11;
//		arr1[1][1] = 22;
//		arr1[1][2] = 33;

		System.out.println("행 개수 : " +  arr1.length);
		System.out.println("0번 행의 열 개수 : " +  arr1[0].length);
		System.out.println("1번 행의 열 개수 : " +  arr1[1].length);
		
		
		
	}

}

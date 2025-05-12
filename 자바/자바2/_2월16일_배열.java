package 자바2;


/**
 *다음 2개의 static 가진 ArrayUtil 클래스를 만들어보자
 *다음 코드의 실행 결과를 참고하여 concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라. 
 *
 */

class ArrayUtil{
	
	//배열 a와 b를 연결한 새로운 배열을 리턴
		
	public static int []concat(int a[], int b[]){
		int len = a.length + b.length;		//int len을 a, b의 배열길이의 합
		int arr[]= new int[len];			//배열 arr을 len 길이만큼 대입
		int i = 0;

		while(i < a.length) {				//a배열의 길이만큼 while문을 실행해서 a배열의 길이만큼 arr배열의 대입
			arr[i] = a[i];
			i++;
		}
		while(i < len) {
			arr[i] = b[i - a.length];
			i++;
		}
			
		return arr;
	
		
	}
}

public class _2월16일_배열 {
	public static void main(String[] args) {
		int array1[] = {1,5,7,9};
		int array2[] = {3,6,-1,100,77};
		int array3[] = ArrayUtil.concat(array1,  array2);
		System.out.print(array3);
				
				
	
		}
	}
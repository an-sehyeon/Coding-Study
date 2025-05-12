package 자바1;

import java.util.Scanner;

class sum {	 
	Scanner sc = new Scanner(System.in);
	
	int sum1(int x, int y) { // 매개변수를 사용하기 위해서는 return이 있어야 한다.
		return x + y;
	}
//	int sum2() {
//		System.out.print("SUM2(x, y): ");
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		return x + y;
	
	void sum3() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println("SUM4(): " + (x+y+z));
	}
	
}

public class _2월3일_매개변수 {

	public static void main(String[] args) {
		sum a = new sum();
		
		int r1 = a.sum1(10, 20);
		System.out.println("R1: " + r1);
		
//		int r2 = a.sum2();
//		System.out.println("R2: " + r2);
		
		a.sum3();
	}

}

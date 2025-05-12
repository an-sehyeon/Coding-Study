package 자바1;



import java.util.Scanner;

public class _1월20일_If {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
		
//		if (age >= 8) {           // "()"안에 조건식, "{}"안에 명령문
//			System.out.println("학교에 다닙니다.");
//		} else {
//			System.out.println("학교에 안다닙니다.");
//		}
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num %2 == 0) { 
			System.out.println("짝수입니다.");
	} else {
		System.out.println("홀수입니다.");
	}
	}
}

package Project;

import java.util.Scanner;

public class project2 {
public static void main(String[] args) {
	System.out.println("총 금액 : " );
	System.out.println("받은 금액 : ");
	Scanner sc = new Scanner(System.in);
	int pay = sc.nextInt();
	int sum = sc.nextInt();
	int num = pay - sum;
	
	System.out.println("거스름돈 : " + num + "원");
	
	System.out.println("오만원권" + num/50000 +"매");
	num%= 50000;
	
	System.out.println("일만원권" + num/10000 +"매");
	num%= 10000;
	
	System.out.println("오천원권" + num/5000 +"매");
	num%= 5000;
	
	System.out.println("천원권" + num/1000 +"매");
	num%= 1000;

	System.out.println("오백원동전" + num/500 +"개");
	num%= 500;
	
	System.out.println("일백원동전" + num/100 +"개");
	num%= 100;
	
	System.out.println("오십원동전" + num/50 +"개");
	num%= 50;
	
	System.out.println("십원동전" + num/10 +"개");
	num%= 10;
	
	System.out.println("일원동전" + num/1 +"개");
	num%= 1;
}
}

package day04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// Run > Run Configurations.. > argumets�� > java UserInput > 20240813 Chang 3
		
		// TODO Auto-generated method stub
		// 1. ���� �� �Է��ϱ�
		System.out.println("�۾����� : " + args[0]);

		// �̸�(�۾���)�� �۾����� ����ϱ�
		System.out.println("�̸�(�۾���) : " + args[1] + ", �۾����� : " + args[2]);
		
		// ���� �ε��� ��� �� ����(����), ���ܴ� ������ ���� ����ڰ� Ŀ�� ������ ����
		// System.out.println("�̰Ŵ� ? " + args[3]);   
		
		System.out.println("");
		
		// 2. Scanner ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���>>> : ");
		String name = sc.next();    // ���ڿ��� �Է¹ޱ�
		System.out.println("�� ����� �� ������ " + name + "��?");
		
		System.out.println("");
		
		System.out.print("���� 1�� �Է��ϼ���>>> : ");
		String a1 = sc.next();
		System.out.print("���� 1�� �Է��ϼ���>>> : ");
		int a2 = sc.nextInt();
		System.out.println("a1 : " + (a1 + 1));		// sc.next (����)�� �Է¹޾Ƽ� �Է¹��� ���� 1�� �ٿ���
		System.out.println("a2 : " + (a2 + 1));		// sc.nextint (����)�� �Է¹޾Ƽ� �Է¹��� ���� 1�� ������
		
	
	}
}

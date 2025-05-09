

package day05;

import java.util.Random;
import java.util.Scanner;

import util.MyUtil;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// MyUtilŬ������ p�޼��带 ���
		MyUtil.p(MyUtil.RED + "If Example" + MyUtil.END);	// "If Example"�� ���������� ����ϰ� ���� ������ �⺻������ �缳��
		MyUtil.p("");
		
		Random rd = new Random();		// Random ��ü ����
		int a = rd.nextInt(151);		// 0���� 150������ ������ ���� ����
	
		
		if(a > 100) {			// �������� ���� ������ a�� 100���� ũ�ٸ�?
			MyUtil.p(MyUtil.RED + "a�� �ſ� Ů�ϴ�. : " + a + MyUtil.END);	// a�� ���� �ſ� ũ�ٰ� ���������� ���
		}else if(a > 50) {		// a�� 50���� ũ�� 100���� ���ų� �۴ٸ�?
			MyUtil.p(MyUtil.GREEN + "a�� Ů�ϴ�. : " + a + MyUtil.END);	// a�� ���� ũ�ٰ� �ʷϻ����� ���
		}else {					// ���� ������ ��� �ƴ϶��?
			MyUtil.p("a�� ���� ũ�� �ʽ��ϴ�. : " + a);						// a�� ���� ũ�� �ʴٰ� ���
		}
		
		
		
		
		// nesed
		// ����� ���� ������ ��� 60�� �̻��̸� Pass, �ƴϸ� Fail
		// ���� : **��, ���� : **��, Pass or Fail
		// ���� : �� ������ �����Ͻÿ�.
		MyUtil.p("");
		MyUtil.p("ù��° ���");			// ��ø �ݺ���
		
		int eng = rd.nextInt(101);		// 0���� 100���� ������ �������� �޾� ����eng�� ����
		int mat = rd.nextInt(101);		// 0���� 100���� ������ �������� �޾� ����mat�� ����
		
		if(eng >= 60) {
			if(mat >= 60) {
				MyUtil.p(MyUtil.GREEN + "���� : " + eng + "��, ���� : " + mat + "�� ��� : Pass " + MyUtil.END);
			}else {
				MyUtil.p(MyUtil.GREEN + "���� : " + eng + "��, ���� : " + mat + "�� ��� : Fail " + MyUtil.END);
			}
		}	
		else {
				MyUtil.p(MyUtil.GREEN + "���� : " + eng + "��, ���� : " + mat + "�� ��� : Fail " + MyUtil.END);
			
		}

		
		
		
		
		MyUtil.p("");
		MyUtil.p("�ι�° ���");
		
		String PF = "";
		if(eng >= 60)
			if(mat>= 60)
				PF = "Pass";
			else
				PF = "Fail";
		else
			PF = "Fail";
		
		MyUtil.p(MyUtil.RED + "���� : " + eng + "��, ���� : " + mat + "��" + PF + MyUtil.END);
						
		
		
		
		
		
		MyUtil.p("");
		MyUtil.p("����° ���");			// ���迬���� ���
		
		int eng1 = rd.nextInt(101);		// 0���� 100���� ������ �������� �޾� ����eng1�� ����
		int mat1 = rd.nextInt(101);		// 0���� 100���� ������ �������� �޾� ����mat1�� ����
		
		if(eng1 >= 60 && mat1 >= 60) {	// �Է¹��� eng1�� mat1�� ���� ��� 60�̻��̶��?
			MyUtil.p(MyUtil.GREEN + "���� : " + eng1 + "��, ���� : " + mat1 + "�� ��� : Pass " + MyUtil.END);		
		}else {							// �� ������ �ƴ϶��?							
			MyUtil.p(MyUtil.RED + "���� : " + eng1 + "��, ���� : " + mat1 + "�� ��� : Fail " + MyUtil.END);			
		}
		
		
		if(eng1 < 60 || mat1 < 60) {	// �Է¹��� eng1�� mat1�� ���� ��� 60�̸��̶��?
			MyUtil.p(MyUtil.RED + "���� : " + eng1 + "��, ���� : " + mat1 + "�� ��� : Fail " + MyUtil.END);		
		}else {							// �� ������ �ƴ϶��?							
			MyUtil.p(MyUtil.GREEN + "���� : " + eng1 + "��, ���� : " + mat1 + "�� ��� : Pass " + MyUtil.END);			
		}
		
		
		
		
		
		
		
		
		
		MyUtil.p("");
		MyUtil.p("Scanner �̿�");
		
		Scanner sc = new Scanner(System.in);		// ����ڷκ��� �Է��� �ޱ� ���� ��ü ����
		
		MyUtil.p("���������� �Է��ϼ���>>> : ");			
		int eng3 = sc.nextInt();						// ����ڷκ��� ���������� ������ �Է¹޾� ����eng3�� ����
		MyUtil.p("���������� �Է��ϼ���>>> : ");
		int mat3 = sc.nextInt();						// ����ڷκ��� ���������� ������ �Է¹޾� ����mat3�� ����
		
		if(eng3 >= 60 && mat3 >= 60) {		// �Է¹��� eng3�� mat3�� ���� ��� 60�̻��̶��?
			MyUtil.p(MyUtil.GREEN + "���� : " + eng3 + "��, ���� : " + mat3 + "�� ��� : Pass " + MyUtil.END);		// Pass �ʷϻ����� ���
		}else {								// �� ������ �ƴ϶��?
			MyUtil.p(MyUtil.GREEN + "���� : " + eng3 + "��, ���� : " + mat3 + "�� ��� : Pass " + MyUtil.END);			// Fail ���������� ���
		}
		
		
		
		
		
		
	}

}

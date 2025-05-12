package day08;

import util.MyUtil;

public class Person {
	
	// Field
	// Instance ���� (��ü���� ���������� �����Ǵ� ����)
	public int age;
	String name = "Default";		// �̸��� �⺻���� "Default"�� ����
	
	// Class ����(static) (��� ��ü�� �����ϴ� ����)
	public static String place = "The Earth";		// ��� Person ��ü�� �����ϴ� ����
	public static int numofman = 0;					// ������ Person ��ü�� ���� ���� ����
	
	// Constructor (������)
	// ���� Ÿ������ ���� �� �ִ�.	
	Person(){						// �⺻ ������, ���� �ȹ���
		MyUtil.p("�ΰ��� ź���Ͽ�����");	// �����ɶ����� �޽����� ���
		numofman++;					// Person��ü�� �����ɶ����� numofman ���� 1�� ������
	}

	
	Person(String x){		// �̸��� ���ڷ� �޴� ������
		name = x;			// ���޹��� ���ڰ��� name�� ����
		MyUtil.p("�ΰ� " + name + "��(��) ź���Ͽ�����.");
		numofman++;			// Person��ü�� �����ɶ����� numofman ���� 1�� ������
		
	}
	
	
	Person(String x, int n){	// �̸��� ���̸� ���ڷ� �޴� ������
		name = x;				// ���޹��� ���ڰ��� name�� ����
		age = n;				// ���޹��� ���ڰ��� age�� ����
		MyUtil.p("�ΰ� " + name + "(" + age + "��)��(��) ź���Ͽ�����.");
		numofman++;				// Person��ü�� �����ɶ����� numofman ���� 1�� ������
		
	}
	
	public void introduce() {
		System.out.println("�� " + name + "��(��) " + age + "���Դϴ�. ���� �������ϴ�.");
	}
}

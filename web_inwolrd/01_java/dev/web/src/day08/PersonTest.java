package day08;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Person ��ü p1���� (�⺻ ������ ȣ��)
		Person p1 = new Person();								// Person Ŭ������ �⺻ ������ ȣ��
		System.out.println("��������� �ΰ� �� : " + p1.numofman);	// ������� �������� Person ��ü�� �� ���
		System.out.println("�̸� : " + p1.name + " ���� : " + p1.age); // p1��ü�� �ʱ� �̸��� ���� ���
		p1.name = "Steven King";						// p1 ��ü�� name �ʵ带 "Steven King"���� ����
		p1.age = 60;									// p1 ��ü�� age �ʵ带 60���� ����
		System.out.println("�̸� : " + p1.name + " ���� : " + p1.age); // ����� p1 ��ü�� �̸��� ���� ���
		
		
		Person p2 = new Person();
		System.out.println("��������� �ΰ� �� : " + p2.numofman);
		
	
		System.out.println("��������� �ΰ� �� : " + Person.numofman);
	
		
		Person p3 = new Person("�Ƶ�����");		// �Ƶ������� �̸��� ���� Person ��ü ����
		System.out.println("��������� �ΰ� �� : " + Person.numofman);
		
		Person p4 = new Person("�����", 40);		// ������̶�� �̸��� 40�� ���̸� ���� Person ��ü ����
		
		p1.introduce();		// p1��ü�� �̸��� ���̸� ����ϴ� �޼��� ȣ��
		p2.introduce();		// p2��ü�� �̸��� ���̸� ����ϴ� �޼��� ȣ��
		p3.introduce();		// p3��ü�� �̸��� ���̸� ����ϴ� �޼��� ȣ��
		p4.introduce();		// p4��ü�� �̸��� ���̸� ����ϴ� �޼��� ȣ��
	}

}

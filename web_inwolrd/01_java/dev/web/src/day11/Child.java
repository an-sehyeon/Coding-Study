package day11;

import util.MyUtil;

public class Child extends Parent{							// ChildŬ������ ParentŬ���� ���

	String name = "Child";									// �ν��Ͻ� ���� (�ڽ� Ŭ�������� ���ǵ� name)
	
	Child(){
		MyUtil.p("Child Created");							// MyUtilŬ������ p�޼��带 ���� ���ڿ� ���
	}
	
	void print() {											// print �޼��� ȣ��� �Ʒ� �ڵ� ����
		String name = "Super Child";						// ���� ���� name�� "Super Child"�� �ʱ�ȭ (�� �޼��� �������� ��ȿ)
		MyUtil.p("name = " + name);							// ���� ���� name�� ���
		MyUtil.p("this.name = " + this.name);				// this : ���� ��ü���� name�� Super Child ���
		MyUtil.p("familyName = " + this.familyName);		// ��ӹ��� �θ�Ŭ������ �ִ� ParentŬ������ familyNmae ���
		MyUtil.p("Super.name = " + super.name);				// �θ�Ŭ������ name ���� ���
	}
	
	@Override												// �θ�Ŭ������ �޼��带 �������ϱ� ����
	void eat() {											// ParentŬ������ eat �޼��� ������(�������̵�)
		super.eat();										// ParentŬ������ eat��ü ȣ��
		MyUtil.p("��" + this.name + "�� ���� �Ļ縦 �մϴ�.");		// �ڽ�Ŭ������ �ν��Ͻ� ������ name(Child)�� ����Ͽ� �߰����� �޽��� ���
		MyUtil.p("���̽�ũ�� �Ա�");								// �ڽ�Ŭ�������� �߰��� �޽���
		MyUtil.p("�ҷ���ǰ ������ �Ա�");							// �ڽ�Ŭ�������� �߰��� �޽���
	}
	
}

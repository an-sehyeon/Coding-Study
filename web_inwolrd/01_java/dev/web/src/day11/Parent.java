package day11;

import util.MyUtil;

public class Parent {											// �θ�Ŭ������ Parent Ŭ���� ����

	String name = "Parent";										// name�� PrentŬ������ �ν��Ͻ� �����μ� "Parent"�� �ʱ�ȭ 
	String familyName = "Leopard";								// familyName�� PrentŬ������ �ν��Ͻ� �����μ� "Leopard"�� �ʱ�ȭ
	
	Parent(){													// ParentŬ������ �⺻ ������ ȣ�� �� ����� �ڵ�
		MyUtil.p("Parent Created");								// �޽��� ���
	}
	
	void eat() {												// eat�޼��� ȣ�� �� �Ʒ� �ڵ� ���
		MyUtil.p("��" + this.name + "�� ���� �Ļ縦 �մϴ�.");			// this.name = Parent Ŭ�������� name�� Parent�� ����Ŵ
		MyUtil.p("�� �Ա�");
		MyUtil.p("�� �Ա�");
		MyUtil.p("����� �Ա�");
		MyUtil.p("��Ÿ�߿��� ��â �Ա�");
	
	}
	
}

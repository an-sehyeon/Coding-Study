package day13;

import util.MyUtil;

public class InterMain {										// MyClass�� MyInterface�� ����� �׽�Ʈ�ϴ� ���� Ŭ����

	public static void main(String[] args) {

		MyClass mc = new MyClass();								// MyClass�� �⺻ �����ڸ� ȣ���Ͽ� �ν��Ͻ� mc�� ����
		MyUtil.p("mc.aaa = " + mc.aaa);							// MyClass�� �ν��Ͻ� ������ aaa ���(�� : 100)
//		MyUtil.p("MyClass.aaa = " + MyClass.aaa); 				// MyClass���� ���Ӱ� �����ϴ� ���  static�Ӽ��� �����
		MyUtil.p("MyInterface.aaa = " + MyInterface.aaa);		// MyInterface���� ������ aaa���
		
		mc.dMethod();											// MyClass�� default �޼��� dMethod ȣ��
		mc.dMethod2();											// MyClass���� �������� dMethod2 ȣ��
		
//		mc.sMethod();											// MyClass������ static �޼��� ȣ��X
		MyInterface.sMethod();									// MyInterface�� static �޼��� ȣ��
		
		System.out.println("\n");
//		MyInterface mi = new MyInterface();						// �������̽��� ���� �ν��Ͻ��� ���� �� ����
		MyInterface mi = new MyClass();							// MyClass�� ���� MyInterface Ÿ���� ��ü mi ����
		mi.dMethod2();											// static �޼���� �������̽������� ȣ�� ����
//		mi.sMethod();
	}

}

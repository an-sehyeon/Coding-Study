package day13;

import util.MyUtil;

public class MyClass implements MyInterface{				// MyClass Ŭ������ MyInterface �������̽��� ����

	public int aaa = 1000;									// aaa�� MyClass�� �ν��Ͻ� ������, 1000���� �ʱ�ȭ
															// �������̽��� aaa�ʹ� ������ ����
	
	public void myMethod() {								// �������̽����� ������ myMethod ����
		
	}
	
	public void dMethod2() {								// �������̽��� default �޼��带 ���Ӱ� �����ϸ�, ���� default�� �������.
		MyUtil.p("[dMethod2] �� ������ �ʴ´� ���Ӱ� ������ ��");
	}

}

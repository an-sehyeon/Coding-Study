package day13;

import util.MyUtil;

public interface MyInterface {					// MyInterface��� �������̽� ����
	
	int aaa = 500;								// �������̽����� ������ �����ϸ� �ڵ����� static�� �ȴ�.
	
	void myMethod();							// �������̽����� ����� �߻� �޼���, ��ü���� ������ ����X, �Ű�����X �� � �Էµ� ��������
												// �������̽��� �����ϴ� Ŭ�������� ��ü���� ������ �ݵ�� �����ؾߵ�
	
	default void dMethod() {					// default�� �������̽��� �޼��带 �����Ѵ�.
		MyUtil.p("[dMethod] Called");
	}
	
	default void dMethod2() {					// �ι�° default �޼���
		MyUtil.p("[dMethod2] Called");
	}
	
	static void sMethod() {						// static �޼���� �������̽��� ���� �����Ǹ�, �������̽� ��ü���� ȣ�� ����
		MyUtil.p("[sMethod] ���� �� �θ��̾��?");
	}

}

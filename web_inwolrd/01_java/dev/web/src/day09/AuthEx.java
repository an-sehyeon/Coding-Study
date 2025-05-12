package day09;

import util.MyUtil;

public class AuthEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass c = new MyClass();				// MyClassŬ������ �����ڸ� �̿��� ��ü c ����
		MyUtil.cp("Auth Example");				// MyUtilŬ������ cp �޼��带 �̿��� ���ڿ� ���
		MyUtil.p("c.var1 = " + c.var1);			// MyClass�� var1 ȣ��
		c.var1 = 100;							// ������ �ܺο��� �ٲ� �� �ִ�? => ���輺 ����
		MyUtil.p("c.var1 = " + c.var1);			// ����� var1 �� ���
		
		//MyUtil.p("c.var2 = " + c.var2); 		// var2�� private �����̹Ƿ� �ܺο��� ������ �� ���� ������ ���� �߻�
		MyUtil.p("c.var2 = " + c.getVar2());	// var2�� getVar2 �޼��带 ���������� �����Ͽ� �� ���
		c.setVar2(5000);						// setVar2 �޼��带 �̿��� var2 ���� 5000���� ���� 
		MyUtil.p("c.var2 = " + c.getVar2());	// ����� var2 Ȯ��
		
	}

}

class MyClass{
	// �ν��Ͻ� ���� ����
	public int var1 = 3;					// public ���������ڷ� ����� var1, �ܺο��� ���� ���� ����
	private int var2 = 10;					// private ���������ڷ� ����� var2, �ܺο��� ���� �Ұ�

	// @Getter
	public int getVar2() {					// var2�� ����ϴ� ���
		return var2;
	}
	
	// @Setter
	public void setVar2(int var) {			// var2�� �ٲٰ� ���� �� ���
		var2 = var;
	}
	
	// ������ ��κ� private
	// => �������� set/get �޼��尡 ������ ���ɼ��� ����
	// ������ 100����..... => set/get �޼��带 ���� 100���� ����??
	
	// getter / setter�� ���� Spring���� lombok ���̺귯���� ���� 
	// �ڵ����� ��ų �� �ִ�.

}
package day13;

import util.MyUtil;

public class CalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyUtil.cp(MyUtil.BOLD + "Super Calculator De Jesus");		// MyUtilŬ������ cp�޼��带 ȣ���Ͽ� ���ڿ� ���
		
//		CalculatorDummy c = new CalculatorDummy();					// CalculatorDummyŬ������ �⺻ �����ڸ� ȣ���Ͽ� �ν��Ͻ� c�� ����
		Calculator c = new Calculator();							// CalculatorŬ������ �⺻ �����ڸ� ȣ���Ͽ� �ν��Ͻ� c�� ����
			
		c.setOperand(10, 21, 30);									// setOperand �޼��带 ȣ���Ͽ� ���꿡 �ʿ��� �� ���� ���� ����
		MyUtil.p("�հ�� " + c.sum());								// MyUtilŬ������ p�޼��� ȣ���Ͽ� ���ڿ���, �����ϱ� ���� �����س��� ���� ���� ���
		MyUtil.p("����� " + c.avg());								// MyUtilŬ������ p�޼��� ȣ���Ͽ� ���ڿ���, �����ϱ� ���� �����س��� ���� ��� ���
		
		
	}

}

class CalculatorDummy implements CalculatorI{						// CalculatorDummy Ŭ������ CalculatorI �������̽� ����

	@Override														// �׽�Ʈ ����		
	public void setOperand(int aaa, int bbb, int ccc) {				// � ���� ���޵Ǵ��� �ƹ� ������ ���� �ʴ� �޼���
		
	}

	@Override
	public int sum() {												// ���ڰ��� ��� �ֵ� 100�� ����
		return 100;
	}

	@Override
	public double avg() {										 	// ���ڰ��� ��� �ֵ� 30.0�� ����
		return 30.0;
	}
}
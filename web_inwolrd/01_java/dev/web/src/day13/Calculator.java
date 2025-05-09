package day13;

public class Calculator implements CalculatorI{			// Calculator Ŭ������ CalculatorI �������̽��� ����

	int left, right, center;							// �� ���� �ǿ����ڸ� ������ �ν��Ͻ� ���� ����
	
	@Override
	public void setOperand(int f, int s, int t) {		// CalculatorI �������̽����� ���ǵ� �޼��� ���� 
														// ���޹��� �� ���� ���� �ν��Ͻ� ������ ����
		left = f;										 
		right = s;
		center = t;
	}

	@Override
	public int sum() {									// sum�Լ��� ������ �� ���� �ǿ����ڸ� ���ϴ� ���
		return left + right + center;					// ������ ����					
	}

	@Override
	public double avg() {								// avg�Լ��� ����� ���� ����� �����ִ� ���
		return (int)(sum() / 3D * 1000) / 1000D;		// ����� ���� �Ҽ��� ��° �ڸ����� �ݿø��Ͽ� ����
	}

	
	
}

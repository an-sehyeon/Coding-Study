package day15;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();								// Calculator��ü�� ������ c������ ���� 
		c.setOperand(100, 27);											// setOperand ����� Ȱ���� �ǿ����� ����
		c.divide1();													// 0���� ������, ���� �߻� ���ɼ� ����	
		
		c.setOperand(100, 0);
		// c.divide1();  												// 0 �����⿡ ���� ��� �ȵǾ��־� ���α׷� ���� ����
		c.divide2();													// ����ó���� ������
		
		try {
			c.divide3();												// ���� �߻� ���ɼ� �ִ� ������
		}
		catch(Exception e) { e.printStackTrace(); }						// ���� �߻��� �����ؼ� ���
		
		
		c.setOperand(100000, 0);										// ���� �ǿ����� 100000���� ����
		try {
			c.divide4();												// ����ڰ� ������ ���� �߻� ���ɼ� �ִ� ������
		}
		catch(Exception e) { e.printStackTrace(); }
		
		System.out.println("���α׷� �Ϻ� ����");
	}
	
	void test() throws Exception {										// test �޼���� Calculator��ü�� �����ϰ� divide3() �޼��带 ȣ��
		Calculator c = new Calculator();
		c.divide3();
	}

}

class Calculator {
	int left, right;																		// ���ʰ� ������ �ǿ����ڸ� ���� ������ ����
	
	public void setOperand(int left, int right) {											// �ǿ����ڸ� �����ϴ� �޼���
		this.left = left;																	// ���� �ǿ����� left������ ����		
		this.right = right;																	// ������ �ǿ����� right������ ����
	}
	
	// ����� ������ (���� ó�� ����)
	public void divide1() {
		System.out.println("[divide()] " + left/right);										// ���� �ǿ����� ������ ������ �ǿ�����, ��� ���
	}
	
	// �Ϻ��� ���� ���
	public void divide2() {
		try {
			System.out.println("[divide()] " + left/right);									// ������ ��� ���
		}
		catch(ArithmeticException e) {														// ���� �߻� �� ó�� 
			System.out.println("[divide()] �Ƹ�����ƽ ���� �߻�!");
			System.out.println("[divide()][B001] ���� ������ : " + left + ", " + right);
			System.out.println("[divide()] ����̴� ���� ��");
			System.out.println(e.getMessage());												// ���� �޽��� ���
			System.out.println(e.toString());												// ���� ���� ���	
			e.printStackTrace();															// ���� ���� �����ؼ� ���
		}
	}
	
	// ���� �Ǵ� ���
	public void divide3() throws Exception {  												// �� �� ���ɼ� �ִ�, ���� �� �� �ִ�
		System.out.println("[divide()] " + left/right);
	}
	
	// �����(������, ��)�� ���ܸ� ������ �߻���Ű�� �޼���
	public void divide4() throws Exception {
		if(left >= 10000) 																	// left�� 10000 �̻��� ��� �����⸦ �ϰ� ���� �ʴٸ�?
			throw new Exception("10000 �̻� �Է��ϼ̽��ϴ� ��������?");								// ���� �߻�
		
		System.out.println("[divide()] " + left/right);										// ������ ��� ���
	}
}









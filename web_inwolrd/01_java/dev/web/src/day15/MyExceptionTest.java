package day15;

public class MyExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� ó�� �׽�Ʈ�� ���� �پ��� û�� �ݾ����� sendReceipt�� ȣ��
		try {
			// sendReceipt(400000000);
			// sendReceipt(300);
			sendReceipt(2000000);												// sendReceipt�޼��带 ȣ���� ���ڰ� 2000000����, �������� �ݾ��̹Ƿ� ����X
		}
		catch(Exception e) {															
			e.printStackTrace();												// ���� �߻��� �ش� ���ܿ� ���� ���� ���
			
			// ����ó�� ���DB�� �Է� �� �ļ� ��ġ ����
			try {
				// �����ͺ��̽��� ������ �߰�
				// �� ��� ��ø ����ó���� �Ͼ �� ����
			}
			catch(Exception e2) { e2.printStackTrace(); }						// ���� catch ��� �ȿ��� �ٸ� ���� ��Ȳ�� ���,
																				// ù��° ���� ó�� ���߿� �� �ٸ� ���ܰ� �߻��� ��� ó���ϱ� ���� ���		
		}
		finally {																// ���� �߻����ο� ������� �ݵ�� ����Ǵ� �ڵ�
			System.out.println("[finally] ���������� ������ ���� �����ض�");
		}
		
		System.out.println("[ȸ�� ���α׷�] ���� ����");								// ���α׷��� ���������� ������� �˸��� �޽��� ���
	}

	public static void sendReceipt(int amt) throws MyException {				// û���ݾ�(amt)�� ���� ���ܸ� �߻���Ű�� �޼���
		if(amt > 100000000)														// û�� �ݾ��� 100000000���� �ʰ��ϸ� ���� �߻�
			throw new MyException("[B001] ������ û���ݾ� �� ���� ����");
		else if(amt < 1000)														// û�� �ݾ��� 1000�� �̸��̸� ���� �߻�	
			throw new MyException("[B002] �ݾ� " + amt + "���� �� ���ְ� ��Ծ�");
		
		System.out.println("[sendReceipt()] " + amt + "�� ����ó��");				// ���ܰ� �߻����� ������ �ڵ� ����
	}
}

// ����� ���� ���� Ŭ����, Exception�� ��ӹ���
class MyException extends Exception {
	MyException(String msg){													// ���� �߻��� �Ʒ� �޽����� ����ϰ� �߰� �α׸� ����ϴ� ������
		super(msg);																// �θ� Ŭ������ Exception�� �޽��� ����
		System.out.println("[MyException] ������ ���");
		System.out.println("[MyException] �޽��� �α� ���");
		System.out.println("[MyException] ��� ���� ����");
		System.out.println("[MyException] ���� ��� ����");
		System.out.println("[MyException] ������ ��� ���� ���");
		System.out.println("[MyException] ����Կ��� ����");
	}
}

package day11;

public class SuperTest {							// ParentŬ������ ChildŬ������ test�ϱ����� SuperTest Ŭ���� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();					// p : ParentŬ������ ��ü ���� �� Parent ������ ȣ�� 
		System.out.println("\n");					
		Child c = new Child();						// c : ChildŬ������ ��ü ���� �� Child ������ ȣ��
		System.out.println("\n");	
		c.print();									// ChildŬ������ print �޼��� ȣ��
		System.out.println("\n");
		p.eat();									// ParentŬ������ eat �޼��� ȣ��
		System.out.println("\n");
		c.eat();									// ChildŬ�������� �������̵�� eat �޼��� ȣ�� (�θ� �޼��忡�� �߰��� �ڵ���� ���)
		
	}

}


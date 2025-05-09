package day17;

import java.util.ArrayList;

public class LambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Standard
		CalculableClass cc = new CalculableClass();									// CalculableClass ��ü�� cc������ ����
		cc.calculate(100, 1000);													// calculatge�޼��带 ȣ���� 100, 1000 �Ű����� ����
		// ������ �����Ǿ���... �ٲ� => ��ü�� �ٲ�� ��
		
		// 2. Anonymous Instance(�͸�ü)
		Calculable c1 = new Calculable() {											// Calculable �������̽��� �����ϴ� �͸� ��ü�� ���� �� calculate �޼��带 �������̵�
			public void calculate(int x, int y) {
				System.out.println("[�͸�ü-�Ϲ�] " + (x*y));						
			}
		};
		c1.calculate(100, 1000);													// �͸�ü�� calculate �޼��� ȣ��
		
		// 3. Lambda I : ���ٽ����� �����ϸ� �ڵ����� �޼���� ����
		// �������̽��� �ݵ�� 1�� (������ �ؾ��ϴ�) �޼��常 �ִٸ� ����
		Calculable c2 = (x, y) -> { System.out.println("[��������] " + (x*y)); };		
		c2.calculate(100, 1000);
		
		// 4. Lambda II : return ���� �ִ� ���
		CalculableReturn c3 = (x) -> { return 3.14 * x * 2; };
		System.out.println("[���ٸ���] " + c3.calculate(100));
		
		// 5. ��ǲ�� 1�� ���̸� ��ȣ ����
		CalculableReturn c4 = x -> { return 3.14 * x * 2; };
		System.out.println("[���ٸ���] " + c4.calculate(100));
		
		// 6. ������ �� ���̸� �߰�ȣ�� ����
		CalculableReturn c5 = x -> 3.14 * x * 2;
		System.out.println("[���ٸ���] " + c5.calculate(100));
		
		// 7. �������̽��� ���� ������ �ϳ���? �� �ǹ̵� ���µ�
		// UnaryOperator : 1�� �Է�, 1�� ���
		// BinaryOperator : 2�� �Է�, 1�� ���
		// Consumer, forEach
		
		// 8. ���ٽ��� ��ǥ���� ���� -> forEach
		ArrayList<String> ar = new ArrayList();
		ar.add("Steak");
		ar.add("Striper");
		ar.add("Rock Group");
		
		for(String name : ar) {
			System.out.println(name);
		}
		
		ar.forEach(name -> System.out.println(name));
		// �Է��� ���� �ƹ� �������� ���� ���
		ar.forEach(System.out::println);	
	}

}

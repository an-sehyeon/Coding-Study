package day12;

public class RefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ref1 ref1 = new Ref1();	// Ref1 Ŭ������ �ν��Ͻ��� ����
	}
		// Ref1 ��ü�� �����ϸ� Ref2 ��ü�� �����ϰ� Ref2 ��ü�� �����ϸ� �ٽ� Ref1 ��ü�� ����, ��ü ���� ��ȣ ���� ȣ��� �޸� ����

}
class Ref1{						// Ŭ���� Ref1 ����
		Ref2 ref2;				// Ref1 Ŭ������ Ref2 Ŭ���� Ÿ���� �ʵ带 ����
		
		Ref1(){					// Ref1�� ������. Ref1 ��ü�� ������ �� Ref2 ��ü�� ����
			ref2 = new Ref2();	// Ref2 ��ü�� ������ �� �ٽ� Ref1 ��ü�� �����ϹǷ� ��ȯ ���� �߻�
		}
	}
	
class Ref2{						// Ŭ���� Ref2 ����
	Ref1 ref1;					// Ref2 Ŭ������ Ref1 Ŭ���� Ÿ���� �ʵ带 ����
	
	Ref2(){						// Ref2�� ������. Ref2 ��ü�� ������ �� Ref1��ü�� ����
		ref1 = new Ref1();		// Ref1 ��ü�� �������� �� �ٽ� Ref2 ��ü�� �����ϹǷ� ��ȯ ���� �߻�
	}
}


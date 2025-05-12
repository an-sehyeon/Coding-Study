package day17;

import java.util.ArrayList;

public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Food ramen = new Food("���", "�׳� ���̸� �� �ƴ� ���� ����");		// Food ��ü�� ������ ramen������ ����
		
		// OldBox
		OldBox ob = new OldBox();									// OldBox ��ü�� ob������ ����
		ob.add(ramen);												// ob��ü�� ramen������ �߰�
		System.out.println(((Food)(ob.get(0))).getRecipe());		// �߰��� ramen��ü�� Recipe ���
		
		// NewBox
		NewBox<Food> nb = new NewBox();								// NewBox�� FoodŸ������ ���׸� ���� �� ��ü ���� �� nb������ ����
		nb.add(ramen);												// nb�� ramen ������ �߰�		
		//  nb.add(new String("AAA"));  							// Generic�� ����ϸ� ���� Ÿ�� �ܿ��� ��� �Ұ�
		System.out.println(nb.get(0).getRecipe());					// �߰��� ramen��ü�� Recipe ���			
	}

}

class Food {														// Food Ŭ���� ����
	String name;													// ���� �̸��� �����ϴ� name���� 
	String recipe;													// ���� �������� �����ϴ� recipe���� 
	
	Food(String name, String recipe){								// ������ name�� recipe ���� �ʱ�ȭ
		this.name = name;
		this.recipe = recipe;
	}
	
	String getRecipe() {											// Recipe���� ��ȯ�ϴ� �޼���
		return recipe;
	}
}

class OldBox {														// ���׸��� ���� OldBox Ŭ���� ����
	ArrayList item = new ArrayList();								// �پ��� ��ü�� ������ ArrayList ������ item������ ����	
	
	void add(Object o) {											// ��� Ÿ���� ��ü �߰� ����
		item.add(o);
	}
	
	Object get(int index) {											// ����� ��ü ��ȯ
		return item.get(index);
	}
}

class NewBox<T> {													// ���׸��� ����� NewBox Ŭ���� ����
	// T, E, (K, V) : T=Type, E=Element, K=Key, V=Value
	ArrayList<T> item = new ArrayList();							// Ư�� Ÿ�Ը� ���� ������ ArrayList
	
	void add(T o) {													// Ư�� Ÿ���� ��ü �߰� ����
		item.add(o);
	}
	
	T get(int index) {												// ����� ��ü ��ȯ			
		return item.get(index);
	}
}

class StrangeBox<DisneyLand> {										// StrangeBox Ŭ���� : ���׸� Ÿ�� �̸��� DisneyLand�� ����
	DisneyLand name;												// DisneyLand Ÿ���� name���� 
}
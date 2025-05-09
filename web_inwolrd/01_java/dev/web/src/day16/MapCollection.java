package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// REST : ���ҽ��� http��ɾ�� �� ������ �ϴ� ��������
		HashMap<String, Integer> hm = new HashMap(); 			// <  > : Generic, String�� Ű��, Integer�� ������ ����ϴ� HashMap ���� �� hm������ ����
		TreeMap<String, Integer> tm = new TreeMap(); 			// <  > : Generic, String�� Ű��, Integer�� ������ ����ϴ� TreeMap ���� �� tm������ ����
		
		// (1) put() : ������ ����
		String[] food = {"Steak", "Chicken", "Rice", "Curri"};	// food��� StringŸ���� �迭 ���� �� �迭�� ���� �̸� ����
		int[] price = {10000, 15000, 9000, 500};				// price��� intŸ���� �迭 ���� �� �ݾ� ����
		
		for(int i=0; i<food.length; i++) {						// i�� 0���� 1�� �����ϸ� food�迭�� ��Ұ���ŭ �ݺ�
			hm.put(food[i], price[i]);							// food�迭�� price�迭�� i��° �ε����� hm������ ����
			tm.put(food[i], price[i]);							// food�迭�� price�迭�� i��° �ε����� tm������ ����
		}
		
		System.out.println("HashMap : " + hm);					// HashMap�� ��������� �������� ����, �Է� ������ ��� ������ �ٸ� �� ����
		System.out.println("TreeMap : " + tm);					// TreeMap�� ������������ ������ �����͸� ��
		
		// (2) get() : ������ ��ȸ
		System.out.println("Chicken : " + hm.get("Chicken"));	// hm������ "Chicken"������ ��ȸ �� ���
		
		// ��� ������ ���� ��
		// 1) Enhanced for
		for(String key : hm.keySet()) {							// HashMap�� ��� Ű-�� ���� �ϳ��� ������ ���
			System.out.println(key + " : " + hm.get(key));
		}

		
		// 2) Iterator()
		Iterator keys = tm.keySet().iterator();					// TreeMap�� Ű�� ������� ��ȸ�ϴ� Iterator ����
		
		while(keys.hasNext()) {									// ���� Ű�� ���� ���� �ݺ�
			String key = (String)keys.next();					// Ű�� �ϳ� ������ key ������ ����
			System.out.println(key + " : " + tm.get(key));		// Ű�� �ش� Ű�� �� ���
		}

		// (3) remove(Ű��) : ������ ����, replace(Ű��, Value) : �ش� Ű�� �����͸� Value�� ����
		hm.remove("Rice");										// hm�� Rice������ ����
		hm.replace("Steak", 1000);								// hm�� "Steak"�������� ���� 1000���� ����
		System.out.println("New HM : " + hm);					// ����� hm ���
		
		// Map Collection�� ���� ������ JSON ������ �ؼ��ϴµ� �����ϴ�.
		
	}

}

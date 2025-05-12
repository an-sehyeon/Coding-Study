package day16;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. ArrayList
		ArrayList ar = new ArrayList();						// ArrayList��ü�� ������ ar������ ����
		
		// (1) ����Ʈ�� ��� �߰�(add)
		ar.add("���");										// ar�迭�� "���" �߰�
		ar.add("ġŲ�");									// ar�迭�� "ġŲ�" �߰�
		ar.add("�ұ���");										// ar�迭�� "�ұ���" �߰�
		ar.add("���");										// ar�迭�� "���" �߰�
		System.out.println(ar);								// ar�迭 ���
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(i + " : " + ar.get(i));  	// get(i) i���� �ش��ϴ� ������ ��������
		}
		
		// (2) ��� ����
		ar.remove(1);										// ar�迭�� 2��° �ε��� ����
		ar.remove("���");									// ar�迭�� "���"����		
		System.out.println("[�޴� 2�� ���� ��] " + ar);			// ���ڿ� + ���� �迭�� �� ���
		
		// (3) ��� ����
		ar.set(0, "���İ�Ƽ");									// ar�迭�� ù��° �ε��� �� "���İ�Ƽ"�� ����
		System.out.println("[�޴� ���� ��] " + ar);				// ����� �迭 ���

		try {														// ���� �߻� ���ɼ� �ִ� �ڵ�
			System.out.println("[�޴� ���� ��] " + ar.get(100));		// ar�迭�� 101��° �ε��� ���� get�Ѵٸ�?
		}
		catch(Exception e) {										// ���� �߻��� ��� �ڵ�
			System.out.println("[�޴� ���� ��] " + "�ϰ� ���� �ظԾ�");
		}
		
		// (4) size() : ��� ���� ���ϱ�
		System.out.println("�� �޴� ������ " + ar.size() + "�� �Դϴ�"); 	// ar.size : ar�迭�� ��� ����
		
		// (5) contains() : ��� �ִ��� �˾ƺ���(true, false)
		System.out.println("contains : ��� �ֳ��� - " + (ar.contains("���")? "��":"�ƴ�"));		// ar������ "���"�� �ִٸ� ��, ���ٸ� �ƴ� ���
		System.out.println("contains : ��� �ֳ��� - " + ar.contains("���"));				// ar������ "���"�� �ִٸ� true, ���ٸ� false���
		
		// 2. LinkedList
		LinkedList link = new LinkedList();						// LinkedList ��ü�� ������ link������ ����
		link.add("������ũ");										// link ����Ʈ�� "������ũ"�߰�
		link.add(0, "Ʈ�����ͽ�");									// link ����Ʈ�� "Ʈ�����ͽ�"�߰�
		link.add(1, "�����������");								// link ����Ʈ�� "�����������"�߰�
		System.out.println("LinkedList : " + link);				// link ����Ʈ ���
		
		// 3. Performance
		ArrayList app1 = new ArrayList();						// ArrayList��ü�� ������ app1������ ����
		LinkedList app2 = new LinkedList();						// LinkedList��ü�� ������ app2������ ����
		
		final int SAMPLE = 10000;								// intŸ���� SAMPLE ������ ���� final Ŭ������ ������ 1000 �Ҵ�
		for(int i=0; i<SAMPLE; i++) {							// i�� 1�� �����ϸ� 10000�� �ݺ�
			app1.add(i);										// i�� app1 List�� �����
			app2.add(i);										// i�� app2 List�� �����
		}
		
		// read test
		long start, mid, end;									// �ð� ������ ���� longŸ���� ������ ����
		start = System.currentTimeMillis();						// ����ð��� �и��� ������ ��ȯ�ؼ� start������ ����
		for(int i=0; i<SAMPLE; i++) {
			app1.get(i);
		}
		mid = System.currentTimeMillis();						// ����ð��� �и��� ������ ��ȯ�ؼ� mid������ ����
		for(int i=0; i<SAMPLE; i++) {
			app2.get(i);
		}
		end = System.currentTimeMillis();
		
		System.out.println("***** Read Competition *****");
		System.out.println("ArrayList : " + (mid-start));		// ArrayList�� 1000�� �ݺ��� ����Ǵ� �ð��� �и��� ������ ���
		System.out.println("LinkedList : " + (end-mid));		// LinkedList�� 1000�� �ݺ��� ����Ǵ� �ð��� �и��� ������ ���
		
		// insert test
		start = System.currentTimeMillis();
		for(int i=0; i<SAMPLE; i++) {
			app1.add(7000, i);									// app1������ i��° �ε����� 7000�� ����
		}
		mid = System.currentTimeMillis();
		for(int i=0; i<SAMPLE; i++) {
			app2.add(7000, i);									// app2������ i��° �ε����� 7000�� ����
		}
		end = System.currentTimeMillis();
		
		System.out.println("***** Insert Competition *****");
		System.out.println("ArrayList : " + (mid-start));		// ArrayList 1000���� insert�ϴµ� �ɸ��� �ð� ���
		System.out.println("LinkedList : " + (end-mid));		// LinkedList 1000���� insert�ϴµ� �ɸ��� �ð� ���
	}

}

package day16;

import java.util.HashSet;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. HashSet
		HashSet hs = new HashSet();								// HashSet��ü�� ������ hs������ ����
		hs.add("��Ʈ����");										// hs�� "��Ʈ����" �߰�	
		hs.add("�ֱ۷��췡");										// hs�� "�ֱ۷��췡" �߰�
		hs.add("���ũŻ��");										// hs�� "���ũŻ��" �߰�
		hs.add(new Puppy());									// hs�� Puppy ��ü �߰�
		System.out.println("HashSet : " + hs);					// HashSet ���
		
		// 2. TreeSet
		TreeSet ts = new TreeSet();
		ts.add("��Ʈ����");
		ts.add("�ֱ۷��췡");
		ts.add("���ũŻ��");
		ts.add("�͹̳�����");
		ts.add("��ũ����Ʈ");
		//ts.add(new Puppy());  => Comparator ���� �� ������ ��?
		System.out.println("TreeSet : " + ts);
		
		TreeSet subSet1 = (TreeSet)ts.subSet("��Ʈ����", "�ֱ۷��췡");
		System.out.println("SubSet1 : " + subSet1);
		
		TreeSet subSet2 = (TreeSet)ts.subSet("��Ʈ����", true, "�ֱ۷��췡", true);		// "��Ʈ����"���� "�ֱ۷��췡"���� �����ϴ� �κ� ������ ����� subSet2�� ����
		System.out.println("SubSet2 : " + subSet2);
		
		TreeSet subSet3 = (TreeSet)ts.subSet("��", "��");								// ���ĵ� ������ ������ "��" ���� "��" ������ ��Ҹ� �����ϴ� �κ� ������ subSet3�� ����
		System.out.println("SubSet3 : " + subSet3);
		
		
	}
}

class Puppy {														// Puppy Ŭ���� ����
	String name = "�ɷ���";											// name ����
	int age = 4;													// age ����
	
	@Override 
	public String toString() {									
		return "Puppy{name = '" + name + "', age = " + age + "}";	// ���ڿ��� ����
	}
}

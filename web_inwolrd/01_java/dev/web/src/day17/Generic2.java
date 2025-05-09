package day17;

import java.util.ArrayList;

public class Generic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LuxuryBox<Instrument> box1 = new LuxuryBox();		// LuxuryBox<Instrument>Ÿ���� box1����
		LuxuryBox<Violin> box2 = new LuxuryBox();			// LuxuryBox<Violin>Ÿ���� box2����
		LuxuryBox<Flute> box3 = new LuxuryBox();			// LuxuryBox<Flute>Ÿ���� box3����
		// LuxuryBox<Bat> box4 = new LuxuryBox();			// extends Instrument ���ǿ� ���� �Ա��� ����

		
		Bat bat1 = new Bat();								// bat1 ��ü�� ����
		System.out.println(box3.<String>get("Cello"));		// get �޼��带 ����Ͽ� ���ڿ� ���
		System.out.println(box3.<Bat>get(bat1));			// get �޼��带 ����Ͽ� bat1��ü�� ������
	}

}

class Instrument {   }										// Instrument Ŭ���� ���� (�Ǳ� Ŭ������ �⺻�� �Ǵ� Ŭ����)
class Violin extends Instrument {   }						// Violin Ŭ���� ���� (Instrument�� ��ӹ޾� ������ �Ǳ� Ŭ����)
class Flute extends Instrument {   }						// Flute Ŭ���� ���� (Instrument�� ��ӹ޾� ������ �Ǳ� Ŭ����)

class SportsTool {   }										// SportsTool Ŭ���� ����
class Bat extends SportsTool {   }							// Bat Ŭ���� ���� (SportsTool�� ��ӹ���)

class LuxuryBox<T extends Instrument> {						// LuxuryBox Ŭ���� ����, Instrument Ÿ���� ����ϴ� ��ü�� ���� ������ ���׸� Ŭ����
	ArrayList<T> item = new ArrayList();					// Instrument �Ǵ� ���� Ŭ������ ���� ������ ArrayList ����
	
	public <T> T get(T data) {								// ���׸� �޼��� get : � Ÿ���� �����Ͷ� �޾� ��ȯ�ϴ� �޼���
		return data;
	}
}









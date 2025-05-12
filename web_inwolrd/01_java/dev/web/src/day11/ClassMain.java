package day11;

import java.util.Scanner;

import util.MyUtil;

public class ClassMain {

	public static void main(String[] args) {														
		// TODO Auto-generated method stub
		
		ClassC c = new ClassC();										// ClassC�� �⺻ ������ ȣ��, �θ�Ŭ����(ClassP) �����ڵ� �Բ� ȣ���
				
		System.out.println("� �� ������ �輼��?(1.�Ϲ���, 2.����Ʈ��) : ");	// �ڵ� ���
		Scanner sc = new Scanner(System.in);							// ����� �Է��� �ޱ� ���� Scanner ��ü ����
		int sel = sc.nextInt();											// �Է¹��� ���� int���� sel������ ����
		
		Phone myPhone;													// Phone Ÿ���� myPhone������ ���� (Phone �Ǵ� SmartPhone ��ü�� ����ų �� ����)
		if(sel == 1) {													// �Է¹��� ���� 1�̶��?
			myPhone = new Phone();										// Phone()��ü ����
		}else {															// 1�� �ƴ϶��?
			myPhone = new SmartPhone();									// SmartPhone()��ü ����
		}
		
		myPhone.sendText("asdfasdfasdfasfas");							// myPhone ��ü���� ���ں����� ��� ȣ��, ���ڿ� �Ű������� ����
		myPhone.call();													// myPhone ��ü���� ��ȭ�ɱ� ��� ȣ��
		SmartPhone sp = (SmartPhone)myPhone;							// myPhone�� SmartPhone���� ���� ����ȯ, �׷��� myPhone�� SmartPhone ��ü���߸� ����ȯ�� ������
		sp.installApp();												// sp ��ü���� �� ��ġ ��� ȣ�� (SmartPhone���� �ִ� ���)
		sp.webSerfing();												// sp ��ü���� �� ���� ��� ȣ�� (SmartPhone���� �ִ� ���)
	}

}

class Phone{															// Phone Ŭ���� ����
	public void sendText(String str) {									// ���ں����� ���, sendText�� ���ڿ��� str�� ���� ���޹���
		if(str.length() > 80) {											// str ���ڿ��� ���̰� 80�� �ʰ����?
			MyUtil.p("���ڿ��� �ʹ� ��ϴ�.");								// �ڵ����
		}else {															// str ���ڿ��� ���̰� 80�� �̸��̶��?
			MyUtil.p(str);												// str ���� ���
		}
	}
	
	public void call() {												// ��ȭ�ɱ� ��� ����
		MyUtil.p("Calling...");											// �ڵ� ���
	}
}

class SmartPhone extends Phone{											// SmartPhone Ŭ���� ����, PhoneŬ���� ��ӹ���
	public void installApp() {											// �� ��ġ ��� ����
		MyUtil.p("INstalling App....");									// �ڵ� ���			
	}
	
	public void webSerfing() {											// ������ ��� ����
		MyUtil.p("Web Swerfing...");									// �ڵ� ���
	}
	
	@Override
	public void sendText(String str) {									// class Phone�� sendText ���� 
		MyUtil.p(str);													// �Էµ� ���ڿ� ���
	}
}












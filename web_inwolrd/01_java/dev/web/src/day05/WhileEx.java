
package day05;

import util.MyUtil;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyUtil.p("While Statement");
		
		int i = 0;
		while(i < 10) {		// i�� 10���� ���������� �ݺ�
			MyUtil.p("Current i = " + i);		
			i++;				// �ݺ��ɶ����� i�� 1�� ����
		}
		
		
		MyUtil.p("After While i = " + i); 	// i�� 10���� ���ų� Ŀ�� �ݺ����� �ߴܵǱ� ������ ���� i�� ���� 10
		
		
		// Infinity Loop
		i = 0;		// i�� �ٽ� 0���� �ʱ�ȭ
		while(true) {	// true�϶� ��� �ݺ�
			MyUtil.p("This i is " + i);
			i++;
			if(i > 5)		// ���� i�� 5���� ũ�ٸ�?
				break;			// �ݺ��� Ż��
		}
		
		
	}

}

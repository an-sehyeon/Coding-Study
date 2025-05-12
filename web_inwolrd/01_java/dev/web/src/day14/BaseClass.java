package day14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import util.MyUtil;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyUtil.cp("Base Class Example");										// MyUtilŬ������ cp�޼��带 ȣ���Ͽ� �������
		
		// 1. System
		long ctime = System.currentTimeMillis();								// ���� �ð��� �и��� ������ ��ȯ�� ���� longŸ���� ctime������ ����
		System.out.println("���� �ð� : " + ctime);								// ���� �ð� ���
		
		long point1, point2;													// long Ÿ���� ���� 2�� ����
		long elapsedTime;														// �ݺ��� ���� �ð��� ������ ���� 
		
		point1 = System.currentTimeMillis();									// point1������ ���� �ð� ���� (for�� ���� �ð�)
		for(int i=0; i<1000000; i++) {											// 0���� 1000000���� �ݺ��� ����
			;
		}
		point2 = System.currentTimeMillis();									// point2������ ���� �ð� ���� (for�� ���� �ð�)
		elapsedTime = point2 - point1;											// �ݺ����� ����Ǵ� �ð��� �����(point1�� point2�� ����)�� elapsedTime ������ ����
		System.out.println("for�� ����ð�(ms) : " + elapsedTime);					// for���� ����Ǵµ� �ɸ� �ð��� �и��� ������ ���
		
		
		// 2. StringBuffer
		System.out.println("\n" + "=========String:Buffer==========");
		StringBuffer sb = new StringBuffer();									// StringBuffer��ü�� �����Ͽ� sb������ ����
		sb.append("Eriks Steakhouse");											// sb�� "Eriks Steakhouse" ���ڿ��� ����
		System.out.println(sb);											
		sb.insert(6, "Famous ");												// ���� sb ���� 6��° �ε����� "Famous"�� ����
		System.out.println(sb);
		// sb.insert(100, "I am genius");  // �ε��� ����(���ڿ��� ����)�� �Ѿ�� ����
		sb.delete(1, 10);														// sb�� 2��°���� 10��°���� ����		
		System.out.println(sb);
		sb.delete(3, 1000);  // delete�� ���� �ε����� ū ���ڸ� �־ ����				// sb�� 4��°���� 1000��°���� ����
		System.out.println(sb);
		
		// String, StringBuffer Performance Contest
		String app1 = "";														// String Ÿ���� app1������ �� ���ڿ��� �ʱ�ȭ
		StringBuffer app2 = new StringBuffer();									// StringBuffer ��ü�� �����Ͽ� app2�� ����
		
		final int SAMPLE_CNT = 10000;											// SAMPLE_CNT�� ������ �� ���� ����� ����, ���� 10000���� �ʱ�ȭ
		// 1. ���� ũ�⸦ ������ �� ���ϴ�. �� ���� �ٲ��ָ� �Ǳ� ������
		// 2. �Ǽ��� �ϳ��� ���� ���� ����Ǵ� ������ �����ش�.
		long elapsedTime1, elapsedTime2;										// longŸ���� app1�� app2 ������ �۾��ð��� ����� ���� ����
		
		point1 = System.currentTimeMillis();									// ����ð��� �и��ʴ����� point1�� ����
		for(int i=0; i<SAMPLE_CNT; i++) {										// 0���� 10000���� �ݺ�
			app1 = app1 + i;  													// String�� ����Ͽ� i�� ���ڿ��� ��ȯ �� app1�� ��� ���� (0 -> "01" -> "012" -> ...)
																				// �ݺ��ɶ����� ���ο� ���ڿ� ��ü�� �����Ǳ� ������ ��ȿ��
		}
		point2 = System.currentTimeMillis();									// �ݺ����� ���� �� ����ð��� point2������ ����
		elapsedTime1 = point2 - point1;											// �ݺ����� ����Ǵ� �ð��� ������� elapsedTime1������ ����
		
		point1 = System.currentTimeMillis();									// �ٽ� ����ð��� �и��� ������ point1�� ����
		for(int i=0; i<SAMPLE_CNT; i++) {				
			app2.append(i);														// StringBuffer�� ����Ͽ� i�� ���ۿ� �߰�
		}
		point2 = System.currentTimeMillis();									// �ݺ����� ���� �� ���� �ð� ����
		elapsedTime2 = point2 - point1;											// StringBuffer�� ����� �۾��� �ɸ� �ð��� ����Ͽ� ����
		
		MyUtil.cp("*** Performance Contest Result ***");
		MyUtil.p("String : " + elapsedTime1 + "(ms)");							// String�� ����Ͽ� �۾��� �ɸ� �ð� ���
		MyUtil.p("StringBuffer : " + elapsedTime2 + "(ms)");					// StringBuffer�� ����Ͽ� �۾��� �ɸ� �ð� ���
		
		// 3. Math
		System.out.println("\n" + "=========Math==========");
		System.out.println("Math.getRound(3.152, 2) : " + getRound(3.152, 2));	// getRound �޼��带 ȣ���Ͽ� ���ڰ��� �Ҽ��� 2��° �ڸ����� �ݿø�
		
		// 4. Date
		System.out.println("\n" + "=========Date==========");
		Date d = new Date();  // ���� �ð�											// ���� �ð��� ��Ÿ���� Date ��ü�� ������ d������ ����
		System.out.println("���� �ð� : " + d);									// ���� �ð� ���
		
		// format�� ���ϰ� ���� ���� ���� ��� => SimpleDateFormat
		SimpleDateFormat f1 = new SimpleDateFormat("yyyyMMdd");					// SimpleDateFormat ��ü�� ������ ���� �������� ����,��,�� ������ f1������ ���� 
		System.out.println("���� �ð� : " + f1.format(d));							// ����,��,�� ������ ���� ��¥ ���(����������)
		
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");				// SimpleDateFormat ��ü�� ������ "yyyy-MM-dd" �������� ���� ��¥�� f2������ ����
		System.out.println("���� �ð� : " + f2.format(d));
		
		SimpleDateFormat f3 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");		// SimpleDateFormat ��ü�� ������ "yyyy-MM-dd hh:mm:ss" �������� ���� ��¥,�ð��� f3������ ����
		System.out.println("���� �ð� : " + f3.format(d));
		
		// 5. Calendar
		System.out.println("\n" + "=========Calender==========");				
		Calendar c = Calendar.getInstance();									// Calendar.getInstance : ���� �ý����� ��¥�� �ð��� �������� ��ȯ, c������ ���� 
		
		// get �޼���� ���� ���ϴ� �޷��� ���� �� �� �ִ�.
		System.out.println("������ ������ : " + c.get(Calendar.DAY_OF_WEEK));				// c.get�� ȣ���� DAY_OF_WEEK �ʵ��� ���� ���� ��¥�� ������ ���ڷ� ���
		System.out.println("���� : " + c.get(Calendar.YEAR));								// c.get�� ȣ���� YEAR �ʵ��� ���� ���� ��¥�� ������ ���
		System.out.println("�� : " + (c.get(Calendar.MONTH)+1));							// c.get�� ȣ���� MONTH)+1 �ʵ��� ���� ���� ��¥�� ���� ���(0���� �����ϹǷ� 1�� ����)
		System.out.println("�� : " + c.get(Calendar.DAY_OF_MONTH));						// c.get�� ȣ���� DAY_OF_MONTH �ʵ��� ���� ���� ��¥�� ���� ���
		System.out.println("������ �̹� ���� �� ��° �� : " + c.get(Calendar.DAY_OF_YEAR));	 	// c.get�� ȣ���� DAY_OF_YEAR �ʵ��� ���� ���� ��¥�� ������ �� ��° ������ ���
		System.out.println("������ �̹� ���� �� ��° �� : " + c.get(Calendar.WEEK_OF_YEAR));	// c.get�� ȣ���� WEEK_OF_YEAR �ʵ��� ���� ���� ��¥�� ������ �� ��° ������ ���
		}
	
		// a�� b�ڸ����� �ݿø�(b >= 0)
		public static double getRound(double a, int b) {						// double ������ Ÿ���� getRound �޼��� ����, ���ڰ��� 2�� ���� (a: ��, b: �ݿø� �ڸ���)
		double result = 0.0;													// ������� ������ ������ 0.0���� �ʱ�ȭ
		double var = a;															// �Է°� a�� var�� �����Ͽ� ���
		
		// 10�� b�� ȸ����ŭ ���Ѵ�.
		for(int i=0; i<b; i++) {												// b�� ����ŭ �ݺ�
			var = var * 10;														// var�� 10�� ���Ͽ� �Ҽ��� ��ġ�� �̵�		
		}
		
		// �Ҽ��� ���ϸ� ������.
		var = Math.round(var);													// var�� �ݿø��Ͽ� �Ҽ��� ���ϸ� ����
		
		// 10�� b�� ȸ����ŭ ������.
		for(int i=0; i<b; i++) {												// b�� ����ŭ �ݺ�
			var = var / 10;														// var�� �ٽ� 10���� ����� �Ҽ��� ��ġ�� ����
		}
		
		result = var;															// ������� result�� ����
		return result;															// ����� ��ȯ		
		}
}

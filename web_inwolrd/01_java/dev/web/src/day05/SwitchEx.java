
package day05;

import java.util.Random;

import util.MyUtil;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		
		int i = rd.nextInt(3);		// i�� 0, 1, 2 �� �ϳ�
		
		switch(i) {
			case 0 : 
				MyUtil.p("0�Դϴ�. ��!!");
				break;
			case 1 : 
				MyUtil.p("1�Դϴ�. �̰͵� ��!~");
				break;
			case 2 :
				MyUtil.p(MyUtil.RED + "This is the TWO!!!!" + MyUtil.END);
				MyUtil.p("��!!!!��÷!!! �ž��� ��ǰ ����!!");
				break;
			default : 
				MyUtil.p("��û�� ���� �߻�..... �ý��� �̻���...");
		}
		
		
		
		// �ǵ������� break�� ���� ���
		// �Ʒ� �ܰ� �۾��� ���� �۾��� �ݵ�� ���ľ� �ϴ� ���
		// �۾� �� ���� ����
		
		int workProcess = rd.nextInt(4);
		MyUtil.p("");
		MyUtil.p(MyUtil.GREEN + "### �������� �۾� �ܰ� ###" + MyUtil.END);
		
		switch(workProcess) {
			case 0:
				MyUtil.p("Stem1 : �۾��غ�");
			case 1:
				MyUtil.p("Stem2 : �����غ�");
			case 2:
				MyUtil.p("Stem3 : ���߿Ϸ�");
			case 3:
				MyUtil.p("Stem4 : ����غ�");
				
		}
		
		
		
		// if statement�� �����Ѵٸ�
		MyUtil.p("");
		
		if(workProcess == 0) {
			MyUtil.p("Step1 : �۾��غ�");
			MyUtil.p("Step2 : �����غ�");
			MyUtil.p("Step3 : ���߿Ϸ�");
			MyUtil.p("Step4 : ����غ�");
		}
		else if(workProcess == 1) {
			MyUtil.p("Step2 : �����غ�");
			MyUtil.p("Step3 : ���߿Ϸ�");
			MyUtil.p("Step4 : ����غ�");
		}
		else if(workProcess == 2) {
			MyUtil.p("Step3 : ���߿Ϸ�");
			MyUtil.p("Step4 : ����غ�");
		}
		else if(workProcess == 3) {
			MyUtil.p("Step4 : ����غ�");
		}
	}

}

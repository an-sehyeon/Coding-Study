
package day09;

import util.MyUtil;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyUtil.p(MyUtil.NEGATIVE + MyUtil.MAGENTA + "Ŭ���� �׽�Ʈ" + MyUtil.END);
		
		Car car1 = new Car();		// CarŬ������ �⺻ �����ڸ� �̿��� ��ü car1 ����
		MyUtil.p(car1.toString());	// car1�� toString �޼��带 ȣ���Ͽ� �⺻ �����ڷ� �ʱ�ȭ�� �� ���
		
		Car car2 = new Car("Black", "MyTrip", "Luxury");	// CarŬ������ �Ű����� �����ڸ� �̿��� ��ü car2 ����
		MyUtil.p(car2.toString());	// car2�� toString �޼��带 ȣ���Ͽ� ���޵� ���ڰ��� �ݿ��� ���ڿ� ���

	}

}

class Car{
	// �ν��Ͻ� ���� ����
	String color;
	String name;
	String type;
	
	// �⺻ ������
	Car(){
		// �ν��Ͻ� ���� �ʱ�ȭ
		color = "����";
		name = "���";
		type = "�����⺻��";
		MyUtil.p("Car() Called");		// ��ü ������ ȣ��Ǵ� �޼��� p�� �̿��� ���
	}
	
	// �Ű������� �ִ� ������
	Car(String color, String name, String type){
		// this�� ����� �ν��Ͻ� ���� �ʱ�ȭ
		this.color = color;
		this.name = name;
		this.type = type;
		MyUtil.p("Car(...) Called");	// ��ü ������ ȣ��Ǵ� �޼��� p�� �̿��� ���
	}
	
	public String toString() {		// ��ü ������ ���ڿ��� ��ȯ�ϴ� �޼���
		return "�� ������ " + color + ", �̸��� " + name + ", Ÿ���� " + type;
	}
	
	
	// Code Block
	// ������(Constructor)�� ���� ���� �ִµ�, ���������� �� ���� ���� ���
	
	// ���� �ʱ�ȭ ���
	static {
		MyUtil.p("static{      } Called");		// ��ü�� ������ �� �� �ѹ��� ȣ��Ǵ� �Լ�, ������� ȣ���
	}
	
	
	// �ν��Ͻ� �ʱ�ȭ ���
	{
		MyUtil.p("{     } Called");				// ��ü�� ������ ������ ȣ��Ǵ� �Լ�
	}
}

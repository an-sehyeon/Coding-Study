package Board_db;

import java.util.Scanner;

public class MyMain {
 public static void main(String[] arg ) {
	 //����ڼ��� ȭ��
	 int choice = 0;	//����� ������ ���� ����
	 String title = "";	//�Է��� title���� �����ϴ� ����
	 String contents = "";	//�Խñ۳ѹ�
	 String author = "";	//������	
	 String date = "";		//��¥
	 
	 DB_Board db = new DB_Board();
	 //DB_Board��ü ���� -> ������ȣ�� -> ����
	 
	 Scanner sc = new Scanner(System.in);
	 
	 while(true) {
		 System.out.println("1.�����ȸ");
		 System.out.println("2.������ȸ");
		 System.out.println("3.�߰�");
		 System.out.println("4.����");
		 System.out.println("5.����");
		 System.out.println("6.����");
		 choice = sc.nextInt();	//����ڰ� �����Է�
		 
		 if(choice ==1) {	//�����ȸ ���� �Լ� ����
			 db.search();
		 }else if(choice ==2) {		//������ȸ ��� ���� �Լ� ����
			 System.out.println("�Խñ� ���� �Է�");
			 title = sc.next();
			 db.searchBytitle(title);
		 }else if(choice ==3) {		//�߰� ��� ���� �Լ� ����
			 System.out.println("�Խñ� ���� �Է�");
			 title=sc.next();
			 System.out.println("�Խñ� ��ȣ �Է�");
			 contents=sc.next();
			 System.out.println("�����ڸ� �Է�");
			 author=sc.next();
			 System.out.println("�Խñ� �ۼ� ��¥�Է�");
			 date = sc.next();
			 db.addBoardInfo(title, contents, author, date);
		 }else if(choice ==4) {	//������� ���� �Լ� ����
			 					//����-contents, ������ ���� - title
			System.out.println("�Խñ� ��ȣ �Է�");
			contents = sc.next();
			System.out.println("�Խñ� ���� �Է�");
			title = sc.next();
			db.updateBoardInfo(contents, title);
			 
		 }else if(choice ==5) {	//���� ��� ���� �Լ� ����
			 
		 }else {
			 break;
		 }
	 
	 }
	 
	 
	 
	 

}

}

package Board_db;

import java.util.Scanner;

public class MyMain {
 public static void main(String[] arg ) {
	 //사용자선택 화면
	 int choice = 0;	//사용자 선택을 위한 변수
	 String title = "";	//입력한 title제목 저장하는 변수
	 String contents = "";	//게시글넘버
	 String author = "";	//관리자	
	 String date = "";		//날짜
	 
	 DB_Board db = new DB_Board();
	 //DB_Board객체 생성 -> 생성자호출 -> 연결
	 
	 Scanner sc = new Scanner(System.in);
	 
	 while(true) {
		 System.out.println("1.모두조회");
		 System.out.println("2.조건조회");
		 System.out.println("3.추가");
		 System.out.println("4.수정");
		 System.out.println("5.삭제");
		 System.out.println("6.종료");
		 choice = sc.nextInt();	//사용자가 정수입력
		 
		 if(choice ==1) {	//모두조회 가진 함수 실행
			 db.search();
		 }else if(choice ==2) {		//조건조회 기능 가진 함수 실행
			 System.out.println("게시글 제목 입력");
			 title = sc.next();
			 db.searchBytitle(title);
		 }else if(choice ==3) {		//추가 기능 가진 함수 실행
			 System.out.println("게시글 제목 입력");
			 title=sc.next();
			 System.out.println("게시글 번호 입력");
			 contents=sc.next();
			 System.out.println("관리자명 입력");
			 author=sc.next();
			 System.out.println("게시글 작성 날짜입력");
			 date = sc.next();
			 db.addBoardInfo(title, contents, author, date);
		 }else if(choice ==4) {	//수정기능 가진 함수 실행
			 					//조건-contents, 수정할 값은 - title
			System.out.println("게시글 번호 입력");
			contents = sc.next();
			System.out.println("게시글 제목 입력");
			title = sc.next();
			db.updateBoardInfo(contents, title);
			 
		 }else if(choice ==5) {	//삭제 기능 가진 함수 실행
			 
		 }else {
			 break;
		 }
	 
	 }
	 
	 
	 
	 

}

}

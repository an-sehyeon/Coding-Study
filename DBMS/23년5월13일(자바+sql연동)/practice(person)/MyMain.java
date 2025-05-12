import java.util.Scanner;

public class MyMain {
	public static void main(String[] args) {
		//사용자선택 화면
		int choice=0;//사용자 선택을 위한 변수
		String name="";//입력한 이름 저장하는 변수
		int age=0;
		double height=0;
		DB_Connection db = new DB_Connection();
		//DB_Connection 객체 생성->생성자호출->연결
		//생성자안에 연결하는 코드가 있으니까
		Scanner sc = new Scanner(System.in);
		//키보드 입력을 위한 Scanner객체 생성
		while(true) {
			System.out.println("1.모두조회");
			System.out.println("2.조건조회");
			System.out.println("3.추가");
			System.out.println("4.수정");
			System.out.println("5.삭제");
			System.out.println("6.종료");
			choice = sc.nextInt();//nextInt로 정수입력
			if(choice==1) {
				//모두조회 기능 가진 함수 실행
				db.search();
			}else if(choice==2) {
				//조건조회 기능 가진 함수 실행
				System.out.print("이름 입력:");
				name=sc.next();
				db.searchByName(name);
			}else if(choice==3) {
				//추가 기능 가진 함수 실행
				System.out.print("이름 입력:");
				name=sc.next();
				System.out.print("나이 입력:");
				age=sc.nextInt();
				System.out.print("키 입력:");
				height=sc.nextDouble();
				db.addPersonInfo(name, age, height);
				
			}else if(choice==4) {
				//수정 기능 가진 함수 실행
				//조건-이름, 수정할 값은-나이
				System.out.print("이름 입력:");
				name=sc.next();
				System.out.print("나이 입력:");
				age=sc.nextInt();
				db.updatePersonInfo(name,age);
				
			}else if(choice==5) {
				//삭제 기능 가진 함수 실행
			}else {
				break;
			}
			
		}
	}
}

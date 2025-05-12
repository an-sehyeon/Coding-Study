package 자바3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _2월24일_map_응용문제2 {

	public static void main(String[] args) {

		// Map 만들기
		Map<String, String> map = new HashMap();
		Scanner sc = new Scanner(System.in);
		String id = null;
		String pw = null;
		while (true) {
			System.out.println("=====M E N U=====");
			System.out.println("1 ID/PW 등록");
			System.out.println("2 ID/PW 조회");
			System.out.println("3 PW 변경");
			System.out.println("4 ID/PW 삭제");
			System.out.println("5 종료");
			System.out.println("=====M E N U====");
			System.out.println("번호 : ");
			int num = sc.nextInt();
			switch (num) {

			case 1  :
				// map에 ID/PW 등록 , 단 기존에 동일 ID가 있으면 등록불가(containsKey사용)
				System.out.println("ID :");
				id = sc.next();
				if (map.containsKey(id)) {
					System.out.println("동일한 ID 존재합니다.");
					break;
				}
				System.out.println("PW :");
				pw = sc.next();
				System.out.println("PW :" + pw);
				map.put(id, pw);
				break;

			case 2:// ID를 받아서 map에 있는 동일한 ID/PW를 출력
				System.out.println("ID :");
				id = sc.next();
				System.out.println("----확인----");
				pw = map.get(id);
				System.out.println("ID : " + id + " " + "PW : " + pw);

				break;

			case 3:// ID를 받아서 map에 있는 동일한 id의 password를 변경
				System.out.println("ID : ");
				id = sc.next();
				
				if(map.containsKey(id)) {
					System.out.println("해당아이디가 존재합니다. 비밀번호를 입력하세요.");
				}else {
					System.out.println("해당ID가 존재하지않습니다.");
					break;
				}
				
				System.out.println("====================");
				
				System.out.println("PW : ");
				pw = sc.next();
				
				if(map.containsValue(pw)) {
					System.out.println("변경할 PW를 입력하세요 :");
				}else {
					System.out.println("해당 PW가 존재하지 않습니다.");
					break;
				}
				pw = sc.next();
				map.replace("id", "pw");
				System.out.println("수정 목록 : "+map.toString());
				
				
				

				break;

			case 4:// ID를 받아서 map에 있는 동일한 id/pw를 삭제
				System.out.println("ID : ");
				id = sc.next();
				
				if(map.containsKey(id)) {
					map.remove(id);
					System.out.println("삭제완료");
				}else {
					System.out.println("해당 ID 존재하지 않습니다.");
				}

				break;
				
			case 5:
				System.exit(-1);
				default:
					System.out.println("다시 입력....");
			}
		}
	}
}

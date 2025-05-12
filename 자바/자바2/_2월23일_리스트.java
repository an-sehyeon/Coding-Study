package 자바2;

import java.util.ArrayList;
import java.util.List;

public class _2월23일_리스트 {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		//목록추가
		list.add("java");
		list.add("jdbc");
		list.add("jsp");
		list.add("serviet");
		list.add("jsp");
		
		//총 개체수 확인
//		System.out.println("총 개체수 : " + list.size());
//		
//		//목록조회
//		for(String i : list) {
//			System.out.println(i);
//		}
		
//		list.remove(2);
//		
//		for(String i : list) {
//			System.out.println(i);
//		}
		
		list.clear();
		for(String i : list) {
			System.out.println(i);
		}
		
	}

}

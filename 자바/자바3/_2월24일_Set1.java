package 자바3;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class _2월24일_Set1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet(); 		//hashcode(), equals()이용하여 동일객체여부 판단
		
		// 추가
		set.add("JAVA");
		set.add("JDBC");
		set.add("DB");
		set.add("JSP");
		set.add("Servlet");
		set.add("JSP");
		
//		//확인(저장수)
		System.out.println("총 개체수 : " + set.size());		//겹치는 개체는 하나로 출력됨
		
		for(String tmp : set) {
			System.out.println(tmp);
		}
		
		System.out.println("----------------");
		
//		//조회(복잡함)
		java.util.Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String tmp = iter.next();
			System.out.println(tmp);
		}
		
		//삭제
		set.remove("JAVA");
		System.out.println("총 개체수 : " + set.size());
		
		for(String tmp : set) {
			System.out.println(tmp);
		}
		
		
	}

}


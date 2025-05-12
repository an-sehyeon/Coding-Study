package 자바3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *Map이란
 *key값은 중복을 허용하지 않는다.
 *Value값은 중복을 허용한다.
 *Map은 리스트나 배열처럼 순차적으로 해당 요소 값을 구하지 않고 key를 통해 Value를 얻는 것 
 *Map의 특징으로는 key값을 통해서 value값을 찾아낼 수 있고 value값을 통해서 key값을 얻어낼 수 있다.
 *Map은 key로 value값을 얻어내는 것, 요소의 저장 순서를 유지하지 않는다.
 *
 */

public class _2월24일_map1 {		//map = 매칭
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap();
		
		//추가
		map.put("aaa", 1234);
		map.put("ddd", 2222);
		map.put("ccc", 3333);
		map.put("bbb", 1234);
		map.put("aaa", 1234);
		
		
		//개수
		System.out.println("저장 수 : " + map.size());
		
		//저장된 값 확인
		Set<String> set = map.keySet();
		for(String key : set) {
			System.out.printf("KEY : %s va1 : %d\n", key,map.get(key));
		}

		map.remove("1234");
		System.out.println("저장 수 : " + map.size());
		
	}

}


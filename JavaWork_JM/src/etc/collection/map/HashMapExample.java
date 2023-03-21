package etc.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
/*
	 	Map
	 	Key / Value가 한 세트를 이루는 자료구조
	 	Key값을 통해 Value를 참조하는 방식
	 	Key는 중복 저장을 허용하지 않는다
 */
		//Map은 Key, Value 쌍을 이루기 때문에 멀티 제네릭을 설정
		Map<String, String> map = new HashMap<>();
		
		//Map에 데이터를 추가하는 메서드: put(key, value)
		map.put("멍멍이", "김철수");
		map.put("야옹이", "홍길동");
		map.put("짹짹이", "박영희");
		System.out.println(map);
		
		//Map은 Key의 중복 저장을 허용하지 않습니다
		//만약 중복 Key를 사용하여 put을 호출하면 Value만 수정됩니다.
		map.put("멍멍이", "김개똥"); //key 중복 >> 기존 key에 value가 수정됨
		map.put("어흥이", "홍길동"); //value 중복 >> 상관없음
		System.out.println(map);

		//Map 내부에 key의 존재 유무를 확인하는 메서드: ContainsKey(key)
		System.out.println(map.containsKey("어흥"));
		
		//Map 내부의 값을 참조하는 법: get(key)
		String name = "멍멍이";
		if(map.containsKey(name)) {
			System.out.printf("%s의 별명을 가진 학생은 %s입니다.\n",name,map.get(name));
		}else {
			System.out.println("그런 학생 없습니다");
		}
		
		//map의 크기를 확이낳는 메서드: size()
		System.out.println(map.size());
		
		//Map에서 key들만 추출하는 메서드: keySet()
		//모든 key들을 Set에 담아서 반환
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k+" "+map.get(k));
		}
		
		//Map의 객체를 삭제: remove(key)
		//key를 주면 value도 함께 삭제
		map.remove("짹짹이");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
	}

}

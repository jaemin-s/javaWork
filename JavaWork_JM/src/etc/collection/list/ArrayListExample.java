package etc.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

/*
	ArrayList
	
	배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스
	
	배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근하기 좋다.
	
	인덱스를 활용하며, 객체의 중복 저장을 허용한다
	
 */
		
		List<String> nick = new ArrayList<>();
		
		String str = "야옹이";
		
		//add(객체): 리스트에 객체를 추가하는 메서드
		nick.add("멍멍이");
		nick.add(str);
		nick.add(new String("개구리"));
		nick.add("짹짹이");
		nick.add("야옹이");
		System.out.println(nick);
		
		//add(인덱스, 객체): 특정 인덱스에 개체를 삽입하는 메서드
		nick.add(3,"어흥이");
		System.out.println(nick);
		
		//get(인덱스): 리스트 내부의 객체롤 참조하는 메서드
		String name = nick.get(3);
		System.out.println(name);
		
		//size(): list의 크기를 반환
		System.out.println(nick.size());
		
		//set(인덱스, 수정할 객체): 리스트 내부의 객체를 수정
		nick.set(2, "삐약이");
		System.out.println(nick);
		
		//remove(인덱스), remove(객체)
		nick.remove("야옹이");
		System.out.println(nick);
		
		//리스트의 반복문 처리
		for(int i=0;i<nick.size();i++) {
			System.out.println(nick.get(i));
		}
		System.out.println();
		for(String n : nick) {
			System.out.println(n);
		}
		
		//contains(객체):리스트 내의 객체의 존재 유무를 파악하는 메서드
		System.out.println(nick.contains("삐약이"));
		
		//clear(): 리스트 내부 요소 전체 삭제
		nick.clear();
		System.out.println(nick);
		
		//isEmpty():리스트가 비어있는지의 여부 확인
		System.out.println(nick.isEmpty());
		
		//컬렉션 객체들은 Collections의 기능을 사용할 수 있습니다.
		//Collections는 컬렉션 객체들의 부가 기능들을 지원합니다.
		
		List<Integer> score = new ArrayList<>(); 
		score.add(6);
		
		//한번에 객체 많이 추가하기
		Collections.addAll(score, 12,85,31,5,47,12,78,10);
		System.out.println(score);
		
		//컬렉션에서 등장 횟수 구하기
		System.out.println(Collections.frequency(score, 31));
		
		//최대값, 최소값 구하기
		System.out.println(Collections.max(score));
		System.out.println(Collections.min(score));
		
		//오름차 정렬(작은값부터)
		Collections.sort(score);
		System.out.println(score);
		
		//내림차 정렬(sort >> reverse or sort(리스트 reverseOrder()))
		Collections.reverse(score);
		System.out.println(score);
//		Collections.sort(score, Collections.reverseOrder());
		
		//두 요소의 위치를 교체: swap(리스트, i, j)
		Collections.swap(score, 3, 7);
		System.out.println(score);
		
		//리스트 내의 요소를 무작위로 섞기
		Collections.shuffle(score);
		System.out.println(score);
		
		//원하는 값으로 컬렉션 초기화
		Collections.fill(score, 100);
		System.out.println(score);
		
	}

	

}

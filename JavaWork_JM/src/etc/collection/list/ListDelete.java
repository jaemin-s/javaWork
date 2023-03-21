package etc.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListDelete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> kakao = new ArrayList<>();
		Collections.addAll(kakao, "무지","네오","어피치","라이언","제이지","춘식이");
		System.out.println("현재 친구들: "+kakao);
		System.out.println("삭체할 친구를 입력: ");
		String name = sc.next();
		// 입력받은 이름을 리스트 내에서 삭제 후 출력
		// 없으면 없는 이름이라고 출력
		if(kakao.contains(name)) {
			kakao.remove(name);
		}else {
			System.out.println("없는 이름입니다.");
		}
		System.out.println(kakao);
		sc.close();
	}

}

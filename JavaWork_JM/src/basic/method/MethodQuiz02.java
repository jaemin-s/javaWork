package basic.method;

import java.util.Arrays;

public class MethodQuiz02 {

	static String[] foods = {"떡볶이", "치킨", "파스타"};

	//	배열의 맨 마지막 위치에 데이터를 추가하는 함수
	static void push(String newfood) {
		String[] temp = new String[foods.length+1];
		for(int i=0;i<foods.length;i++) {
			temp[i]=foods[i];
		}
		temp[foods.length]=newfood;
		foods=temp;
		System.out.println(newfood+"을(를) 추가했습니다");
		return;
	}

	//	배열 내부 데이터 단순 출력 함수
	static void printFood() {
		System.out.println(Arrays.toString(foods));
	}

	//	배열 내의 특정 음식의 위치를 찾아주는 함수
	static int indexOf(String targetName) {
		for(int i=0;i<foods.length;i++) {
			if(targetName.equals(foods[i])) {
				return i;
			}
		}
		return -1;
	}
	//	특정 음식의 배열 포함 여부(참/거짓)
	static boolean include(String targetName) {
		return (indexOf(targetName)==-1?false:true);
	}

	//	특정 음식 제거 함수
	static void remove(String targetName) {
		int idx = indexOf(targetName);
		if(idx==-1) {
			System.out.println(targetName+"은(는) 존재 하지 않는 음식입니다.");
			return;
		}
		String[] temp = new String[foods.length-1];
		for(int i=0;i<foods.length-1;i++) {
			if(i<idx) {
				temp[i]=foods[i];
			}else
				temp[i]=foods[i+1];
		}
		foods=temp;
		System.out.println(targetName+"을(를) 삭제했습니다");
		return;
	}

	//	특정 음식 수정 메서드
	static void modify(int targetIdx, String newFood) {
		System.out.print(foods[targetIdx]+"을(를) ");
		foods[targetIdx] = newFood;
		System.out.println(newFood+"로 수정했습니다");
		return;
	}

	public static void main(String[] args) {

		printFood();
		push("라면");
		push("김치찌개");
		printFood();

		System.out.println("---------구분선----------");
		//		파스타의 인덱스를 알아내세요
		System.out.println("파스타의 인덱스: "+indexOf("파스타"));
		//		김치찌개의 인덱스를 알아내세요
		System.out.println("김치찌개의 인덱스: "+indexOf("김치찌개"));
		//		짜장면의 인덱스를 알아내세요
		System.out.println("짜장면의 인덱스: "+indexOf("짜장면"));

		System.out.println("---------구분선----------");
		remove("김치찌개");
		remove("망고"); // 존재하지 않는 음식명입니다 출력
		printFood();

		System.out.println("---------구분선----------");
		//		라면의 존재 여부
		System.out.println(include("라면")?"있는 음식입니다.":"없는 음식입니다.");
		//		앙념치킨의 존재 여부
		System.out.println(include("양념치킨")?"있는 음식입니다.":"없는 음식입니다.");
		//		2번 인덱스 데이터를 닭갈비로 수정
		modify(2,"닭갈비");
		printFood();

		









	}

}

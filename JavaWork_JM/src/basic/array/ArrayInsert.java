package basic.array;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] names = new String[6];
		
		for(int i=0;i<names.length;i++) {
			System.out.print("name: ");
			String name = sc.next();
			
//			java에서 String은 기본 타입이 아니라서 '=='연산자의 비교가 불가능하다
//			String이 객체 참조 타입이기 때문
//			객체 참조 타입은 해당 값을 직접 들고 있는 게 아니라 객체의 주소값을 들고
//			있기 때문에, 문자열이 아무리 같더라도 주소가 다르면 false를 도출
			if(name.equals("그만")) {
				System.out.println("End");
				break;
			}
			names[i] = name;
		}
		
		System.out.println();
		System.out.print("names: ");
		for(String name : names) {
			if(name == null) break;
			System.out.print(name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}

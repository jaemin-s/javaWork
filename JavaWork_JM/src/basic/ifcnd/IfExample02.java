package basic.ifcnd;

import java.util.Scanner;

public class IfExample02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input age: ");
		int age = scan.nextInt();
		
		if(age >=20) {
			System.out.println("성인입니다");
		} else if(age >= 17) {
			System.out.println("고등학생입니다");
		} else if(age >= 14) {
			System.out.println("중학생입니다");
		} else if(age >= 8) {
			System.out.println("초등학생입니다");
		} else {
			System.out.println("미취학 아동입니다");
		}
		
		
//		문법적으로는 오류가 없으나 순서를 잘못 설정하면 결과가 제대로 안나옴
//		if(age >=20) {
//			System.out.println("성인입니다");
//		} else if(age >= 8) {
//			System.out.println("초등학생입니다");
//		} else if(age >= 17) {
//			System.out.println("고등학생입니다");
//		} else if(age >= 14) {
//			System.out.println("중학생입니다");
//		} else {
//			System.out.println("미취학 아동입니다");
//		}
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		

	}

}

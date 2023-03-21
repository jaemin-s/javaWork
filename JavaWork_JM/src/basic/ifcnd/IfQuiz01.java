package basic.ifcnd;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		
//		키와 나이를 입력받아서 사용자가 놀이기구에 탑승 할 수 있는지 여부를 판단
//		조건 키 140cm 이상, 나이 8세 이상 둘 다 만족시 탑승 가능
//		탑승 여부와 관계없이 "오늘 하루 즐거운 시간 되세요!" 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키를 입력하세요(cm): ");
		double hei = scan.nextDouble();
		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt();
		if(hei>=140 && age>=8) {
			System.out.println("놀이기구 탑승 가능합니다");
		} else {
			System.out.println("놀이기구 탑승 불가능합니다");
		}
		
		System.out.println("오늘 하루 즐거운 시간 되세요!");
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

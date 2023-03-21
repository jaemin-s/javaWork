package basic.ifcnd;

import java.util.Scanner;

public class IfExample03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/*
		 if의 중첩문
		 	else if문이 첫번째 조건식이 false일 경우 분기를 나눴다면
		 	if의 중첩문은 첫번째 조건식이 true인 경우 분기를 나누는 방식
		 	
		 변수의 사용 범위 (유효 범위)
		 	변수는 선언된 블록 내에서만 유효
		 	선언된 블록을 벗어나면 메모리에서 자동으로 소멸
		 	변수를 선언할 때 사용 범위를 잘 파악해서 알맞은 위치에서 선언		 	
		 */

		System.out.print("키(cm): ");
		double hei = scan.nextDouble();
		int age;

		//키 확인
		if(hei>=140) {
			System.out.print("나이: ");
			age = scan.nextInt();
			//키 140이상 중에서 나이 확인
			if(age>=8) {
				System.out.println("놀이기구 탑승 가능합니다");
			}else if(age>=6){
				System.out.println("보호자 동반 시 탑승 가능합니다");
			}else {
				System.out.println("나이가 6세 미만입니다\n놀이기구 탑승이 불가능합니다");
			}
		} else {
			System.out.println("키가 140cm입니다\n놀이기구 탑승이 불가능합니다");
		}
		
		
		scan.close();



















	}

}

package basic.ifcnd;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		
//		스캐너를 사용하여 정수를 하나 입력 받고
//		그 수가 7의 배수인지 아닌지와 0이면 0
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int num1 = scan.nextInt();
		
		if(num1==0) {
			System.out.println("0입니다");
		} else if((num1%7)==0) {
			System.out.println("7의 배수입니다");
		} else {
			System.out.println("7의 배수가 아닙니다");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

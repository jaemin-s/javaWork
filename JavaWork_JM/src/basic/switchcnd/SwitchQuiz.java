package basic.switchcnd;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		정수를 하나 입력받고, 연산자를 하나 입력 받고,다시 정수를 입력 받아서
//		사용자가 선택한 연산자 기준으로 출력(switch 사용)
		
		System.out.print("정수1 입력: ");
		int num1 = scan.nextInt()	;
		System.out.print("연산을 입력(+,-,*,/): ");
		String oper = scan.next()	;
		System.out.print("정수2 입력: ");
		int num2 = scan.nextInt()	;
		
		switch(oper) {
		case"+":
			System.out.println(num1+num2);
			break;
		case"-":
			System.out.println(num1-num2);
			break;
		case"*":
			System.out.println(num1*num2);
			break;
		case"/":
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다");
				break;
			}
			System.out.printf("%.2f\n",(double)num1/num2);
			break;			
		default:
			System.out.println("잘못된 연산자입니다(+,-,*,/)");
		}
		
		scan.close()	;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

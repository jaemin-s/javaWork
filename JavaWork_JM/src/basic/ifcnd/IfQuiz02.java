package basic.ifcnd;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		
//		정수 2개를 입력받아서, 두 정수 중 어느 수가 큰지 비교하여 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input int1: ");
		int num1 = scan.nextInt();
				
		System.out.print("input int2: ");
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+"이 큰 수 입니다");
		}else if(num1==num2) {
			System.out.println("같은 수 입니다");
		}else {
			System.out.println(num2+"이 큰 수 입니다");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

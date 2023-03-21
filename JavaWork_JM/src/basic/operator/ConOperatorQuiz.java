package basic.operator;

import java.util.Scanner;

public class ConOperatorQuiz {

	public static void main(String[] args) {
		
//		42 ~396 사이 난수를 발생시킨 후 홀수 짝수 여부를
//		3항 연산식으로 출력
//		
//		발생한 난수: xx
//		3항 연산의 결과 : yy입니다.
		
		Scanner scan = new Scanner(System.in);
		int num1 , num2 ;
		System.out.print("input num1: ");
		num1 = scan.nextInt();
		System.out.print("input num2: ");
		num2 = scan.nextInt();
		
		int num = (int) (Math.random()*(num2-num1+1)+num1);
		String result = (num%2==0?"짝수입니다":"홀수입니다");
		
		System.out.println(num1+"~"+num2+" 발생한 난수: "+num);
		System.out.println(result);
		
		scan.close();
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

		
	}

}

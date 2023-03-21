package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		
//		1. 2가지의 정수를 1~100사이 난수를 발생시켜서 지속적으로 문제를 출제하고
//		정답을 입력받고 0을 입력하면 반복문을 탈출
		
//		2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력
		
		System.out.println("***연산 퀴즈***");
		System.out.println("그만 하시려면 0을 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		
		int correctCount = 0;
		int incorrectCount = 0;
		
		while(true) {
			int x = (int)((Math.random()*99)+2);
			int y = (int)((Math.random()*99)+2);
			String oper;
			int temp = (int)(Math.random()*2);
			int answer;
			
			if(temp==0) {
				oper = "+";
				answer = x+y;
			}else {
				oper = "-";
				answer =x-y;
			}
			
			if(answer==0) continue;
			
			System.out.print(x+oper+y+"= ???\n>>");
			int inputAnswer = scan.nextInt();
			
			if(inputAnswer==answer) {
				System.out.println("정답입니다\n");
				correctCount++;
			} else if(inputAnswer==0) {
				System.out.println("종료합니다.\n");
				System.out.println("---------------------");
				System.out.println("정답 횟수: "+correctCount+"회");
				System.out.println("오답 횟수: "+incorrectCount+"회");
				break;
			} else {
				System.out.println("오답입니다");
				System.out.println("정답은 "+answer+"입니다\n");
				incorrectCount++;
			}
		}

		
				
		scan.close();
		
		
		
		
		
		
		

	}

}

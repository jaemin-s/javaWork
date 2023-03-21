package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {

	public static void main(String[] args) {
		
		/*
        # UP&DOWN 게임을 제작합니다.
        1. 기준이 되는 수는 난수 범위 1~100까지로 지정해 주세요.
        2. 사용자에게 정답을 입력받아서, 기준이 되는 수보다
        작은 수를 입력하면 UP, 큰 수를 입력하면 DOWN이라고 출력해서
        정답에 근접할 수 있도록 유도해 주세요.
        3. 승리 조건 횟수는 7회로 제한하겠습니다.
        7회가 넘어가도 정답은 계속 맞출 수 있도록 작성해 주세요.
        정답을 맞췄다면, 반복문 종료와 함께 승리/패배 여부를 알려 주세요.
        */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("### UP&DOWN GAME!!! ###");
		int answer = (int)((Math.random()*100)+1);
		int answerCount = 1;

		while(true) {
			System.out.print("\n정답을 입력해주세요(1~100) ");
			System.out.println(answerCount<=7?"남은 기회 "+(8-answerCount):"기회 소진");
			int input = scan.nextInt();
			if(input==answer) {
				System.out.println("\n정답입니다 "+answerCount+"번 만에 맞췄습니다");
				System.out.println(answerCount<=7?"승리":"패배");
				break;
			}else {
				System.out.println(input<answer?"UP!":"DOWN!");
			}
			answerCount++;
		}

		scan.close();
		

	}

}

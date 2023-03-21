package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		구구단 단수를 입력받아서 해당 단수의 구구단 출력
		
		System.out.print("구구단을 입력: ");
		int tms = scan.nextInt(); // tms = 단수
		
		int i=1;
		
		while(i<=9) {
			System.out.println(tms+"x"+i+"="+tms*i);
			i++;
		}
		
		
		
		scan.close();
		
		

	}

}

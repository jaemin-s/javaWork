package basic.ifcnd;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		System.out.println("내 점수: "+score+"점");
		System.out.println("----------------------------------");
		
		if(score >= 70) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다");
		}
		
		System.out.println("수고하셨습니다");
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

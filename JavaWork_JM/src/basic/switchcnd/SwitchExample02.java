package basic.switchcnd;

import java.util.Scanner;

public class SwitchExample02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input score: ");
		int score = scan.nextInt();
		
		switch(score/10) {
//		91,92,93... 모든 경우를 다 작성할 경우 코드가 길어지므로 계산식을 통해 줄일 수 있지만
//		예외 경우가 발생할 수 있음
		case 10: 
			if(score>100) {
				System.out.println("wrong score");
				break;
			}
		case 9:
			System.out.println("your grade is A");
			break;
		case 8:
			System.out.println("your grade is B");
			break;
		case 7:
			System.out.println("your grade is C");
			break;
		case 6:
			System.out.println("your grade is D");
			break;
		default:
			if(score<0||score>100) {
			System.out.println("wrong score");	
			}else {
			System.out.println("your grade is F");
			}
		}
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		



		
		
	}

}

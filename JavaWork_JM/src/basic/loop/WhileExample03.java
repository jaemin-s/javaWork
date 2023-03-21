package basic.loop;

import java.util.Scanner;

public class WhileExample03 {

	public static void main(String[] args) {
		
//		정수 1개를 입력받아서 해당 정수가 소수인지를 판별
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1보다 큰 수를 입력하세요: ");
		int num = scan.nextInt()	;
		int i = 2;
		boolean flag = false;
		if(num<=1) {
			System.out.println("잘못입력 했습니다");
		}else {
			//정상 입력했을 때
			while(i<num) {
				if(num%i==0) {
					flag = true;
				}
				i++;
			}

			System.out.println(!flag?num+"은(는) 소수입니다":
				num+"은(는) 소수가 아닙니다");
		}
		scan.close();
		
		
		

	}

}

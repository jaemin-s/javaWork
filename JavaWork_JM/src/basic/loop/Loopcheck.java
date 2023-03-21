package basic.loop;

import java.util.Scanner;

public class Loopcheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("input number: ");
		int num = scan.nextInt()	;
		// 정수 입력 받음
		
		int cnt = 0; // 최종 개수
		
		for(int i=2;i<=num;i++) { //2부터 num까지 반복
			int tmpcnt = 0;
			for(int j=2;j<i;j++) { //i가 소수인지 판별. 2부터 i-1까지 나눠지는 수가 있는지
				if(i%j==0) { //나눠지면, 소수가 아니면 tmpcnt+
					tmpcnt++;
				}
			}
			if(tmpcnt==0) { //tmpcnt가 0이면,즉 i가 소수면
				System.out.print(i);
				cnt++;
			}
		}
		scan.close();
		System.out.println();
		System.out.println("cnt:"+cnt);

	}

}

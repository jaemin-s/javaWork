package basic.loop;

import java.util.Scanner;

public class LoopNesting02 {

	public static void main(String[] args) {
		
		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
        */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input number: ");
		int num = scan.nextInt()	;
		System.out.println("입력받은 수: "+num);
		
		int cnt=0;
		
		scan.close();
		
		for(int x=2;x<=num;x++) {
			boolean flag = false;
			for(int i=2;i<x;i++) {
				if(x%i==0) {
					flag = true;
				}
			}
			if(!flag) {
				System.out.print(x+" ");
				cnt++;
			}
		}
		
		System.out.println("\n소수의 개수: "+cnt);
		
		System.out.println();
		System.out.println();
		cnt=0;
		
		for(int b=2;b<=num;b++) {
			int count = 0;
			for(int a=1;a<=b;a++) {
				if(b%a==0) {
					count++;
				}
			}
			if(count ==2) {
				System.out.print(b+" ");
				cnt++;
			}
		}
		System.out.println("\n소수의 개수: "+cnt);
		
	}

}

package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		
		int total = 0;
		
//		int i = 1;
//		while(i<=10) {
//			total+=i++;
//		}
		
//		for(begin; end; step){
//		}
		
		for(int i=1; i<=10; i++) {
			total+=i;
		}
		
		System.out.println(total);
		
//		1~200 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력(for)
		
		for(int start=1;start<=200;start++) {
			if(start%6==0&&start%12!=0) {
				System.out.print(start+" ");
			}
		}
		
		System.out.println();
		
//		1~60000 정수 중 177의 배수의 개수(for)
		int cnt=0;
		for(int i =1;i<=60000;i++) {
			if(i%177==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
//		입력받은 정수까지의 팩토리얼 값을 구하세요
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input int: ");
		int num = scan.nextInt()	;
		
		long sum=1L;
		for(int i=1;i<=num;i++) {
			sum*=(long)i;
		}
		
		System.out.println(sum+" "+(int)sum);
		
		scan.close();
		

	}

}

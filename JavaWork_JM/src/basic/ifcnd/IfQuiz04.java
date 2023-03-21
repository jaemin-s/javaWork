package basic.ifcnd;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {
		
//		정수 3개를 입력 받고, 가장 큰값 ,가장 작은 값, 중간 값을 구해서 출력
		
		Scanner scan = new Scanner(System.in);
		
		int max,min,mid ;
		
		System.out.print("정수1: ");
		int num1 = scan.nextInt();
		System.out.print("정수2: ");
		int num2 = scan.nextInt();
		System.out.print("정수3: ");
		int num3 = scan.nextInt();

		if(num1>num2&&num1>num3) {
			//num1이 최대값일 때
			max = num1;
			if(num2>num3) {
				//num1>num2>num3
				mid = num2;	min = num3;
			}else {
				//num1>num3>num2
				mid = num3;	min = num2;
			}
		}else if(num2>num1&&num2>num3) {
			//num2가 최대값일 때
			max = num2;
			if(num1>num3) {
				//num2>num1>num3
				mid = num1;	min = num3;
			}else {
				//num2>num3>num1
				mid = num3;	min = num1;
			}
		}else {
			//num3가 최대값일 때
			max = num3;
			if(num1>num2) {
				//num3>num1>num2
				mid = num1;	min = num2;
			}else {
				//num3>num2>num1
				mid = num2;	min = num1;
			}
		}
				
//		if(num1>num2) {
//			//num1>num2
//			if(num2>num3) {
//				//num1>num2>num3
//				max = num1;	mid = num2;	min = num3;
//			}else {
//				if(num3>num1) {
//					//num3>num1>num2
//					max = num3;	mid = num1;	min = num2;
//				}else {
//					//num1>num3>num2
//					max = num1;	mid = num3;	min = num2;
//				}
//			}
//		}else if(num2>num3) {
//			if(num1>num3) {
//				//num2>num1>num3
//				max = num2;	mid = num1;	min = num3;
//			}else {
//				//num2>num3>num1
//				max = num2;	mid = num3;	min = num1;
//			}
//		}else {
//			//num3>num2>num1
//			max = num3; mid = num2;	min = num1;
//		}
		
	
	
		System.out.println("\n최대값: "+max+"\n중간값: "+mid+" \n최소값: "+min);
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

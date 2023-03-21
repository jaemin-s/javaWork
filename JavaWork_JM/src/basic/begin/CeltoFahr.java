package basic.begin;

import java.util.Scanner;

public class CeltoFahr {
	
	public static void main(String[] args) {
//		섭시를 화씨로
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("℃를 입력하세요: ");
		double cel = input.nextDouble(), fahr = 32+(1.8*cel);

//		System.out.print("℃를 입력하세요: ");
//		int cel = input.nextInt();
//		double fahr = 9/5*cel+32;
		
		
		
//		System.out.println(fahr+"℉입니다.");
		System.out.printf("%.1f℉입니다.",fahr);
		
		input.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package basic.begin;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.printf("이름: ");
		String name = sc.next();
		System.out.printf("나이: ");
		int age = sc.nextInt(), birth = 2023 - age;
		sc.close();
		
		System.out.printf("\n이름: %s\n나이: %d\n출생년도: %d년\n",name,age,birth);
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

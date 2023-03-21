package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input number: ");
		int num = scan.nextInt()	;
		
		int i=1;
		int sum=0;
		while(i<=num) {
			if(num%i==0) {
				sum+=i;
			}
			i++;
		}
		
		System.out.println("sum: "+sum);
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

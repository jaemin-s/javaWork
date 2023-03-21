package chap1;

import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		System.out.println("중복없이 숫자 10개를 입력하세요");

		int max=nums[0];
		for(int num : nums) {
			System.out.print("입력: ");
			num = sc.nextInt();
			if(max<num) {
				max=num;
			}
		}
		
		System.out.println("가장 큰 값: "+max);
	
		
		sc.close();
	}

}

package chap1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] stuNums = new int[10];
		int[] check = new int[8];
		for(int i=0;i<stuNums.length;i++) { // 학생 번호 등록
			stuNums[i]=i+1;
		}
		System.out.println(Arrays.toString(stuNums));

		for(int i=0;i<8;i++) { // 출석번호 입력
			System.out.print("출석번호 입력: ");
			check[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(check));

		System.out.println("숙제를 안 낸 학생의 번호: ");
		for(int i=0;i<stuNums.length;i++) {
			boolean flag = false;
			for(int j=0;j<check.length;j++) {
				if(stuNums[i]==check[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(stuNums[i]);
			}
		}















		sc.close();
	}

}

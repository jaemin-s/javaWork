package chap1;

import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[5];
		int[] scoresRank = new int[scores.length];
		
		for(int i=0;i<scores.length;i++) {
			System.out.print("점수 입력: ");
			scores[i] = sc.nextInt();
		}
		
		for(int i=0;i<scores.length;i++) {
			scoresRank[i] = 1;
			for(int j=0;j<scores.length;j++) {
				if(scores[j]>scores[i]) {
					scoresRank[i]++;
				}
			}
		}
		
		System.out.println("점수\t순위");
		System.out.println("-------------");
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]+"\t"+scoresRank[i]);
		}
		
		
		
		
		
		
		
		
		

		sc.close();
	}

}

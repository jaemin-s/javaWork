package basic.array;

import java.util.Scanner;

public class Array2DQuiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] score = {
				{79,80,99}, //a학생
				{95,85,89}, //b학생
				{90,65,56}, //c학생
				{69,78,77} //d학생
				//3과목
		};
		String[] stuName = {"a학생","b학생","c학생","d학생"};
		String[] subName = {"국어", "영어", "수학"};

		/*
		 1. 각 학생의 평균을 소수점 첫째 자리까지 출력해보세요
		 2. 각 과목의 평균을 출력해 보세요
		 3. 반 평균을 출력해 보세요
		 */
		int[] subSum = new int[subName.length];
		int total=0;

		for(int i=0;i<stuName.length;i++) {
			int stuSum=0;
			for(int j=0;j<subName.length;j++) {
				stuSum+=score[i][j];
				subSum[j]+=score[i][j];
				total+=score[i][j];
			}
			System.out.printf("%s의 평균: %.1f\n",stuName[i],(double)stuSum/subName.length);
		}

		System.out.println("----------------------------------------");

		for(int i=0;i<subName.length;i++) {
			System.out.printf("%s의 평균: %.1f\n",subName[i],(double)subSum[i]/stuName.length);
		}

		System.out.println("----------------------------------------");
		System.out.printf("반 평균: %.1f\n",(double)total/(stuName.length*subName.length));
		

		sc.close();

	}

}

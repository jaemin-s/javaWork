package basic.ifcnd;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		국영수 점수를 각각 입력받아서 평균을 구하자, 소수점 첫째 자리까지
//		평균이 90점이 넘으면
//		100~95 : A+ , 94~90 : A0
//		89~80 : B, 79~70 : C, 69~60 : D, 나머지 F
		
		System.out.print("국어 점수: ");
		int kor = scan.nextInt();
		if(kor<0||kor>100) {
			
		}
		System.out.print("영어 점수: ");
		int eng = scan.nextInt();
		System.out.print("수학 점수: ");
		int math = scan.nextInt();
		double mid = (double)(kor+eng+math)/3;
		String grade;	
		
		if(kor<0||kor>100||eng<0||eng>100||math<0||math>100) {
			System.out.println("점수를 잘못 입력했습니다");
		}else {
			if(mid>=90) {
				if(mid>=95) {
					grade = "A+";
				}else {
					grade = "A0";
				}
			}else if(mid>=80) {
				grade = "B";
			}else if(mid>=70) {
				grade = "C";
			}else if(mid>=60) {
				grade = "D";
			}else {
				grade = "F";
			}
			System.out.printf("평균 점수: %.1f\n당신의 학점은 %s 입니다",mid,grade);
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package oop.obj_arr;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		/*
        - Score 객체를 담을 수 있는 배열을 선언하세요.
         배열의 크기는 넉넉하게 100개로 하겠습니다.

        - 반복문을 이용해서 사용자에게 이름, 국어, 영어, 수학점수를
        입력받은 후, 입력받은 점수를 토대로 Score 객체를 생성하세요.
        총점과 평균은 여러분들이 직접 구해서 넣으셔야 합니다.
        (직접 넣으시든, 메서드를 하나 만들어서 계산하시든 마음대로~)
        객체 생성 후, 미리 만들어 놓은 배열에 객체를 추가해 주세요.
        이름 입력란에 '그만' 이라고 입력하면 반복문을 종료시켜 주세요.

        - 반복문이 종료되었다면, 배열 내부에 있는 객체들을 순회하면서
         scoreInfo()를 모두 불러주세요. (반복문)
         주의!) 입력이 중간에 그만두어진다면, 배열의 나머지 인덱스는
         모두 null로 가득 차 있습니다. (null.scoreInfo() -> 에러)
		 */
		
		Score[] scores = new Score[100];
		int idx=0;
		while(true) {
			Scanner sc = new Scanner(System.in);
			try { // try 시작
				System.out.print("이름 입력('그만'입력시 종료): ");
				String name = sc.next().trim();
				if(name.equals("그만")) {
					System.out.println("종료합니다");
					sc.close();
					break;
				}
				Score.isOk(name);

				System.out.println("국어 점수 입력: ");
				int kor = sc.nextInt();
				Score.isOk(kor);

				System.out.println("영어 점수 입력: ");
				int eng = sc.nextInt();
				Score.isOk(eng);

				System.out.println("수학 점수 입력: ");
				int math = sc.nextInt();
				Score.isOk(math);
				
				scores[idx] = new Score(name,kor,eng,math);

				if(idx==scores.length-1) {
					sc.close();
					break;
				}
				idx++;
				//try 끝
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다.");
				scores[idx]=null;
				sc.nextLine();
			}catch (Exception e) {
				System.out.println("알 수 없는 에러");
				scores[idx]=null;
			}
		}

		for(int i=0;i<idx;i++) {
			scores[i].scoreInfo();
		}












	}

}

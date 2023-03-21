package oop.obj_arr;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class Score {

	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을
     담을 수 있는 객체를 디자인하세요.

    - 학생의 모든 정보를 한 눈에 확인할 수 있게
     scoreInfo() 메서드를 선언해 주세요.
     메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.

    - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
	 */
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	
	public Score(String name) {
		this.name = name;
	}

	public Score(String name, int kor, int eng, int math) {
		setName(name);
		setKor(kor);
		setEng(eng);
		setMath(math);
		sum = kor+eng+math;
		avg = Math.round(sum*100)/100.0;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		isOk(name.trim());
		this.name = name.trim();
	}

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		isOk(kor);
		this.kor = kor;
		setSum(); setAvg();
	}

	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		isOk(eng);
		this.eng = eng;
		setSum(); setAvg();
	}

	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		isOk(math);
		this.math = math;
		setSum(); setAvg();
	}

	public int getSum() {
		return sum;
	}
	public void setSum() {
		sum = kor + eng + math;
		return;
	}

	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		avg = Math.round(sum*100)/100.0;
	}

	public static void isOk(String name){
		if(Pattern.matches("^[가-힣]*$", name) && name.length()<10) {
			return;
		}else {
			throw new InputMismatchException();
		}
	}
	public static void isOk(int score){
		if(score>=0&&score<=100) {
		}else {
			throw new InputMismatchException();
		}
	}

	public void scoreInfo() {
		System.out.println("--------INFO---------");
		System.out.println("이름: "+name);
		System.out.println("국어 점수: "+kor);
		System.out.println("영어 점수: "+eng);
		System.out.println("수학 점수: "+math);
		System.out.println("총 점수: "+sum);
		System.out.printf("평균 점수: %.1f\n",avg);
		System.out.println("---------------------");
	}

}

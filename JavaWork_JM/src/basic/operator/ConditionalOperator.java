package basic.operator;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		/*
		 3항 연산자
		 피 연산자가 3개 인 연산자 (조건식 ? 좌항 : 우항);
		 조건식을 비교해서 true면 좌항, false면 우항 값을 도출 
		 */
		
		int x =30, y=20;
		String result;
		
		result = (x>y?"x is big":"y is big");
		System.out.println(result);
		
//		난수를 발생시키는 메서드 Math.random();
//		기본 범위는 0.0 이상 1.0미만의 실수 난수값을 반환
//		
		
//		double rn = Math.random();
//		System.out.println(rn);
		
//		범위 지정 Math.random()을 더하거나 곱해서 수정
//		뒷 범위를 먼저 수정하고 그다음 앞 자리를 수정
//		min~max = (Math.random()*(max+1-min)+min)
		
		int rnum = (int)(Math.random()*10)+1;
		System.out.println(rnum);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*91)+10);
		System.out.println((int)(Math.random()*91)+10);
		System.out.println((int)(Math.random()*91)+10);
		System.out.println((int)(Math.random()*91)+10);
		System.out.println((int)(Math.random()*91)+10);
		System.out.println((int)(Math.random()*91)+10);
		System.out.println((int)(Math.random()*91)+10);
		
		int max = 176,min = 34;
		int num3 = (int)(Math.random()*(max+1-min))+min;
		
		System.out.println(num3);
		
		
		
		
		
		
		
		

	}

}

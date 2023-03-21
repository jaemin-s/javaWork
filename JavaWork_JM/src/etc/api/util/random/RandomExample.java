package etc.api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//실수 난수: 0.0 < 1.0
		double d = r.nextDouble();
		System.out.println(d);
		
		//정수 난수: nextInt();
		int i = r.nextInt(); //기본범위는 int의 전범위
		System.out.println(i);
		
		//0~5 정수 난수
		int j = r.nextInt(6);
		System.out.println(j);
		
		//10~100
		int k = r.nextInt(91)+10;
		System.out.println(k);
		
		
		
		

	}

}

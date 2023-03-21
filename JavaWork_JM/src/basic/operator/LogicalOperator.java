package basic.operator;

import java.io.Writer;

public class LogicalOperator {

	public static void main(String[] args) {
		
//		비교(관계) 연산자 : <,<=,>,>=,==,!=
//		좌항과 우항의 크기를 비교하여, 결과값으로 항상 논리형 타입의 값을 도출
		
		int x = 10, y = 20;
		System.out.println(x!=y);
		
//		논리 연산자 : &,&&,|,||
//		좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출
//		&,&&[and] : 양쪽 항의 논리값이 모두 true일 경우 true
//		|,||[or] : 양쪽 항의 논리값 중 한쪽만 true여도 true
		
//		&&,|| : 단축 평가 연산(short curcuit operation)
//		좌항의 연산 결과가 전체 연산 결과에 영향을 미칠 경우 우항의 연산을 진행하지 않음
		
		System.out.println(x>10&y!=10);
		System.out.println(x>10|y<30);
		
//		논리 반전 연산자 : !(단항))
//		단순히 논리값을 반전시킬 때 사용
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

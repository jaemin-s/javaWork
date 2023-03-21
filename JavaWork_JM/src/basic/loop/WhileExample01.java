package basic.loop;

public class WhileExample01 {
	
	public static void main(String[] args) {
		
		/*
		 while 문의 진행 순서
		 1. 제어변수를 선언 (시작값을 정함)
		 2. while문의 조건식을 검사해서 true면 반복문 시작
		 false라면 반복문 종료
		 3. while문 블록 내부가 한 번 진행되면 다시 조건식을 검사하고 반복함
		 4. 반복문 내에는 증감식을 배치해서 제어변수의 값을 조정
		 */
		
		int n = 1; // 제어변수: 반복문의 횟수를 제어할 변수(begin)
		int sum=0;
		while(n<=10) { // while의 괄호안에는 논리형 조건식이 들어감
			// 논리형 조건식: 반복문의 끝을 지정(end)
			System.out.println("Hello n: "+n);
			n++;// 증감식: 반복문의 종료를 위해 제어변수의 값을 조정 (step)
		}
		
		int m = 1;
		while(m<=10) {
			System.out.println("m= "+m);
			sum += m++;
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

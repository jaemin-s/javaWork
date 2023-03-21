package basic.loop;

public class LoopNesting01 {

	public static void main(String[] args) {
		
		/*
		 반복문 중첩 (loop nesting)
		  외부 반복문 내부에 내부 반복문이 존재하는 형태
		  반복문 자체를 반복시켜야 할 경우 사용
		  내부 반복문이 종료가 되어도, 외부 반복문이 끝나지 않으면
		  내부 반복문은 외부 반복문의 제어변수의 크기 및 범위까지 계속 반복 실행
	  	
		 
		 */
		
		for(int x=2;x<=9;x++) {
			for(int y=1;y<=9;y++) {
				System.out.printf("%d * %d = %d\n",x,y,x*y);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

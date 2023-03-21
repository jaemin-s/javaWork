package basic.loop;

import java.util.Scanner;

public class WhileQuiz03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
        1. 정수를 두개 입력받으세요. (x, y)
        2. x부터 y까지의 누적합계를 while을 사용하여 구하는 코드를 작성하세요.
        ex) 입력: 3, 7 -> "3부터 7까지의 누적합계: 25"

        처음에는 x에 무조건 작은 값이 들어올 것이라고 예상하고 작성하겠습니다.
        다 하신 분은 만약 x에 큰 값이 들어왔을 경우에는
        어떻게 대처할 지 생각해 보세요.
        (x에 큰 값이 들어와도 정상적으로 출력이 되었으면 좋겠습니다.
        입력: 7, 3 -> "3부터 7까지의 누적합계: 25")
        - while문을 if else 로 나눠서 두번 쓰는 것은 지양하겠습니다.
		 */
		
		System.out.print("정수1를 입력: ");
		int num1 = scan.nextInt()	;
		System.out.print("정수2를 입력: ");
		int num2 = scan.nextInt()	;
		int sum=0;
		
//		삼항연산자 가능
		int start,end;
		if(num1>num2) {
			end=num1; start=num2;
		}else {
			start=num1; end=num2;
		}
		
//		임시 변수를 활용한 값의 스위칭도 가능
//		if(num1>num2) {
//			int temp = num1; num1=num2; num2=num1; 
//		}
		
		while(start<=end) {
			sum+=start++;
		}
		System.out.println("누적합계: "+sum);
		
		scan.close();
		
		

	}

}

package level02;

import java.util.Scanner;

public class Q01_1330 {

	public static void main(String[] args) {
//		두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
//		첫째 줄에 다음 세 가지 중 하나를 출력한다.
//
//		A가 B보다 큰 경우에는 '>'를 출력한다.
//		A가 B보다 작은 경우에는 '<'를 출력한다.
//		A와 B가 같은 경우에는 '=='를 출력한다.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		if(a>b) {
			System.out.print(">");
		}else if(a<b) {
			System.out.print("<");
		}else {
			System.out.println("==");
		}
		sc.close();
	}

}

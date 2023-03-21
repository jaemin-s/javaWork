package level01;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double result = (double)a/b;
		System.out.print(result);
		sc.close();
	}
}

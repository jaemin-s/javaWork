package level02;

import java.util.Scanner;

public class Q04_14681 {

	public static void main(String[] args) {
		// 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 
		// 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
		
		// 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		if(x>0) System.out.println(y>0?1:4);
		else System.out.println(y>0?2:3);
		
		sc.close();
	}

}

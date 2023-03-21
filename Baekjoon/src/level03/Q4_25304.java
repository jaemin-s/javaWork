package level03;

import java.util.Scanner;

public class Q4_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int num = sc.nextInt();
		for(int i = 0;i<num;i++){
			total -= sc.nextInt()*sc.nextInt();
		}
		if(total==0){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
		sc.close();

	}

}

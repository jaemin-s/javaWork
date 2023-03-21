package level03;
import java.util.Scanner;

public class Q5_25314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n/4;i++) {
			System.out.print("long ");
		}
		System.out.println("int");
		sc.close();
	}

}

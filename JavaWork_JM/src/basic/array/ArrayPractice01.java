package basic.array;

//import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice01 {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		String[] cardsName = new String[52];
		int[] cardsNumber = new int[52];

		int j = 1;
		String sign;
		for(int i=0;i<52;i++) {
			if(j>13) j=1;
			if(i<13) {
				sign = "◆";
			} else if(i<26) {
				sign = "♠";
			} else if(i<39) {
				sign = "♥";
			} else {
				sign = "♣";
			}

			switch(j) {
			case 1:
				cardsName[i] = sign+"A";
				break;
			case 11:
				cardsName[i] = sign+"J";
				break;
			case 12:
				cardsName[i] = sign+"Q";
				break;
			case 13:
				cardsName[i] = sign+"K";
				break;
			default :
				cardsName[i] = sign+j;
			}
			cardsNumber[i] = j;
			j++;
		}
		
//		System.out.println(Arrays.toString(cardsName));
		
		int[] check = new int[52];
		int count = 0;
		int sum = 0;
		start: while(true) {
			
			int tempNumber = (int)(Math.random()*51);
			for(int k=0;k<count;k++) {
				if(check[k]==tempNumber) {
					continue start;
				}
			}
			int checkedNumber = tempNumber;
			
			System.out.print("Card?(Y/N) :");
			String input = sc.next();
			if(input.equals("Y")||input.equals("y")) {
				System.out.println(cardsName[checkedNumber]);
				sum +=cardsNumber[checkedNumber];
				count++;
			}else if(input.equals("N")||input.equals("n")) {
				break;
			}else {
				continue start;
			}
			if(sum>=21) break;
		}

		System.out.println("Total: "+sum);


		sc.close();

	}
}
package basic.array;

import java.util.Scanner;

public class ArrayInsertQuiz01 {

	public static void main(String[] args) {
		/*
        1. String 배열을 생성하세요. (foods)
        크기는 넉넉하게 50개로 지정하겠습니다.

        2. 사용자에게 음식 이름을 입력받아서 배열에
         삽입해 주세요.
         사용자가 음식 입력창에 '배불러' 라고 작성하면
         입력을 종료해 주세요.

        3. 입력이 종료되면 사용자가 입력한 음식을
        가로로 출력해 주세요. (null은 출력하지 마세요.)

         추가 문제 
        - 입력을 받았는데 이미 배열에 존재하는 음식이라면
        '이미 존재하는 음식입니다.' 를 출력하고
        다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.

        */
		
		Scanner sc = new Scanner(System.in);
		
		String[] foods = new String[50];
		
		System.out.println("input food('full' to end): ");
		
		start: for(int i=0;i<foods.length;i++) {
			System.out.print(">> ");
			String foodCheck = sc.next();
			for(int j = 0;j<i;j++) {
				if(foodCheck.equals(foods[j])) {
					System.out.println("found the same food");
					i--;
					continue start;
				}
			}
			foods[i] = foodCheck;
			if(foods[i].equals("full")) {
				foods[i]=null; 
				System.out.println("\nEnd\n");
				break;
			}
		}
		
		System.out.println("foods: ");
		
		for(int i=0;i<foods.length;i++) {
			if(foods[i]==null) break; 
			System.out.print(foods[i]+" ");
			}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

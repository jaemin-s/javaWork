package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {
		
		String[] foods = {"삽겹살", "족발", "피자", "햄버거"};
		System.out.println(Arrays.toString(foods));
		
		foods[0] = "치킨";
		foods[3] = "짜장면";
		
		System.out.println(Arrays.toString(foods));
		
		for(String food : foods) {
			if(food==null) {
				break;
			}
			System.out.print(food+" ");
		}
		
		System.out.println();
		
//		배열의 인덱스 탐색
		Scanner sc = new Scanner(System.in);
		System.out.print("input food for serching: ");
		String name = sc.next();
		
//		boolean flag = false;
//	
//		for(int i = 0; i<foods.length; i++) {
//			if(foods[i].equals(name)) {
//				System.out.println("finish serching");
//				System.out.println("index: "+i);
//				flag = true;
//				break;
//			}
//		}
//		if(!flag) {
//			System.out.println("not exist");
//		}
//		
		for(int i = 0; i<foods.length; i++) {
			if(foods[i].equals(name)) {
				System.out.println("finish serching");
				System.out.println("index: "+i);
				break;
			}
			if(i==(foods.length-1)){
				System.out.println("not exist");
			}
			
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	}

package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
		System.out.println(Arrays.toString(kakao));
		
		System.out.print("삭제를 원하는 친구를 입력하세요: ");
		String name = sc.next();

		//		삭제할 친구를 입력받아서 삭제

		//		입력받은 이름이 없다면 없다고 출력
		
		//		int findN = kakao.length;
		//
		//		for(int i=0;i<kakao.length;i++) {
		//			if(name.equals(kakao[i])) {
		//				findN = i;
		//				break;
		//			}
		//		}
		//		
		//		if(findN!=kakao.length) {
		//			String[] temp = new String[kakao.length-1];
		//			for(int j=0;j<kakao.length-1;j++) {
		//				if(j<findN) {
		//					temp[j]=kakao[j];
		//				}else {
		//					temp[j]=kakao[j+1];
		//				}
		//			}
		//			kakao=temp;
		//			temp=null;
		//			System.out.println(Arrays.toString(kakao));
		//		}else {
		//			System.out.println("그런 이름 없습니다");
		//		}

		boolean flag = false;

		for(int i=0;i<kakao.length;i++) {
			if(name.equals(kakao[i])) {
				for(int k=i;k<kakao.length-1;k++) {
					kakao[k]=kakao[k+1];
				}
				flag = true;
				break;
			}
		}

		if(flag) {
			String[] temp= new String[kakao.length-1];
			for(int i=0;i<kakao.length-1;i++) {
				temp[i]=kakao[i];
			}
			kakao=temp;
			temp=null;
			System.out.println(Arrays.toString(kakao));
		}else {
			System.out.println("그런 이름 없습니다");
		}
		sc.close();


	}

}

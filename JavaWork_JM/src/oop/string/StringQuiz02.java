package oop.string;

import java.util.Scanner;

public class StringQuiz02 {
	
	static boolean isNum(String str) {
		
		for(int i=0;i<str.length();i++) {
			int a = Integer.valueOf(str.charAt(i));
			if(a<48||a>57) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 주민등록번호 13자리를 입력받습니다.
		// 2. 주민등록번호 -을 포합해서 받을 예정입니다.
		// 3. 13자리가 아니라면 다시 입력받습니다.
		// 4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다

		System.out.print("주민등록번호를 입력해주세요(-포함): ");
		String num;
		while(true){
			boolean flag = false;
			num = sc.next().trim();
			if(num.length()!=14) {
				flag = true;
			} else if(num.split("-").length!=2){
				flag = true;
			} else if('-'!=num.charAt(6)) {
				flag = true;
			} else if(!isNum(num.replace("-", ""))) {
				flag = true;
			}
			
			
			if(!flag) {
				break;
			}else {
				System.out.print("다시 입력해주세요: ");
			}
		}
		
		if(Integer.valueOf(num.charAt(7))%2!=0) {
			System.out.println("남자입니다.");
		} else {
			System.out.println("여자입니다.");
		} 















		sc.close();
	}

}

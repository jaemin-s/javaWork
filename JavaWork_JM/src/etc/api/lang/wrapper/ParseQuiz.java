package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {



	public static void main(String[] args) {

		//주민등록번호 입력 987654-1234567, 정확한 입력때 까지 반복
		//1. '-' 필수, 정수입력, 뒷자리 첫숫자 1,2,3,4만
		//2. yyyy년 mm월 dd일 xx세 성별 출력

		Scanner sc = new Scanner(System.in);
		int yy; int mm; int dd;
		String gender; 

		start: while(true) {
			System.out.print("주민등록번호를 입력하세요: ");
			String input = sc.next().trim();

			if(input.length()!=14) {
				System.out.println("정확한 입력해주세요");
				continue start;
			}
			if(input.indexOf("-")==-1) {
				System.out.println("'-'를 포함해주세요");
				continue start;
			}
			try {
				Integer.parseInt(input.substring(0,6));
				Integer.parseInt(input.substring(7,14));
			} catch (Exception e) {
				System.out.println("정수를 입력해주세요");
				continue start;
			}
			int x = Integer.parseInt(input.substring(7,8));
			if(x==1) {
				gender = "남자"; yy= 1900+Integer.parseInt(input.substring(0, 2));
			} else if(x==3) {
				gender = "남자"; yy= 2000+Integer.parseInt(input.substring(0, 2));
			} else if(x==2) { 
				gender = "여자"; yy= 1900+Integer.parseInt(input.substring(0, 2));
			} else if(x==4) { 
				gender = "여자"; yy= 2000+Integer.parseInt(input.substring(0, 2));
			} else{
				System.out.println("뒷자리 첫번째 숫자는 1,2,3,4 중 하나입니다");
				continue start;
			}
			mm = Integer.parseInt(input.substring(2, 4));
			dd = Integer.parseInt(input.substring(4, 6));
			if(mm<1||mm>12) {
				System.out.println("정확한 입력해주세요");
				continue start;
			}
			if(dd<1||dd>31) {
				System.out.println("정확한 입력해주세요");
				continue start;
				
			}
			break;
		}
		System.out.printf("%d년 %d월 %d일 %d세 %s",yy,mm,dd,2023-yy,gender);

		sc.close();








	}

}
